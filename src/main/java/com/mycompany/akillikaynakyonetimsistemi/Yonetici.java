/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akillikaynakyonetimsistemi;

/**
 *
 * @author Yağmur
 */
public class Yonetici extends Calisan {
    public Yonetici(String ad,String soyad,int GSM){
        super(ad,soyad,GSM);
        
    }
    
    @Override
    public void gorevBilgisi(){
        System.out.println("Yonetici calisanlari ve yaptiklari isleri kontrol eder sonrasinda rapor yazar.");
    }
    
    public void raporla(String raporDetayi){
        System.out.println("Yonetici " + getAd() +" " + getSoyad() +" isleri kontrol etti ve rapor yazdi:" +raporDetayi);
    }
}
