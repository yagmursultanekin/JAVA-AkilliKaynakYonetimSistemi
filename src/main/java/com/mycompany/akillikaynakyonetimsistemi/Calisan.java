/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akillikaynakyonetimsistemi;

/**
 *
 * @author Yağmur
 */
public abstract class Calisan {
    private String ad;
    private String soyad;
    private long GSM;
    
    
    public abstract void gorevBilgisi();
    
    public Calisan(String ad,String soyad,long GSM){
        this.ad=ad;
        this.soyad=soyad;
        this.GSM=GSM;
        setGsm(GSM);
        
    
}
    public String getAd(){return ad; }
    public String getSoyad(){return soyad;}
    public long getGsm(){return GSM;}
    
    public void setGsm(long GSM) {
        if (String.valueOf(GSM).length() == 9) {  
            this.GSM = GSM;
        } else {
            System.out.println("Hata: Gecersiz GSM numarasi.");
        }
    }
    
    
}
