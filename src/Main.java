import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int a , b, c;
       System.out.println("A değerini giriniz :");
       a = scanner.nextInt();
        System.out.println("B değerini giriniz :");
        b = scanner.nextInt();
        System.out.println("C değerini giriniz :");
        c = scanner.nextInt();
       int sonuc = AritmetikIslem(a,b,c);
        System.out.println("Total :" + sonuc);
    }
     static int AritmetikIslem(int a, int b, int c){

        int total = 0;
        total = a+b*c-b;
        return total;





    }

}

