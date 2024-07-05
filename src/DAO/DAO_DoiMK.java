/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.thongbao;

/**
 *
 * @author ADMIN
 */
public class DAO_DoiMK {

    public static void DoiMK(String tenuser, String passmoi) {
        String cautruyvan = "UPDATE [dbo].[user] "
                + "   SET[password] = N'" + passmoi + "' "
                + "      "
                + " WHERE tenuser =N'" + tenuser + "'";
        int kq = connection.ExecuteTruyVan(cautruyvan);
        if (kq > 0) {
            thongbao.thongbao("Đổi mật khẩu thành công", "thông báo");
        } else {
            thongbao.thongbao("thất bại", "thông báo");
        }
    }
}
