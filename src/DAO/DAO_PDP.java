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
public class DAO_PDP {
    public static ResultSet getdataPDP() {
        String cautruyvan =
            " SELECT p.id_phieudk, p.userkh,p.ngaythue,p.soNgaythue,p.maphong,p.tinhtrang,kh.tenKH,kh.tuoi,kh.gioitinh,kh.sdt,kh.email,kh.soCMND " +
            " FROM dbo.phieudatphong AS p " +
            "INNER JOIN dbo.KH AS kh " +
            " ON p.userkh = kh.userkh ";
        
        return connection.Getdata(cautruyvan);
    }
    public static int xoaphieu(String id){
         String cautruyvan ="DELETE FROM [dbo].[phieudatphong] where id_phieudk='"+id+"'";
         return  connection.ExecuteTruyVan(cautruyvan);
        
    }

    public static void them(DTO.DTO_PHdatphong pt) {
        String cautruyvan = "INSERT INTO [dbo].[phieudatphong] "
                + "           ([userkh] "
                + "           ,[ngaythue] "
                + "           ,[soNgaythue]      "
                + "           ,[tinhtrang]) "
                + "     VALUES "
                + "           ( '"+pt.getUserKH()
                + "'           ,'"+ChuyenDoi.GetDate(pt.getNgaythue())+"' "
                + "           ,"+pt.getSongaythue()+"      "
                + "           ,N'"+pt.getTinhtrang()+"')";
        int kq = connection.ExecuteTruyVan(cautruyvan);
        if (kq > 0) {
            thongbao.thongbao("Gửi thành công", "");
        } else {
            thongbao.thongbao("Gửi không thành công", "");
        }
    }
    public static int setdata(DTO.DTO_PHdatphong p ){
         String cautruyvan ="UPDATE [dbo].[phieudatphong] "
                + "   SET [maphong] =  '" + p.getIdphong()+"' "
                + "      ,[tinhtrang] = N'" + p.getTinhtrang()+"' "
                + "      ,[ngaythue] =  '" + ChuyenDoi.GetDate(p.getNgaythue())+"'"
                + "      ,[soNgaythue] = " + p.getSongaythue()+ " "
                + " WHERE id_phieudk=" + p.getIdphieu();
         return  connection.ExecuteTruyVan(cautruyvan);
        
    }
    public static int settt(String id)
    {
         String cautruyvan ="UPDATE [dbo].[phieudatphong] "
                + "   SET [tinhtrang] =  N'Đã hủy' "
  
                + " WHERE id_phieudk=" +id;
         return  connection.ExecuteTruyVan(cautruyvan);
    }
    
    
}
