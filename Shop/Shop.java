package Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private static Shop instance;

    private List<Worker> workers = new ArrayList<>();

    public static synchronized Shop getInstance() {
        if (instance == null) {
            synchronized (Shop.class) {
                if (instance == null) {
                    instance = new Shop();
                }
            }
        }
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
