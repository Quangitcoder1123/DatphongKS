    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class DAO_dangnhapKH {

    public static ResultSet Dangnhap(String tendangnhap) {
        String cautruyvan = "SELECT *FROM [dbo].[KH] WHERE userkh ='" + tendangnhap + "'";
        return connection.Getdata(cautruyvan);

    }

    public static ResultSet Ktra_trung() {
        String cautruyvan = "SELECT *FROM [dbo].[KH]";
        return connection.Getdata(cautruyvan);
    }
}
