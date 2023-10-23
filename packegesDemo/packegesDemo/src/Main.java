import matematik.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İsminizi Giriniz : ");

        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(1,2);
        Logaritma logaritma = new Logaritma();
    }
}