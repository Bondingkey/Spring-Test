package com.gzc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/13  10:22  周二
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Component //标识为一个组件
@Aspect    //标识为当前类为非核心业务提取类(切面类)
@Order(1)  //定义当前切面类的优先级,数字越小越优先
public class MyLogging {

    //@Pointcut为重用切入点表达式
    @Pointcut("execution(* com.gzc.aop.CalcImpl.*(int, int))")//标记目标方法,*为通配符
    public void method(){}

    //@Before("method()")//在目标方法执行前执行
    public void beforeMethod(JoinPoint joinPoint){
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();

        System.out.println("前置通知>Calc中"+methodName+"方法(),参数:"+ Arrays.toString(args));
    }

    //@After("method()")//在目标方法执行后执行
    public void afterMethod(JoinPoint joinPoint){
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();
        System.out.println("后置通知>Calc中"+methodName+"方法(),参数:"+ Arrays.toString(args));
    }

    //@AfterReturning(value = "method()",returning = "result")//@AfterReturning中returning属性与入参中参数名一致
    //返回通知
    public void afterReturn(JoinPoint joinPoint,Object result){
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();
        System.out.println("返回通知>Calc中"+methodName+"方法(),结果:"+result);
    }

    //@AfterThrowing(value = "method()",throwing = "e")//@AfterThrowing中的throwing属性值与入参参数名一致
    //异常通知
    public void throwing(JoinPoint joinPoint,Exception e){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("异常通知>Calc中"+methodName+"方法(),异常信息为:"+e);

    }

    @Around(value = "method()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
            //获取方法名
            String methodName = proceedingJoinPoint.getSignature().getName();
            //获取参数列表
            Object[] args = proceedingJoinPoint.getArgs();
            //定义返回值
            Object rs = null;
        try {
            //前置通知
            System.out.println("前置通知>Calc中"+methodName+"方法(),参数:"+ Arrays.toString(args));
            //代理方法:代替原目标方法执行
            rs = proceedingJoinPoint.proceed();
            //返回通知
            System.out.println("返回通知>Calc中"+methodName+"方法(),结果:"+rs);
        } catch (Throwable e) {
            //异常通知
            System.out.println("异常通知>Calc中"+methodName+"方法(),异常信息为:"+e);
        }finally {
            //后置通知
            System.out.println("后置通知>Calc中"+methodName+"方法(),参数:"+ Arrays.toString(args));
        }

        return rs;
    }
}
