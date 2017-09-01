package learns;

import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by longjinwen on 2017/5/3.
 */
public class Task2 extends TimerTask {
    ReentrantLock lock = new ReentrantLock();
    public void run() {
        lock.lock();
        try {
            System.out.println("task2 开始sleep秒");
            Thread.sleep(1500);
            System.out.println("task2 sleep 1.5秒后执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
