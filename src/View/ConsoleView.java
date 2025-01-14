package View;

import Controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private final Controller controller;

    public ConsoleView(Controller controller){
        this.controller = controller;
    }

    public void start() {
        String userChoice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the SportStore!");
        do {
            System.out.println("\nChoose");
            System.out.println("0. ");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4.");
            System.out.println("5. ");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("Please enter your choice: ");

            userChoice = scanner.nextLine();

            switch (userChoice) {

                case "0":
                    System.out.println("Das Programm wird beendet.");
                    break;

                case "1":

                    break;

                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":


                case "6":

                case "7":


                case "8":

                case "9":

                    break;

                case "10":

                    break;

                case "11":

                    break;

                case "12":

                    break;


                case "13":

                    break;

                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie eine gültige Option.");
                    break;

            }
        } while (!userChoice.equals("0"));
    }
}
