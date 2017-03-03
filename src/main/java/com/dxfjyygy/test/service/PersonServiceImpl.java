package com.dxfjyygy.test.service;

import com.dxfjyygy.test.test1.Chinese;

/**
 * Created by longjinwen on 2017/2/28.
 */
public class PersonServiceImpl implements PersonService
{
    public void setChinese(Chinese chinese) {
        this.chinese = chinese;
    }

    private Chinese chinese;
    public void userAxe() {
        chinese.useAxe();
    }
}
