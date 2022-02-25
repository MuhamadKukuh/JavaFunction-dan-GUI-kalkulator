package com.latihan;

import java.text.NumberFormat;
import java.util.Locale;

class numberF{
    static String numberFt(int a){
        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "UK"));
        String format = nf.format(a);
//        System.out.println(format);
        return format;
    }
}

public class function extends numberF {
    public void tebakGaji(int a, int b){
        int tebakan = b * 12 * 3;

        if (a == tebakan){
            System.out.println("Selamat tebakan Anda Benar");
        }else{
            System.out.println("Sayang sekali tebakan anda kurang tepat hehe");
        }


    }

    public float luasLingkaran(float r){
//        float rumus = (float) 3.14;
        float a = (float) (3.14 * r * r);

        return  a;
    }

    public float kelilingLingkaran(float r){
        float hasil = (float) (2 * 3.14 * r);

        return hasil;
    }

    public float luasSegitiga(float a, float b){
        float hasil = (float) (0.5 * a * b);

        return hasil;
    }

    public int kelilingSegitiga(int a, int b, int c){
        int hasil = a + b + c;
        return hasil;
    }

    public int luasPersegi(int a){
        int hasil = a * a;
        return hasil;
    }

    public int kelilingPersegi(int a){
        int hasil = 4 * a;

        return hasil;
    }

    public int luasPersegiPanjang(int p, int l){
        int hasil = p * l;

        return hasil;
    }

    public int kelilingPersegiPanjang(int p, int l){
        int hasil = 2 * (p + l);
        return hasil;
    }

    public void gajiPertahun(int a){
        int pertahun = a * 12;

        String format = numberFt(pertahun) ;

        System.out.println("Gaji saya pertahun adalah = Rp "+ format);
    }

    public String gajiSaya(int a){
//      int gaji = numberF(a);
        return numberFt(a);
    }

    public void convert(int a){
        Double f = Double.parseDouble(String.valueOf(a));
        Double dolar = f / 14000;
        System.out.println("Gaji saya dalam bentuk Dolar adalah $ "+ dolar);
    }

    public String[] cobaArray(String[] array){
        String[] nama = array;
        return nama;
    }
}
