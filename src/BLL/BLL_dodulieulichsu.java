/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

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
public class BLL_dodulieulichsu {
    public static void dodulieu(JTable tbl){
        DefaultTableModel tblModel= (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
        Object obj[]=new Object[7];
    ResultSet rs=DAO.DAO_lichsu.getdata();
        try {
            while(rs.next()){
                obj[0]=tblModel.getRowCount();
                obj[1]=rs.getString("userkh");
                obj[2]=rs.getString("tenKH");
                obj[3]=rs.getString("maphong");
                obj[4]=rs.getString("ngaythue");
                obj[5]=rs.getString("ngaytra");
                obj[6]=rs.getString("soNgaythue");
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

}
 
