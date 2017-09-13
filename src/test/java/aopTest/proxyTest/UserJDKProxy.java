package aopTest.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by longjinwen on 08/09/2017.
 */
public class UserJDKProxy implements InvocationHandler{
    private Object targetObj;
    public UserJDKProxy(Object targetObj){
        this.targetObj = targetObj;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        UserProxyServiceImpl userProxyService = (UserProxyServiceImpl)  targetObj;
        Object obj = null;
        //这里可以做验证
        if(userProxyService.getUser() != null){
            obj = method.invoke(targetObj,args);
        }
        return obj;
    }
}
