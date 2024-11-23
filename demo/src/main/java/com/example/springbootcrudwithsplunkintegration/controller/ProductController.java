package com.example.springbootcrudwithsplunkintegration.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    Logger logger = LogManager.getLogger(ProductController.class);

    @GetMapping
    public String findAll() {
        logger.info("test api");

        return "OK";
    }




}

