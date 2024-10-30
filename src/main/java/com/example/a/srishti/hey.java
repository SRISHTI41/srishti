package com.example.a.srishti;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hey
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "HELLO  , HOW ARE YOU!!";
    }
}