import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double  kilo, boy;
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy= input.nextDouble();
        double indeks = kilo/(boy*boy);
        System.out.print("Boy kilo indeksiniz: "+ indeks);