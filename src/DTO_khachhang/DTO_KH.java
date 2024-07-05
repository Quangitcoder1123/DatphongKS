/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO_khachhang;

import DTO.*;
import java.util.Set;

/**
 *
 * @author HP
 */
public class DTO_KH {
    private String user;
    private String password;
    private String name;
    private int tuoi;
    private String gt;
    private String sdt;
    private String email;
    private String CMND ;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCMND() {
        return CMND;
    }

    public String getEmail() {
        return email;
    }

    public String getGt() {
        return gt;
    }

    public String getName() {
        return name;
    }



    public String getSdt() {
        return sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getUser() {
        return user;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
