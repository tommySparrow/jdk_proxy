package com;

import com.impl.UserManagerImpl;
import com.interfaces.UserManager;
import com.proxy.JdkProxy;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/8/8
 * @ Description：
 * @ throws
 */

public class main {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        UserManager userManager = (UserManager)jdkProxy.getJDKProxy(new UserManagerImpl());
        userManager.addUser("xiao ming", "123456");
        System.out.println("4.执行结束----------------");

    }
}
