package aopTest.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by longjinwen on 08/09/2017.
 * 此类将用于JDK动态代理
 */
public class JDKProxyTest
{
    public static void main(String[] args) {
        UserProxyServiceImpl userProxyService = new UserProxyServiceImpl();
        UserJDKProxy userJDKProxy = new UserJDKProxy(userProxyService);
        //生成代理对象
        UserProxyService userService = (UserProxyService) Proxy.newProxyInstance(userProxyService.getClass().getClassLoader(),
                userProxyService.getClass().getInterfaces(),userJDKProxy);
        userService.addUser();
    }
}

