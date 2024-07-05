/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GUI.thongbao;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAO_user {

    public static ResultSet layUser() {
        String cautruyvan = "SELECT *FROM [dbo].[user]";
        return connection.Getdata(cautruyvan);
    }

    public static ResultSet layUser_theoTen(String tendangnhap) {
        String cautruyvan = "SELECT *FROM [dbo].[user] where tenuser =N'" + tendangnhap + "'";
        return connection.Getdata(cautruyvan);
    }

    public static void UPdateuser(String tendangnhap, String hovaten, String pass2, String email, String quyen) {
        String cautruyvan = "UPDATE [dbo].[user] "
                + "   SET  "
                + "      [password] = N'" + pass2 + "' "
                + "      "
                + "       "
                + "      ,[role] = N'" + quyen + "' "
                + "      ,[hovaten] = N'" + hovaten + "' "
                + "      ,[email] =N'" + email + "' "
                + " WHERE tenuser=N'" + tendangnhap + "'";
        int kq = connection.ExecuteTruyVan(cautruyvan);
        if (kq > 0) {
            thongbao.thongbao("Sửa thành công", "thông báo");
        } else {
        }
    }

    public static void Xoauser(String tenUser) {
        String cautruyvan = "DELETE FROM [dbo].[user] "
                + "      WHERE tenuser=N'"+tenUser+"'";
        int kq=connection.ExecuteTruyVan(cautruyvan);
        if (kq>0) {
            thongbao.thongbao("Xóa thành công", "thông báo");
        }else{
         thongbao.thongbao("Xóa  KHÔNG thành công", "thông báo");
        }
    }
}
