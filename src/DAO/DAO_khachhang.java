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
public class DAO_khachhang {

    public static ResultSet loaiKH() {
        String cautruyvan = "SELECT [maloaiKH] "
                + "      ,[tenloaiKH] "
                + "      ,[mota] "
                + "  FROM [dbo].[loaiKH]";
        return connection.Getdata(cautruyvan);
    }

    public static ResultSet layloaitheoMa(int maloai) {
        String cautruyvan = "SELECT [maloaiKH] "
                + "      ,[tenloaiKH] "
                + "      ,[mota] "
                + "  FROM [dbo].[loaiKH] "
                + "  where maloaiKH =" + maloai;
        return connection.Getdata(cautruyvan);
    }

    public static ResultSet laydulieuKH() {
        String cautruyvan = "SELECT [userkh] "
                + "      ,[tenKH] "
                + "      ,[tuoi] "
                + "      ,[gioitinh] "
                + "      ,[sdt] "
                + "      ,[email] "
                + "      ,[soCMND] "
                + "  FROM [dbo].[KH]";
        return connection.Getdata(cautruyvan);

    }

    public static boolean themKH(DTO.DTO_KH kh) {
        String cautruyvan = "INSERT INTO [dbo].[KH] "
                + "           ([userkh] "
                + "           ,[password] "
                + "           ,[tenKH] "
                + "           ,[gioitinh] "
                + "           ,[sdt] "
                + "           ,[email] "
                + "           ,[soCMND] "
                + "           ,[tuoi] "
                + "          ) "
                + "     VALUES "
                + "           ( '" + kh.getUser() + "' "
                 + "           ,'" + kh.getPassword()+ "' "
                 + "           ,N'" + kh.getName()+ "' "
                + "           ,N'" + kh.getGt()+ "' "
                + "           ,'" + kh.getSdt() + "' "
                + "           ,'" + kh.getEmail()+ "' "
                + "           ,'" + kh.getCMND() + "' "
                   + "        , " + kh.getTuoi()
                + "           )";
        int kq = connection.ExecuteTruyVan(cautruyvan);
        if (kq > 0) {
            thongbao.thongbao("Đăng ký tài khoản thành công", "thông báo");
            return true;
        } else {
            thongbao.thongbao("Đăng ký không thành công", "thông báo");
            return false;
        } 
       
    }

    public static void xoaKH(String maKH) {
        String cautruyvan = "DELETE FROM [dbo].[KH] "
                + "      WHERE userkh='" + maKH+"';";
        int kq = connection.ExecuteTruyVan(cautruyvan);
        if (kq > 0) {
            thongbao.thongbao("xóa thành công", "thông báo");
        } else {
        }
    }

    public static void suaKH(DTO.DTO_KH kh_sua,String maKH) {
        String cautruyvan = "UPDATE [dbo].[KH] "
       //         + "   SET [maloaiKH] =  " + maloaiKH
                + "      ,[tenKH] = N'" + kh_sua.getName()+ "' "
                + "      ,[tuoi] =  " + kh_sua.getTuoi()
                + "      ,[gioitinh] = N'" + kh_sua.getGt()+ "' "
                + "      ,[sdt] = '" + kh_sua.getSdt() + "' "
                + "      ,[soCMND] =N'" + kh_sua.getCMND() + "' "
                + "      ,[ghichu] = N'' "
                + " WHERE maKH=" + maKH;
        int kq = connection.ExecuteTruyVan(cautruyvan);
        if (kq > 0) {
            thongbao.thongbao("sửa thành công", "thông báo");
        } else {
        }
    }

    public static ResultSet timkiemKH(String tukhoa) {
        String cautruyvan = "SELECT [maKH] "
                + "      ,[maloaiKH] "
                + "      ,[tenKH] "
                + "      ,[tuoi] "
                + "      ,[gioitinh] "
                + "      ,[sdt] "
                + "      ,[soCMND] "
                + "      ,[ghichu] "
                + "  FROM [dbo].[KH] "
                + "  where tenKH like N'%" + tukhoa + "%'";
        return connection.Getdata(cautruyvan);
    }
//    ----------------------------------------------------------

    public static ResultSet LoaiKH() {
        String cautruyvan = "SELECT *FROM [dbo].[loaiKH]";
        return connection.Getdata(cautruyvan);
    }

   

  
}
