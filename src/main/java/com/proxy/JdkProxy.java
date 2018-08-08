package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/8/8
 * @ Description：
 * @ throws
 */
public class JdkProxy implements InvocationHandler{

    private Object target ;//需要代理的目标对象
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.err.println("1.进入代理++++++++++++++++(这里写一些公用的信息及代码!)");

        return method.invoke(target,args);
    }

    //获取目标对象
    public Object getJDKProxy(Object targetObject){
        //为目标对象target赋值
        this.target = targetObject;
        //JDK动态代理只能针对实现了接口的类进行代理，newProxyInstance 函数所需参数就可看出
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }
}
