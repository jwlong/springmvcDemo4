package com.dataStructure.partice;

import java.util.Random;

/**
 * Created by Administrator on 2017/9/24 0024.
 */
public class RandomTest {
    //when you need to get random number,
    // you'd better use Random rand = new Random()
    // rand.NextXXX()

    public static void main(String[] args) {
        Random random = new Random();
        int max = 10;

        System.out.println(random.nextInt(max)); // 0-10
        //比如我想在取1-10
        //则可以这样的来取
        max = 10;int min = 1;
        System.out.println("取1-10，随机数");
        for(int i = 0 ;i<20;i++){
            //System.out.println(random.nextInt(max) %(max-min+1) +min);
            System.out.print(random.nextInt(max-min+1)+min+"\t");
        }
     //   System.out.println(32%10);
}
}
