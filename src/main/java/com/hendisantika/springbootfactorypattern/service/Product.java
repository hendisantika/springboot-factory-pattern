package com.hendisantika.springbootfactorypattern.service;

import org.springframework.context.annotation.Description;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/01/20
 * Time: 07.05
 */
@Description(value = "Product definition.")
public interface Product {

    void calculateSomething();

}