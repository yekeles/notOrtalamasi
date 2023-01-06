package Giriş;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       int Matematik;
       System.out.print("Matematik Notunu Giriniz = ");
       Matematik = input.nextInt();

       int Fizik;
       System.out.print("Fizik Notunu Giriniz = ");
       Fizik = input.nextInt();

       int Kimya;
       System.out.print("Kimya Notunu Giriniz = ");
       Kimya = input.nextInt();

       int Turkce;
       System.out.print("Turkce Notunu Giriniz = ");
       Turkce = input.nextInt();

       int Tarih;
       System.out.print("Tarih Notunu Giriniz = ");
       Tarih= input.nextInt();

       int Muzik;
       System.out.print("Müzik Notunu Giriniz = ");
       Muzik = input.nextInt();

       int sonuc = ( Matematik + Fizik + Kimya + Muzik + Tarih + Turkce );
       double ortalama = (sonuc / 6);
       System.out.println(ortalama);

       String dersdurumu = (ortalama >= 60) ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
       System.out.println(dersdurumu);


       }
   }