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
public class DAO_lichsu {
    public static ResultSet getdata() {
        String cautruyvan ="select KH.userkh,KH.tenKH,pdp.maphong,pdp.ngaythue,Dateadd(day,pdp.soNgaythue-1,pdp.ngaythue) as 'ngaytra',pdp.soNgaythue " +
                "from dbo.phieudatphong as pdp " +
                "inner join KH on  pdp.userkh=KH.userkh";
        
        return connection.Getdata(cautruyvan);
    }
   
    
    
}
