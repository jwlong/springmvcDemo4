package learns;

import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by longjinwen on 2017/5/3.
 */
public class Task1 extends TimerTask {
    ReentrantLock lock = new ReentrantLock();
    public void run() {
        try {
            lock.lock();
            System.out.println("开始sleep秒");
           Thread.sleep(10000);
           System.out.println("task1 sleep 10 秒后执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
