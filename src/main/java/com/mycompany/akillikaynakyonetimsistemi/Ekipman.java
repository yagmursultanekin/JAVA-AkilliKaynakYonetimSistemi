/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akillikaynakyonetimsistemi;

/**
 *
 * @author Yağmur
 */
public class Ekipman {
    private String isim;
    private boolean kullanimda;
    
    public Ekipman(String isim){
        this.isim=isim;
        this.kullanimda=false;
    }
    
    public void kullan(){
        this.kullanimda=true;
        System.out.println(isim + " ekipmani kullanimdadir");
    }
    
      public void kullan(int saat){
        this.kullanimda=true;
        System.out.println(isim + " ekipmani " +saat + " saat boyunca kullanima alindi.");
    }
      
    public void kullanimDisiBirak(){
        this.kullanimda=false;
        System.out.println(isim + "ekipmani kullanim disi birakildi");
        
    }
    public boolean isKullanimda(){
        return kullanimda;
    }

    void bosalt() {
           if (kullanimda) {
        kullanimda = false;
        System.out.println(isim + " kullanim disi birakildi.");
    } else {
        System.out.println(isim + " zaten kullanim disi.");
    }
    }
    }
    
