package org.example.configuration;

import org.example.product.Product;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("detail")
    //constructor injection
    public Product details() {
        return new Product(1, "Ultra Fast", "Sujata", "Fan");

    }

    @Bean("details")
    //setter injection
    public Product detailsFan() {
        Product product= new Product();
        product.setProductId(101);
        product.setProductName("Ultra Fast");
        product.setBrandName("Sujata");
        product.setCategory("Fan");
        return  product;


    }
}
