import java.util.Scanner;


public class SınıfGeçmeNotu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat,fizik,kimya,biyo,türkçe,matS,fizikS,kimyaS,biyoS,türkçeS,sonuc;
        System.out.println("Matematik Notunu Giriniz:");
        mat = input.nextInt();
        System.out.println("Matematik ders saatini Giriniz:");
        matS = input.nextInt();
        System.out.println("Kimya Notunu Giriniz:");
        kimya = input.nextInt();
        System.out.println("Kimya ders saatini Giriniz:");
        kimyaS = input.nextInt();
        System.out.println("Biyoloji Notunu Giriniz:");
        biyo = input.nextInt();
        System.out.println("Biyoloji ders saatini Giriniz:");
        biyoS = input.nextInt();
        System.out.println("Türkçe Notunu Giriniz:");
        türkçe = input.nextInt();
        System.out.println("türkçe ders saatini Giriniz:");
        türkçeS = input.nextInt();

        sonuc = ((mat * matS) + (kimya * kimyaS) + (biyo * biyoS) + (türkçe * türkçeS)) / (matS + kimyaS + biyoS + türkçeS);
        System.out.println("Ortalamanız :"+ sonuc);

        if(sonuc >=85){
            System.out.println("Çok iyisin");
        }if(sonuc <=84 && sonuc >=70){
            System.out.println("İyisin");
        }if(sonuc <=69 && sonuc >=55){
            System.out.println("Orta derecede iyisin");
        }if(sonuc <=54 && sonuc >=50){
            System.out.println("Geçer seviyedesin daha fazla çalış");
        }else{
            System.out.println("Sınıfta kaldın");
        }







    }
}
