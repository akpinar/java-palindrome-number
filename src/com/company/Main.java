package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("lütfen bir sayı giriniz");

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int basamakKontrol=1,uzunluk=0,toplam = 0,i,basamak;
        int temp = sayi;

        while (basamakKontrol <= sayi) {
            uzunluk++;
            basamakKontrol *= 10;
        }

        for(i=0;i<uzunluk;i++){
            basamak = sayi % 10;
            toplam = (toplam * 10) + basamak;
            sayi = sayi / 10;
        }

        if (temp == toplam){
            System.out.println("palindrom");
        }
        else{
            System.out.println("değil");
        }

    }
}