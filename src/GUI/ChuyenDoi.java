package GUI;


import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChuyenDoi {
//chuyển đổi từ string->date

  
 

   static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
   

    public static String GetDate(Date date) {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");          

      

        return format1.format(date); // TODO Auto-generated catch block
   
        
         }
    //chuyển đổi từ date->string

    public static String GetDate2(Date date) {
        return df.format(date);
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
