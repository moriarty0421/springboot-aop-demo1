package com.aopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
* @Title: ActuatorApp
* @Description: AOP Demo
* @author liuziyang
* @date 2022/10/13
 */
@SpringBootApplication
public class AspectApp
{
    public static void main( String[] args )
    {
		SpringApplication.run(AspectApp.class, args);
		System.out.println("Aspect启动成功！");
    }
}
