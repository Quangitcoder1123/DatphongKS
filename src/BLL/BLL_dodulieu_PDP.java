         /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

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
public class BLL_dodulieu_PDP {

    public static void dodulieu(JTable tbl) {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
        Object obj[] = new Object[12];
        ResultSet rs = DAO.DAO_PDP.getdataPDP();
        try {
            while(rs.next()){
              
                obj[0]=rs.getString("id_phieudk");
                obj[1]=rs.getString("userkh");
                obj[2]=rs.getString("ngaythue");
                obj[3]=rs.getString("soNgaythue");
                obj[4]=rs.getString("maphong");
                obj[5]=rs.getString("tinhtrang");
                obj[6]=rs.getString("tenKH");
                obj[7]=rs.getString("tuoi");
                obj[8]=rs.getString("gioitinh");
                obj[9]=rs.getString("sdt");
                obj[10]=rs.getString("email");
                obj[11]=rs.getString("soCMND");
                tblModel.addRow(obj);
            }
        } catch (SQLException ex) {
           
        }
    }
}
