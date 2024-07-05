/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL_Khachhang;

import BLL.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class BLL_dodulieupupcb {

    public static void dodulieu(JTable tbl,DTO.DTO_KH kh) {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
        Object obj[] = new Object[4];
        ResultSet rs = DAO.DAO_lsdpKH.getdata(kh.getUser());
        try {
            while(rs.next()){
              
                obj[0]=tblModel.getRowCount()+1;
                obj[1]=rs.getString("id_phieudk");
                obj[2]=rs.getString("ngaythue");
                obj[3]=rs.getString("soNgaythue");
                tblModel.addRow(obj);
            }
        } catch (SQLException ex) {
           
        }
    }
}
