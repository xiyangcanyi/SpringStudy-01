package com.zyp.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解方式实现aop
@Aspect //标注这个类是一个切面

//aop横向编程的思想，在不影响原来业务类的情况下，实现业务的增强
public class AnnotationpointCut {
    @Before("execution(* com.zyp.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====方法执行前=======");
    }
    @After("execution(* com.zyp.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=====方法执行后=======");
    }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点；
    @Around("execution(* com.zyp.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws  Throwable{
        System.out.println("环绕前");
        Signature signature = joinPoint.getSignature();
        System.out.println(signature);

        Object proceed = joinPoint.proceed();//执行方法
        System.out.println("环绕前");
        System.out.println(proceed);


    }

}
