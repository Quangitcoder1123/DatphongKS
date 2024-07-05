/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO_khachhang;

import DTO.*;
import java.util.Date;

/**
 *
 * @author HP
 */
public class DTO_PHdatphong {
    private String idphieu;
    private String userKH;
    private Date ngaythue;
    private int songaythue;
    private String idphong;
    private String tinhtrang="Đang Chờ";

    public String getIdphieu() {
        return idphieu;
    }

    public String getIdphong() {
        return idphong;
    }

    public Date getNgaythue() {
        return ngaythue;
    }

    public int getSongaythue() {
        return songaythue;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public String getUserKH() {
        return userKH;
    }

    public void setIdphieu(String idphieu) {
        this.idphieu = idphieu;
    }

    public void setIdphong(String idphong) {
        this.idphong = idphong;
    }

    public void setNgaythue(Date ngaythue) {
        this.ngaythue = ngaythue;
    }

    public void setSongaythue(int songaythue) {
        this.songaythue = songaythue;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public void setUserKH(String userKH) {
        this.userKH = userKH;
    }

    public void setNgaythue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
