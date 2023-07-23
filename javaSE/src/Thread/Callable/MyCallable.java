package javaSE.src.Thread.Callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int sum = 0;

    @Override
    public Integer call() {
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
