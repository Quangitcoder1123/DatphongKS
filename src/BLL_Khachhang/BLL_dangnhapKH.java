/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL_Khachhang;

import BLL.*;
import DTO.DTO_AD;
import DTO.DTO_KH;

import GUI.thongbao;
import com.sun.jndi.url.dns.dnsURLContext;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class BLL_dangnhapKH {

    public static DTO_KH Doi_MK = new DTO_KH();
public static String hovaten;
    public static boolean Ktra_DN(DTO.DTO_KH DN) {

        if (DN.getUser().trim().equals("") || DN.getPassword().trim().equals("")) {//kt nhập trống dữ liệu
            thongbao.thongbao("vui lòng nhập đủ thông tin ", "thông báo");
            return false;
        }
        ResultSet rs = DAO.DAO_dangnhapKH.Dangnhap(DN.getUser());
        try {
            if (!rs.next()) {//ktra tên dn nhập vào và mk
                thongbao.thongbao("tên đăng nhập không tồn tại", "thông báo");
                System.out.println(DN.getUser());
                return false;
            } else if (rs.getString("password").equals(DN.getPassword())) {//dăng nhập thành công
                Doi_MK.setUser(rs.getString("userkh"));
                Doi_MK.setCMND(rs.getString("soCMND"));
                Doi_MK.setEmail(rs.getString("email"));
                Doi_MK.setGt(rs.getString("gioitinh"));
                Doi_MK.setName(rs.getString("tenKH"));
                Doi_MK.setPassword(rs.getString("password"));
                Doi_MK.setSdt(rs.getString("sdt"));
                Doi_MK.setTuoi( Integer.parseInt(rs.getString("tuoi")));
              
                
                return true;
            } else {
                thongbao.thongbao("mật khẩu không chính xác", "thông báo");
                return false;
            }
        } catch (SQLException ex) {

        }
        
        
        return true;
    }
        public static boolean Ktra_DK(DTO.DTO_KH DN) {

        if (DN.getUser().trim().equals("") || DN.getPassword().trim().equals("")) {//kt nhập trống dữ liệu
            thongbao.thongbao("vui lòng nhập đủ thông tin ", "thông báo");
            return false;
        }
  
        if (DN.getPassword().length()<6) {//kt nhập trống dữ liệu
            thongbao.thongbao("Mật khẩu phải nhiều hơn 6 ký tự", "thông báo");
            return false;
        }
        ResultSet rs = DAO.DAO_dangnhapKH.Dangnhap(DN.getUser());
     
           try {
            if (rs.next()) {//ktra tên dn nhập vào và mk
                thongbao.thongbao("tên đăng nhập đã tồn tại", "thông báo");
                System.out.println(DN.getUser());
                return false;
            }
        } catch (SQLException ex) {
               System.out.println(ex);

        }
        
        
        
        return true;
    }
}
