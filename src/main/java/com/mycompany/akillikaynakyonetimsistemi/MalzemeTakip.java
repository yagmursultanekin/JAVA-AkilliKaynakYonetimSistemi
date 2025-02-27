/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akillikaynakyonetimsistemi;

import java.util.ArrayList;

/**
 *
 * @author Yağmur
 */
public class MalzemeTakip {
     private ArrayList<Malzeme> malzemeler;

    public MalzemeTakip() {
        malzemeler = new ArrayList<>();
    }

    public void malzemeEkle(String isim, int miktar) {
        for (Malzeme malzeme : malzemeler) {
            if (malzeme.getIsim().equals(isim)) {
                malzeme.miktarEkle(miktar);
                return;
            }
        }
        malzemeler.add(new Malzeme(isim, miktar));
        System.out.println(isim + " stoga yeni eklendi. Miktar: " + miktar);
    }

public void malzemeKullan(String isim, int miktar) {
     for (Malzeme malzeme : malzemeler) {
       if (malzeme.getIsim().equals(isim)) {
          try {
             malzeme.miktarAzalt(miktar);
          } catch (MalzemeYetersizException e) {
          System.out.println("Hata: " + e.getMessage());
        }
      return;
     }
   }
        System.out.println(isim + " stoka eklenmemis!");

 }
    public void stokGoruntule() {
        System.out.println("Stok Durumu:");
        for (Malzeme malzeme : malzemeler) {
            System.out.println("- " + malzeme.getIsim() + ": " + malzeme.getMiktar());
        }
    }
}
