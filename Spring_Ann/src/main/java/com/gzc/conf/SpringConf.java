package com.gzc.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/12  18:06  周一
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */

@Configuration//表示当前类为配置类
@ComponentScan(basePackages = "com.gzc")//设置扫描范围
public class SpringConf {
}
