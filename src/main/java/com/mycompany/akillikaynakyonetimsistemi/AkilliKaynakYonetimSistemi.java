/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.akillikaynakyonetimsistemi;

/**
 *
 * @author Yağmur
 */
public class AkilliKaynakYonetimSistemi {

    public static void main(String[] args) {
        UstaKaynakci usta1 = new UstaKaynakci("Deniz", "Yılmaz", 537494889);
        UstaKaynakci usta2 = new UstaKaynakci("Ahmet", "Kaya", 539167893);
        Cirak cirak1 = new Cirak("Selim", "Ekin", 523634729);
        Cirak cirak2 = new Cirak("Efe", "Toprak", 524742704);
        Yonetici yonetici = new Yonetici("Vera", "Aslan", 05360253742);
        Ekipman kaynakMakinesi = new Ekipman("Kaynak Makinesi");
        Ekipman metalLevha=new Ekipman("Metal Levha");
        Ekipman matkap=new Ekipman("matkap");
        Ekipman tornavida=new Ekipman("tornavida");
        Ekipman kaynakMaskesi=new Ekipman("kaynakMaskesi");
        MalzemeTakip malzemeTakip = new MalzemeTakip();
      
        cirak1.setGsm(434892039);
        System.out.println("cirak1 yeni GSM:" + cirak1.getGsm());
        
        usta1.gorevBilgisi();
        cirak1.gorevBilgisi();
        yonetici.gorevBilgisi();
        usta1.isEmriOlustur("Metal levha uzerine kaynak yapilacak.");
        usta2.isEmriOlustur("Matkapla demir delinecek.");
        malzemeTakip.malzemeEkle("Kaynak Teli", 10);
        malzemeTakip.malzemeKullan("Kaynak Teli", 3);
        malzemeTakip.stokGoruntule();
        
        kaynakMakinesi.kullan();
        metalLevha.kullan();
        matkap.kullan();
        tornavida.kullan();
        kaynakMaskesi.kullan();
        cirak1.isTamamla("Metal levha uzerine kaynak yapti", kaynakMakinesi);
        cirak2.isTamamla("Matkapla demiri deldi", matkap);
        yonetici.raporla("Tum kaynak isleri tamamlandi ve kontrol edildi.");
    }
   
   
}
