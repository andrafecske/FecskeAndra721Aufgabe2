import Models.Character;
import Models.Product;
import Repo.InMemoryRepository;
import View.ConsoleView;
import Controller.Controller;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        InMemoryRepository<Product> repo1 = new InMemoryRepository<Product>();
        InMemoryRepository<Character> repo2= new InMemoryRepository<Character>();

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller(repo1, repo2);
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.start();
        scanner.close();
    }
}