/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.thongbao;

/**
 *
 * @author ADMIN
 */
public class BLL_phong {

   
        public static void xoaphong(String maphong) {
       if(DAO.DAO_phong.xoaphong(maphong)!=1)
        {
            thongbao.thongbao("Thêm phòng thành công", "Thông Báo");
        }
        else{
            thongbao.thongbao("Thêm phòng thành công", "Thông Báo");
        }
               
       
       
    }
    public static boolean addphong(DTO.DTO_room r) {
         if(DAO.DAO_phong.checkmp(r.getMaphong())){ //ma phong ton tai
            thongbao.thongbao("Mã phòng đã tồn tại", "Thông Báo");
             return false;
        }
        return true;
        
    }
    
}
