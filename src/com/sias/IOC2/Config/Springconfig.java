package com.sias.IOC2.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @create 2022-01-12 20:45
 */

/*
* 配置类，来替代XNML中代码的配置
*
*
* */
@Configuration//作为配置类，替代XML
@ComponentScan(basePackages = {"com.sias.IOC2"})//扫描包，就相当于XML中的
                                               // <context:component-scan base-package="com.sias.L2"></context:component-scan>
public class Springconfig {

}
