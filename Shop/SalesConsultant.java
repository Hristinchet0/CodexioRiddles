package Shop;

public class SalesConsultant extends Worker{

    private double earnedMoney;

    public SalesConsultant(Shop workingShop) {
        super(workingShop);
    }

    public void sellProduct(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Product price cannot be negative.");
        }
        this.earnedMoney += price;
    }

    public double getEarnedMoney() {
        return earnedMoney;
    }

    public void setEarnedMoney(double earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    @Override
    public double calculateTurnover() {
        return earnedMoney;
    }


}
