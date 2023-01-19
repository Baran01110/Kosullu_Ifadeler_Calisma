import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Yas,ToplamTutar,YasIndirimi,Mesafe,IndirimliTutar,YolculukTipi,NormalTutar,YasIndirimOrani,GidisGelisIndirimi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz");
        Yas = inp.nextInt();

        System.out.print("Lütfen mesafeyi giriniz, Km türünde olmasına dikkat ediniz.");
        Mesafe = inp.nextInt();

        System.out.print("1 => Tek yön, 2 => Gidiş Dönüş");
        YolculukTipi = inp.nextInt();

        if((Yas >= 0) && (Mesafe >= 0)){
        NormalTutar = Mesafe*(10/100);

            if((Yas < 12) && (YolculukTipi == 1)){
            YasIndirimOrani = 50/100;
            YasIndirimi = NormalTutar*YasIndirimOrani;
                IndirimliTutar = NormalTutar-YasIndirimOrani;
                System.out.println("Toplam Tutar : " + IndirimliTutar);
        } else if ((Yas < 12) && (YolculukTipi == 2)) {
                YasIndirimOrani = 50/100;
                YasIndirimi = NormalTutar*YasIndirimOrani;
                IndirimliTutar = NormalTutar-YasIndirimOrani;
                GidisGelisIndirimi = IndirimliTutar*20/100;
                System.out.println("Toplam Tutar : " + (IndirimliTutar-GidisGelisIndirimi)*2);
            } else if((Yas > 12) && (Yas < 24) && (YolculukTipi == 1)){
            YasIndirimOrani = 10/100;
                YasIndirimi = NormalTutar*YasIndirimOrani;
                IndirimliTutar = NormalTutar-YasIndirimOrani;
                System.out.println("Toplam Tutar : " + IndirimliTutar);
        }else if ((Yas > 12) && (Yas < 24) && (YolculukTipi == 2)){
                YasIndirimOrani = 10/100;
                YasIndirimi = NormalTutar*YasIndirimOrani;
                IndirimliTutar = NormalTutar-YasIndirimOrani;
                GidisGelisIndirimi = IndirimliTutar*20/100;
                System.out.println("Toplam Tutar : " + (IndirimliTutar-GidisGelisIndirimi)*2);
            }
            else if ((Yas > 65) && (YolculukTipi == 1)) {
            YasIndirimOrani = 30/100;
                YasIndirimi = NormalTutar*YasIndirimOrani;
                IndirimliTutar = NormalTutar-YasIndirimOrani;
                System.out.println("Toplam Tutar : " + IndirimliTutar);
        } else if ((Yas > 65) && (YolculukTipi == 2)) {
                YasIndirimOrani = 30/100;
                YasIndirimi = NormalTutar*YasIndirimOrani;
                IndirimliTutar = NormalTutar-YasIndirimOrani;
                GidisGelisIndirimi = IndirimliTutar*20/100;
                System.out.println("Toplam Tutar : " + (IndirimliTutar-GidisGelisIndirimi)*2);

            } else{
            System.out.println("Hatalı Yaş Girdiniz");
        }
        }else {
            System.out.println("Hatalı veri girdiniz");
        }


    }
}