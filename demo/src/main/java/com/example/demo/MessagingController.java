package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class MessagingController {

    static final Logger logger = LogManager.getLogger(MessagingController.class.getName());


    @PostMapping("/send")
    public String sendMessage(@RequestParam String broker, @RequestParam String message) {
        logger.info("Mensagem enviada com sucesso para " + broker + "!");

        return "Mensagem enviada com sucesso para " + broker + "!";
    }

}

