/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL_Khachhang;

import BLL.*;
import GUI.thongbao;
import java.lang.invoke.MethodHandles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class BLL_Phong {
    public static void dodulieuPhong(JTable tbl){
        DefaultTableModel tblModel= (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
        Object obj[]=new Object[5];
    ResultSet rs=DAO.DAO_phong.laydulieuPhong();
        try {
            while(rs.next()){
                obj[0]=tblModel.getRowCount();
                obj[1]=rs.getString("maphong");
                obj[2]=rs.getString("loai_phong");
                obj[3]=rs.getString("giaphong");
               obj[4]=rs.getString("trangthai");
                tblModel.addRow(obj);
            }   } catch (SQLException ex) {
            thongbao.thongbao("lỗi đổ dữ liệu", "thông báo");
        }
    }
    public static String[] listroomok(String tt)
    {
        
       
         Vector<String> vector = new Vector<String>();
            ResultSet rs=DAO.DAO_phong.getlistroomokResultSet(tt);
        try {
            while(rs.next()){
                vector.add(rs.getString("maphong"));
            }
          
        }
        catch (Exception e)
        {
            
        }
       return  vector.toArray(new String[vector.size()]);
    }
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
 
