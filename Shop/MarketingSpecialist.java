package Shop;

public class MarketingSpecialist extends Worker{

    private double budget = 5000.0;

    public MarketingSpecialist(Shop workingShop) {
        super(workingShop);
    }

    public void spendMoney(double marketingCampaignCost) {
        if (marketingCampaignCost < 0) {
            throw new IllegalArgumentException("Marketing campaign cost cannot be negative.");
        }
        this.budget -= marketingCampaignCost;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public double calculateTurnover() {
        return budget;
    }
}
