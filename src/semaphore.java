import java.util.*;

public class semaphore {
    private int bound = 0;

    public semaphore(int upperBound) {
        this.bound = upperBound;
    }

    public synchronized void acquire() throws InterruptedException {
        if (bound > 0) {
            bound--;
        } else {
            wait();
        }
    }

    public synchronized void release() {
        if (bound <= 0) {
            notify();
        } else {
            bound++;
        }
    }
}

