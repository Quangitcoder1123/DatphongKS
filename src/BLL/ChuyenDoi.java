package BLL;


import GUI.thongbao;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChuyenDoi {
//chuyển đổi từ string->date

    
    static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
   

    public static Date GetDate(String ngay) {
        try {
            return df.parse(ngay);
        } catch (ParseException ex) {
            Logger.getLogger(ChuyenDoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
       
   
    }
    public static Date calendertodate(Calendar cal) {
        cal.add(Calendar.DATE, 0);
       
        return cal.getTime();             

        
        
    }

    //chuyển đổi từ date->string

    public static String GetDate(Date date) {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");          

      

        return format1.format(date); // TODO Auto-generated catch block
   
        
         }
//chuyển đổi định dạng số double -> string
    public static String DinhDangSo(double so){
    return NumberFormat.getNumberInstance().format(so);
    }
    //chuyển từ string-> double
    public static double ChuyenSangSo( String chuSo){
        try {
            return NumberFormat.getNumberInstance().parse(chuSo).doubleValue();
        } catch (ParseException ex) {
            System.out.println("lỗi chuyển số");
            return 0;
        }
    }
}
