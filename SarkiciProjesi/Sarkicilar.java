package SarkiciProjesi;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkici_Listesi = new ArrayList<String>();

    public void sarkicilari_Bastir(){

        System.out.println("Şarkıcı Listesinde " + sarkici_Listesi.size() + " kadar şarkıcı var ");

        for (int i=0;i<sarkici_Listesi.size();i++){
            System.out.println((i+1) + ".Şarkıcı : " + sarkici_Listesi.get(i));
        }
    }

    public void sarkici_ekle(String isim){

        sarkici_Listesi.add(isim);

        System.out.println("Şarkıcı Listesi Güncellendi...");

    }

    public void sarkici_guncelle(String yeni_isim, int pozisyon){

        sarkici_Listesi.set(pozisyon,yeni_isim);
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }

    public void sarkici_sil(int pozisyon){

        String isim = sarkici_Listesi.get(pozisyon);

        sarkici_Listesi.remove(pozisyon);

        System.out.println(isim + " isimli şarkıcı listeden çıkarılmıştır");
    }

    public void sarkici_ara(String sarkici_ismi){
        int pozisyon=sarkici_Listesi.indexOf(sarkici_ismi);
        if (pozisyon >=0 ){
            System.out.println("Şarkıcı Bulundu");
            System.out.println(sarkici_ismi+ " isimli şarkıcı" + (pozisyon+1) + " pozisyonda");
        }
        else {
            System.out.println("Şarkıcı bulunamadı");
        }
    }

}
