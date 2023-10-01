package Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private static Shop instance = new Shop();

    private List<Worker> workers = new ArrayList<>();

    private Shop() {
    }
    
    public static Shop getInstance() {
        return instance;
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    public double getTurnover() {
        double turnover = 0.0;
        for (Worker worker : this.workers) {
            turnover += worker.calculateTurnover();
        }
        return turnover;
    }
}
