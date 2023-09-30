package Shop;

public class Worker {

    private Shop workingShop;

    public Worker(Shop workingShop) {
        this.workingShop = workingShop;
    }

    public Shop getWorkingShop() {
        return workingShop;
    }

    public double calculateTurnover() {
        return 0;
    }
}
