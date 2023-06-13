package com.gzc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
public class MyLogging {

    @Before(value = "execution(public int com.gzc.aop.CalcImpl.add(int, int))")
    public static void beforeMethod(JoinPoint joinPoint){
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();

        System.out.println("==>Calc中"+methodName+"方法(),参数:"+ Arrays.toString(args));
    }

    public static void afterMethod(String methodName,Object rs){
        System.out.println("==>Calc中"+methodName+"方法(),结果:"+rs);
    }

}
