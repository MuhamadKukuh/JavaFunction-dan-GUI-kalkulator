package com.latihan;
import java.util.Scanner;
import com.latihan.function;

public class Main {

    public static void main(String[] args) {

        function myFunction = new function();
//        numberF myNumberFormat = new numberF();

//        My Scanner
        Scanner input = new Scanner(System.in);

        String[][] asw = new String[1][3];

        asw[0][0] = "apa";

//        Luas Lingkaran
        System.out.print("Masukan Jari Jari =");
        float apa = input.nextFloat();
        System.out.println("Hasil = "+myFunction.luasLingkaran(apa)+ "cm");
        System.out.println("keliling lingkaran ="+ myFunction.kelilingLingkaran(apa) + "cm");

//        Luas segitiga
        System.out.print("Masukan Alas Segitiga =");
        float alas = input.nextFloat();

        System.out.print("Masukan tinggi Segitiga =");
        float tinggi = input.nextFloat();

        System.out.println("Hasil = "+ myFunction.luasSegitiga(alas, tinggi)+ "cm");
//        System.out.println("Keliling segitiga");

//        Keliling segitiga
        System.out.print("Masukan a =");
        int aa = input.nextInt();

        System.out.print("Masukan b =");
        int ab = input.nextInt();

        System.out.print("Masukan b =");
        int ac = input.nextInt();

        System.out.println(myFunction.kelilingSegitiga(aa,ab,ac));


//        Luas Persegi
        System.out.print("Masukan Sisi persegi =");
        int sisi = input.nextInt();
        System.out.println("Hasil Luas= "+myFunction.luasPersegi(sisi)+ "cm");
        System.out.println("Keliling persegi adalah = "+myFunction.kelilingPersegi(sisi)+ "cm");

        //        Luas Persegi Panjang
        System.out.print("Masukan panjang persegi panjang =");
        int panjang = input.nextInt();

        System.out.print("Masukan lebar persegi panjang =");
        int lebar = input.nextInt();

        System.out.println("Hasil = "+myFunction.luasPersegiPanjang(panjang, lebar)+ "cm");
        System.out.println("Hasil Keliling persegi panjang= "+myFunction.kelilingPersegiPanjang(panjang, lebar)+ "cm");


//      Tugas

        System.out.print("Masukan Nama = ");
        String nama = input.next();
        System.out.print("Masukan Umur = ");
        String Umur = input.next();
        System.out.print("Masukan Gaji Perbulan = ");
        int Gaji = input.nextInt();

        System.out.println("Nama = "+ nama);
        System.out.println("Umur = "+ Umur);

//        Function
        System.out.println("Gaji Saya perbulan adalah Rp " + myFunction.gajiSaya(Gaji));
        myFunction.convert(Gaji);
        myFunction.gajiPertahun(Gaji);

        System.out.print("Berapakah gaji saya dalam 3 tahun kedepan? ");
        int game = input.nextInt();

        myFunction.tebakGaji(game, Gaji);



    }

    static int asw(int a, int b){
        int hasil = a * b;

        return hasil;
    }


}



//      Casting
//    int da = 30;
//
//       String apa = String.valueOf(da);
//
//       int asem = Integer.parseInt(apa);
//
//       Float aaa = (float)asem;
//
//        System.out.println(aaa);
//
//        System.out.println(apa);
