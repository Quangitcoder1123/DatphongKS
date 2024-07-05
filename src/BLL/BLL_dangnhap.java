/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DTO_AD;

import GUI.thongbao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class BLL_dangnhap {

    public static DTO_AD Doi_MK = new DTO_AD();
public static String hovaten;
    public static boolean Ktra_DN(DTO.DTO_AD DN) {

        if (DN.getUser().trim().equals("") || DN.getPassword().trim().equals("")) {//kt nhập trống dữ liệu
            thongbao.thongbao("vui lòng nhập đủ thông tin ", "thông báo");
            return false;
        }
        ResultSet rs = DAO.DAO_dangnhap.Dangnhap(DN.getUser());
        try {
            if (!rs.next()) {//ktra tên dn nhập vào và mk
                thongbao.thongbao("tên đăng nhập không tồn tại", "thông báo");
                return false;
            } else if (rs.getString("password").equals(DN.getPassword())) {//dăng nhập thành công
                Doi_MK.setNameuserString(rs.getString("hovaten"));
                Doi_MK.setPassword(rs.getString("password"));
                Doi_MK.setUser(rs.getString("tenuser"));
                 hovaten=rs.getString("hovaten");
            } else {
                thongbao.thongbao("mật khẩu không chính xác", "thông báo");
                return false;
            }
        } catch (SQLException ex) {

        }
        
        
        return true;
    }
}
