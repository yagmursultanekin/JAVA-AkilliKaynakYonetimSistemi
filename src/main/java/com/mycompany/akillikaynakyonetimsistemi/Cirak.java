/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akillikaynakyonetimsistemi;

/**
 *
 * @author Yağmur
 */
public class Cirak extends Calisan{
    public Cirak(String ad,String soyad,int GSM){

        super(ad,soyad,GSM);  
    }
    
    @Override
    public void gorevBilgisi(){
    System.out.println("Cirak ustanin verdigi isleri dogru bir sekilde yerine getirir.");
    }
    
    public void isTamamla(String isDetayi, Ekipman ekipman){
        if (ekipman.isKullanimda()) {
            System.out.println("Cirak " + getAd() + " su isi tamamladi: " + isDetayi);
            ekipman.bosalt();
        } else {
            System.out.println("Ekipman hazir degil! İs tamamlanamadı.");
        }
    }
    
}
