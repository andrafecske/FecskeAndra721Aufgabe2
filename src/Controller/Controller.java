package Controller;

import Models.Character;
import Models.Product;
import Repo.IRepository;

import java.util.Comparator;
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
        Character char4 = new Character("Romania", "Mara", 4);

        productRepo.create(product1);
        productRepo.create(product2);
        productRepo.create(product3);

        characterRepo.create(char1);
        characterRepo.create(char2);
        characterRepo.create(char3);
        characterRepo.create(char4);

        addProductToClient(1,1);
        addProductToClient(2,1);
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

    /**
     *
     * @param place
     * filters clients by place they come from
     */

    public void filterByPlace(String place) {
        List<Character> chars= characterRepo.getAll();
        chars.stream()
                .filter(character -> character.getPlace().equals(place))
                .forEach(System.out::println);
    }

    /**
     *  filters clients by prpoduct purchased
     * @param prodID
     */

    public void filterByProd(Integer prodID){
        List<Character> chars= characterRepo.getAll();
        chars.stream()
                .filter(character -> character.getProductList()
                        .stream()
                        .anyMatch(product -> product.getId().equals(prodID)))
                .forEach(System.out::println);
    }

    /**
     *
     * @param charId
     * @param ascOrDesc
     * sorts a clients prods by price
     */

    public void filterProdByPrice(Integer charId, String ascOrDesc){
       Character charr= characterRepo.read(charId);
        List<Product> prods = charr.getProductList();
        if(ascOrDesc.equals("asc")){
            prods.stream()
                    .sorted(Comparator.comparing(Product::getPrice))
                    .forEach(System.out::println);
        }
        else
            prods.stream()
                    .sorted((Comparator.comparing(Product::getPrice).reversed()))
                    .forEach(System.out::println);
    }



}
