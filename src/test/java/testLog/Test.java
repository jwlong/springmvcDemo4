package testLog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by longjinwen on 12/09/2017.
 */
public class Test {
   // private static  Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Test.class);
        if(logger.isDebugEnabled()){
            logger.debug("test ...");
        }
    }
}
