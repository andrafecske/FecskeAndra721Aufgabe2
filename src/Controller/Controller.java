package Controller;

import Repo.IRepository;

public class Controller {

    private final IRepository<> repo1;
    private final IRepository<> repo2;

    public Controller(IRepository<> repo1, IRepository<> repo2) {
        this.repo1 = repo1;
        this.repo2 = repo2;
        initializeRepository();
    }

    public void initializeRepository() {

    }
}
