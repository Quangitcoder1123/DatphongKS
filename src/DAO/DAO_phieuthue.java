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
public class DAO_phieuthue {

    public static void them(DTO.DTO_phieuthue pt) {
        String cautruyvan = "INSERT INTO [dbo].[phieuthue] "
                + "           ([maphong] "
                + "           ,[tenphong] "
                + "           ,[tennhanvien]      "
                + "           ,[giaPhong] "
                + "           ,[tenKH] "
                + "           ,[tuoi] "
                + "           ,[sdt] "
                + "           ,[soCMND] "
                + "           ,[ngaythue]) "
                + "     VALUES "
                + "           ( "+pt.getMaphong()
                + "           ,N'"+pt.getTenphong()+"' "
                + "           ,N'"+pt.getTenuser()+"'      "
                + "           , "+pt.getGiaphong()
                + "           ,N'"+pt.getTenKH()+"' "
                + "           , "+pt.getTuoi()
                + "           ,'"+pt.getSdt()+"' "
                + "           ,'"+pt.getCMND()+"' "
                + "           ,'"+pt.getNgaythue()+"')";
        int kq = connection.ExecuteTruyVan(cautruyvan);
        if (kq > 0) {
            thongbao.thongbao("ok", "");
        } else {
            thongbao.thongbao("NOT ok", "");
        }
    }
    
    
}
