/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class scaleimg {
    public static ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
       

        return new ImageIcon(icon.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
    }
    
}
