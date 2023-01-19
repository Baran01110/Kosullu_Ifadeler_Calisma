import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,kim,biyo,turk;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kim = inp.nextInt();

        System.out.print("Biyoloji notunu giriniz : ");
        biyo = inp.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turk = inp.nextInt();

       if((mat >= 0 && mat <= 100) && (fiz >= 0 && fiz <= 100) && (kim >= 0 && kim <= 100) && (biyo >= 0 && biyo <= 100) && (turk >= 0 && turk <= 100)){
        double avarage = (mat + fiz + kim + biyo + turk)/5;
        if(avarage <= 55){
            System.out.println("Sınıfı geçemediniz :( ");

        }else {
            System.out.println("Tebrikler sınıfı geçtiniz :) ");

        }
        System.out.println("Ortalamanız : " + avarage);
    }else{
        System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalıdır.");
    }
}}