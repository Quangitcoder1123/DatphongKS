/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DAO_phong {

    public static ResultSet laydulieuPhong() {
        String cautruyvan = "SELECT *FROM [dbo].[phong]";
        return connection.Getdata(cautruyvan);
    }
     public static ResultSet getlistroomokResultSet(String tt) {
        String cautruyvan = "SELECT maphong FROM [dbo].[phong] where trangthai like N'%"+tt+"%' ";
        return connection.Getdata(cautruyvan);
    }
    
    
    public static ResultSet laydulieu_Theoten(String tenPhong) {
    String cautruyvan="SELECT*FROM [dbo].[phong] where maphong='"+tenPhong+"'";
    return connection.Getdata(cautruyvan);
    }
    public static int xoaphong(String tenPhong) {
        String cautruyvan="DELETE FROM [dbo].[phong] where maphong='"+tenPhong+"'";
        return connection.ExecuteTruyVan(cautruyvan);
    }
    public static int addphong(DTO.DTO_room r) {
        String cautruyvan="INSERT INTO [dbo].[Phong] "
                + "           ([maphong] "
                + "           ,[loai_phong]"
                + "           ,[giaphong] "
		+ "           ,[trangthai]) "
                + "     VALUES "
                + "           ('"+r.getMaphong()+"' "
                + "           ,N'"+r.getLoaiphong()+"' "
                + "           ,"+r.getGiaphong()
		+ "           ,N'"+r.getTinhtrang()+"')";

        return connection.ExecuteTruyVan(cautruyvan);
    }
    public static boolean checkmp(String mp)  {
        String cautruyvan="SELECT*FROM [dbo].[phong] where maphong='"+mp+"'";
        ResultSet rs= connection.Getdata(cautruyvan);
        try {
            if(rs.next())
            return true;
            
        } catch (Exception e) {
            System.out.println("lỗi check mã phòng DAO");
        }
        
        return false;
        
    }
    public static int suattphong(DTO.DTO_PHdatphong p,String tt) {
        String cautruyvan="UPDATE Phong	SET trangthai= N'" +
                                  tt              +
                            "' 	WHERE maphong='" +
                                 p.getIdphong()+
                            "'";
       
           
        return connection.ExecuteTruyVan(cautruyvan);
    }
    
    public static int suaphong(DTO.DTO_room r) {
        String cautruyvan="UPDATE Phong	SET  loai_phong=N'" +
                                r.getLoaiphong()+
                            "',giaphong=" +
                                 r.getGiaphong()         +
                            ",trangthai= N'" +
                                  r.getTinhtrang()                 +
                            "' 	WHERE maphong='" +
                                 r.getMaphong()+
                            "'";
       
           
        return connection.ExecuteTruyVan(cautruyvan);
    }
}
