/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BLL.ChuyenDoi;
import GUI.thongbao;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAO_lsdpKH {
    public static ResultSet getdata(String userkh) {
        String cautruyvan =
            " SELECT id_phieudk,ngaythue,soNgaythue " +
            " FROM dbo.phieudatphong  " +
            "where userkh='"+userkh+"' and tinhtrang=N'Đang Chờ' ";
        System.out.println(cautruyvan);
        return connection.Getdata(cautruyvan);

    }
     public static ResultSet huyphieu(String maphieu) {
        String cautruyvan =
            " UPDATE phieudatphong " +
                "SET tinhtrang = N'Đã hủy' "+
                "WHERE id_phieudk ="+maphieu;
        System.out.println(cautruyvan);
        return connection.Getdata(cautruyvan);

    }
    
    
}
