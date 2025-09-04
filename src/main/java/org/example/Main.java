package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        bankKunder kund1 = new bankKunder("Kevin", "Rådstuguvägen 3", "0704201143", 1900);
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

    while (isRunning) {
        System.out.println("Vad vill du göra?");
        System.out.println("1. Sätta in pengar");
        System.out.println("2. Ta ut pengar");
        System.out.println("3. Avsluta");

        String choice = scanner.nextLine();
        switch (choice) {

            case "1":
                System.out.println("Hur mycket vill du sätta in?");
                int insättning = Integer.parseInt(scanner.nextLine());
                kund1.deposit(insättning);
                System.out.println("Nytt saldo: " + kund1.getSaldo());
                pauseHelper();
                break;
            case "2":
                System.out.println("Hur mycket vill du ta ut?");
                int uttag = Integer.parseInt(scanner.nextLine());
                kund1.withdraw(uttag);
                System.out.println("Nytt saldo: " + kund1.getSaldo());
                break;
            case "3":
                System.out.println("Avslutar programmet...");
                isRunning = false;
                break;
            default:
                System.out.println("Fel val!");

        }


        //MELINA ÄR BÄST
    }










    }



    public static void pauseHelper() {
        System.out.println("Klicka på en tangent för att fortsätta! ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }




}