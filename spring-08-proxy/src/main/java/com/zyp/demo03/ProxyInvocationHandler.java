package com.zyp.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;
    public void setRent(Rent rent){
        this.rent=rent;
    }
    //生成代理类
    public Object getProxy(){
      return   Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    @Override
    //处理代理实例，并且返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(rent, args);//动态代理的本质，就是使用反射
        return invoke;
    }
}
