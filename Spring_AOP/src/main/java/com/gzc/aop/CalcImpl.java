package com.gzc.aop;

import org.springframework.stereotype.Component;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/13  10:20  周二
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Component
public class CalcImpl implements Calc{
    @Override
    public int add(int a, int b) {
        //MyLogging.beforeMethod("add",new Object[]{a,b});
        int result = a+b;
        //出现异常后置通知也会执行
        //int i= 1/0;
        //MyLogging.afterMethod("add",result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result = a-b;
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result = a*b;
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result = a/b;
        return result;
    }
}
