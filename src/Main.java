import Repo.InMemoryRepository;
import View.ConsoleView;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        InMemoryRepository<> repo1 = new InMemoryRepository<>();
        InMemoryRepository<> repo2= new InMemoryRepository<>();

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller(repo1, repo2);
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.start();
        scanner.close();
    }
}