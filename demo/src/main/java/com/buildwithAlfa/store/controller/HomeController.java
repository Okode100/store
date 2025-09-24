package com.buildwithAlfa.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Store Application</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Hello World - Store Application is Running!</h1>\n" +
                "    <p>Spring Boot application is successfully running on port 8080</p>\n" +
                "</body>\n" +
                "</html>";
    }
}