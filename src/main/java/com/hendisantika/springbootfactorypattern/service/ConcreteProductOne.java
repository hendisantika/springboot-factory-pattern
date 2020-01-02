package com.hendisantika.springbootfactorypattern.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-factory-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/01/20
 * Time: 07.06
 */
@Description(value = "Concrete implementation of product.")
@Service
public class ConcreteProductOne implements Product {

    private final Logger logger = LoggerFactory.getLogger(ConcreteProductOne.class);

    @Override
    public void calculateSomething() {
        logger.info("Calculating something for product one...");
    }

}