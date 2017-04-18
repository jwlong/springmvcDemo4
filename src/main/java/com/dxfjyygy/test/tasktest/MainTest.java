package com.dxfjyygy.test.tasktest;

import org.junit.Test;

import java.util.Timer;

/**
 * Created by longjinwen on 2017/3/22.
 */
public class MainTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new PrintTask(),1000,2000);

    }
}
