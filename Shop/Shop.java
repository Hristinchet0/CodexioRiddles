package Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Worker> workers = new ArrayList<>();

    private static final class InstanceHolder {
        private static final Shop instance = new Shop();
    }

    public static synchronized Shop getInstance() {
        return InstanceHolder.instance;
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
