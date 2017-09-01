package learns;

import com.sun.javafx.tk.Toolkit;
import org.junit.Test;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by longjinwen on 2017/5/3.
 */
public class RefClassTest {
    public static final long MINUTES_IN_MS = 1000 * 60;
//    @Test
//    public void test1(){
//        try {
//         Class<?> refModal =   Class.forName("learns.RefModal");
//            try {
//                System.out.println(refModal.newInstance());
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
public static void main(String[] args) throws Exception {

//    Timer timer = new Timer();
//    timer.schedule(new Task1(),new Date());
    //Timer timer = new Timer();
    //timer.schedule(new Task1(),new Date());
    timerPoint(new Task1(),"13:57");
    timerPoint(new Task2(),"13:57");
    //timerPoint(new Task2(),"09:16");
}

//    @Test
//    public void test2(){
//        String time = "19:38";
//        try {
//            timerPoint("learns.Task1",time);
//          //  timerPoint("learns.Task2",time);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    private  static void timerPoint(String taskClassName,String mutilTime)throws Exception{
        String timeArray[] = mutilTime.split(",");
        Timer timer = new Timer();
        for (String time : timeArray){
            String timeHM[] = time.split(":");
            Calendar taskDateTime = Calendar.getInstance();
            Calendar currentDateTime = Calendar.getInstance();
            taskDateTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(timeHM[0].trim()));
            taskDateTime.set(Calendar.MINUTE, Integer.parseInt(timeHM[1].trim()));
            taskDateTime.clear(Calendar.SECOND);
            currentDateTime.clear(Calendar.SECOND);
            if (taskDateTime.before(currentDateTime)){
                taskDateTime.add(Calendar.DAY_OF_YEAR, 1);
            }
            TimerTask task = (TimerTask)Class.forName(taskClassName).newInstance();
            System.out.println(taskDateTime.getTime());
            timer.scheduleAtFixedRate(task, taskDateTime.getTime(), MINUTES_IN_MS * 1440);
        }
    }


    private  static void timerPoint(TimerTask task, String mutilTime)throws Exception{
        String timeArray[] = mutilTime.split(",");
        Timer timer = new Timer();
        for (String time : timeArray){
            String timeHM[] = time.split(":");
            Calendar taskDateTime = Calendar.getInstance();
            Calendar currentDateTime = Calendar.getInstance();
            taskDateTime.set(Calendar.HOUR_OF_DAY, Integer.parseInt(timeHM[0].trim()));
            taskDateTime.set(Calendar.MINUTE, Integer.parseInt(timeHM[1].trim()));
            taskDateTime.clear(Calendar.SECOND);
            currentDateTime.clear(Calendar.SECOND);
            if (taskDateTime.before(currentDateTime)){
                taskDateTime.add(Calendar.DAY_OF_YEAR, 1);
            }
           // TimerTask task = (TimerTask)Class.forName(taskClassName).newInstance();
            System.out.println(taskDateTime.getTime());
            timer.scheduleAtFixedRate(task, taskDateTime.getTime(), MINUTES_IN_MS * 1440);
        }
    }
}
