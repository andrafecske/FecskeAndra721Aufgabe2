package Controller;

import Models.Character;
import Models.Product;
import Repo.IRepository;

import java.util.List;

public class Controller {

    private final IRepository<Product> productRepo;
    private final IRepository<Character> characterRepo;

    public Controller(IRepository<Product> repo1, IRepository<Character> repo2) {
        this.productRepo = repo1;
        this.characterRepo = repo2;
        initializeRepository();
    }

    public void initializeRepository() {
        Product product1 = new Product("Malaezia", 12, "Berries", 1);
        Product product2 = new Product("Romania", 15, "Bow", 2);
        Product product3 = new Product("Transilvania", 30, "Arrow", 3);

        Character char1 = new Character("Romania", "Mara", 1);
        Character char2 = new Character("Transilvania", "Nana", 2);
        Character char3 = new Character("Constanta", "Iulia", 3);

        productRepo.create(product1);
        productRepo.create(product2);
        productRepo.create(product3);

        characterRepo.create(char1);
        characterRepo.create(char2);
        characterRepo.create(char3);
    }

    public void addCharacter(Character character) {
        characterRepo.create(character);
    }

    public void addProduct(Product product) {
        productRepo.create(product);
    }

    public void deleteProduct(Product product) {
        productRepo.delete(product.getId());
    }

    public void updateProduct(Product product) {
        productRepo.update(product.getId(), product);
    }

    public List<Product> getProducts() {
        return productRepo.getAll();
    }

    public void showProducts() {
        List<Product> products = productRepo.getAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product getProductById(int id) {
        return productRepo.read(id);
    }

    public Character getCharacterById(int id) {
        return characterRepo.read(id);
    }



    public void deleteCharacter(Character character) {
        characterRepo.delete(character.getId());
    }

    public void updateCharacter(Character character) {
        characterRepo.update(character.getId(), character);
    }

    public List<Character> getCharacters() {
        return characterRepo.getAll();
    }

    public void showCharacters() {
        List<Character> characters = characterRepo.getAll();
       for (Character character : characters) {
           System.out.println(character);
       }
    }

    public Character getCharacterByID(Integer id) {
        return characterRepo.read(id);
    }

    public void addProductToClient(Integer clientID, Integer productID) {
        Character client = characterRepo.read(clientID);
        Product product = getProductById(productID);
        client.getProductList().add(product);

    }






}
