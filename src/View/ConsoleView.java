package View;

import Controller.Controller;
import Models.Product;
import Models.Character;

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
            System.out.println("0. Exit");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5. show c");
            System.out.println("6.add c");
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
                    System.out.println("Enter product ID:");
                    int productID = scanner.nextInt();
                    System.out.println("Enter product name:");
                    scanner.nextLine();
                    String productName = scanner.nextLine();
                    System.out.println("Enter product price:");
                    Integer productPrice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product season:");
                    String productRegion = scanner.nextLine();
                    Product product = new Product(productRegion, productPrice,productName,productID);

                    controller.addProduct(product);

                    break;

                case "2":
                    controller.showProducts();
                    break;

                case "3":
                    controller.showProducts();
                    System.out.println("Enter product ID:");
                    Integer productId = scanner.nextInt();
                    scanner.nextLine();
                    Product prodToDelete = controller.getProductById(productId);
                    controller.deleteProduct(prodToDelete);

                    break;

                case "4":
                    controller.showProducts();
                    System.out.println("Enter product ID:");
                    Integer updatedID = scanner.nextInt();
                    scanner.nextLine();
                    Product prodToUpdate = controller.getProductById(updatedID);
                    System.out.println("Enter new name or press enter to continue");
                    String temp_name2 = scanner.nextLine();
                    String nameProd;
                    if(temp_name2.isEmpty())
                        nameProd = prodToUpdate.getName();
                    else
                        nameProd = temp_name2;

                    System.out.println("Enter new region or press enter to continue");
                    String temp_season = scanner.nextLine();
                    String season;
                    if(temp_season.isEmpty())
                        season = prodToUpdate.getRegion();
                    else
                        season = temp_season;

                    System.out.println("Enter new price or press enter to continue:");
                    String priceInput = scanner.nextLine();
                    int price;
                    if(priceInput.isEmpty())
                        price = prodToUpdate.getPrice();
                    else
                        price = Integer.parseInt(priceInput);


                    Product updatedProd = new Product(season,price,nameProd, prodToUpdate.getId());
                    controller.updateProduct(updatedProd);
                    break;


                case "5":
                    controller.showCharacters();
                    break;


                case "6":
                    System.out.println("Enter client ID:");
                    int clientID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter client name:");
                    String clientName = scanner.nextLine();
                    System.out.println("Enter client address (City):");
                    String clientAddress = scanner.nextLine();

                    Character client = new Character(clientAddress, clientName, clientID);
                    controller.addCharacter(client);
                    break;
                case "7":
                    controller.showCharacters();
                    System.out.println("Enter client ID:");
                    Integer idUpdate = scanner.nextInt();
                    scanner.nextLine();
                    Character charToUpdate= controller.getCharacterById(idUpdate);
                    System.out.println("Enter new name or press enter to continue");
                    String temp_name = scanner.nextLine();
                    String name;
                    if(temp_name.isEmpty())
                        name = charToUpdate.getName();
                    else
                        name = temp_name;
                    System.out.println("Enter new  address or press enter to continue");
                    String temp_address = scanner.nextLine();
                    String address;
                    if(temp_address.isEmpty())
                        address=charToUpdate.getPlace();
                    else
                        address = temp_address;

                    Character updatedClient = new Character( address, name,charToUpdate.getId());
                    controller.updateCharacter(updatedClient);

                case "8":

                    controller.showCharacters();
                    System.out.println("Enter client ID:");
                    Integer clientId = scanner.nextInt();
                    scanner.nextLine();
                    Character clientToDelete = controller.getCharacterByID(clientId);
                    controller.deleteCharacter(clientToDelete);
                    break;
                case "9":
                    System.out.println("prod to client");
                    controller.showCharacters();
                    System.out.println("Enter client ID:");
                    Integer id = scanner.nextInt();
                    scanner.nextLine();
                    controller.showProducts();
                    System.out.println("prod id:");
                    Integer prodId = scanner.nextInt();
                    scanner.nextLine();
                    controller.addProductToClient(id, prodId);

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
