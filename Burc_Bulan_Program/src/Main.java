import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        int month,day;
        String burc = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay : ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        day = inp.nextInt();

        if(month == 1){
            if((day >= 1) && (day <= 31)){
            if(day < 22){
                burc = "Oğlak";
            }else {
                burc = "Kova";
            }}else{
               isError = true;
            }
        }
        if(month == 2){
            if((day >= 1) && (day <= 30)){
                if(day < 20){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }}else{
                isError = true;
            }

        }
        if(month == 3){
            if((day >= 1) && (day <= 31)){
                if(day < 21){
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }}else{
                isError = true;
            }
        }
        else{
            isError = true;
        }
        if (isError){
            System.out.println(" Burcunuz : " + burc);
        }else {
            System.out.println("Hatalı giriş, tekrar deneyin");
        }
    }

}