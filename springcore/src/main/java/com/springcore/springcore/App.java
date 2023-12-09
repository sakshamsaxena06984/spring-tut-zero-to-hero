package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "------------------------------------------------------------------" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student s =(Student)context.getBean("stu1");
        System.out.println(s.toString());
        
        Student s1=(Student)context.getBean("stu2");
        System.out.println("-------------- info of another bean [stu2]--------------------------");
        System.out.println(s1.toString());
        
        Student s2=(Student)context.getBean("stu3");
        System.out.println("-------------- info of another bean [stu3] --------------------------");
        System.out.println(s2.toString());
        
        Student s3=(Student)context.getBean("stu4");
        System.out.println("-------------- info of another bean [stu4] --------------------------");
        System.out.println(s3.toString());
    }
}
