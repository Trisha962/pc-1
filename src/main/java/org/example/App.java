package org.example;

import org.example.configuration.AppConfig;
import org.example.product.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);

       Product obj1=(Product) applicationContext.getBean("detail");
        System.out.println(obj1);

        Product obj2= applicationContext.getBean("details",Product.class);
        System.out.println(obj2);

    }
}
