package com.example.mcp;

import io.quarkiverse.mcp.server.Tool;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.validation.Valid;

@ApplicationScoped
public class HelloWorldTool {

    @Tool
    public String hello(Person person) {
    //public String hello(@Valid Person person) { // Adding @Valid annotation breaks Input Schema generation
        return "Hello";
    }
}
