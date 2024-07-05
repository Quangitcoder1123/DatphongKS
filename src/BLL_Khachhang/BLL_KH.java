/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL_Khachhang;

import BLL.*;
import GUI.thongbao;

/**
 *
 * @author ADMIN
 */
public class BLL_KH {

    public static boolean ktKH(DTO.DTO_KH kh) {
        if (kh.getName().trim().equals("")) {
            thongbao.thongbao("không để trống tên khách hàng", "Thông Báo");
            return false;

        }
        if (kh.getTuoi() < 3) {
            thongbao.thongbao("sai tuổi", "Thông Báo");
            return false;

        }
        String sdttest = "[0-9]{10}";
        String cmndtest = "[0-9]{9,12}";
        String emailtest="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        if (!kh.getSdt().matches(sdttest)) {
            if (kh.getSdt().length()!=10) {
            thongbao.thongbao("sdt có 10 số", "Thông Báo");
            return false;
            
            }
            thongbao.thongbao("nhập số vào sdt", "Thông Báo");
            return false;

        }
        if(!kh.getEmail().matches(emailtest))
        {
            thongbao.thongbao("Email nhập sai định dạng", "Thông Báo");
            return false;
        }
        if (!kh.getCMND().matches(cmndtest)) {
           
            thongbao.thongbao("nhập số vào CMND", "Thông Báo");
            return false;

        }
        else
         if ((kh.getCMND().length()==11)||(kh.getCMND().length()==10)) {
            thongbao.thongbao("Số CMND/CCCD bị sai", "Thông Báo");
            return false;
        }
        
        
        return true;

    }
    
}
