package com.hendisantika.springbootfactorypattern.factory;

import com.hendisantika.springbootfactorypattern.service.ConcreteProductOne;
import com.hendisantika.springbootfactorypattern.service.ConcreteProductTwo;
import com.hendisantika.springbootfactorypattern.service.Product;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/01/20
 * Time: 07.08
 */
@Description(value = "Product Factory.")
@Component
public class ProductFactory {

    /**
     * Private constructor - can not be instantiated
     */
    private ProductFactory() {
    }

    /**
     * Method for getting product by code
     *
     * @param uniqueCode - unique product identifier
     * @return Product interface
     */
    public static Product getProduct(String uniqueCode) {
        switch (uniqueCode) {
            case "PRODUCT_ONE":
                return new ConcreteProductOne();

            case "PRODUCT_TWO":
                return new ConcreteProductTwo();

            default:
                throw new IllegalArgumentException("Provided code not found.");
        }
    }

}