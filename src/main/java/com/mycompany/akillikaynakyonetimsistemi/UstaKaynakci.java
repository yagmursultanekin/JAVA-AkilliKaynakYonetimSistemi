/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akillikaynakyonetimsistemi;

/**
 *
 * @author Yağmur
 */
public class UstaKaynakci extends Calisan{
    
    public UstaKaynakci(String ad, String soyad, int GSM){
      super(ad,soyad,GSM);
}
    
    public void isEmriOlustur(String isDetayi){
         System.out.println(getAd() +" Usta"  + " is emri olusturdu: " + isDetayi);
    }
    
     public void isEmriOlustur(String isDetayi,String malzeme,int miktar){
         System.out.println(getAd() +" Usta is emri olusturdu: " + isDetayi + " Kullanilacak malzeme:" +malzeme +"( " +miktar + " adet) ");
    }
     
    @Override
    public void gorevBilgisi(){
      System.out.println("Usta kaynakci ana isleri yapar ve ciragin islerini kontrol eder. ");
    }
    
   
}
