package com.xy.stater.service;


public class ExampleService {

    private String prefix;

    private String suffix;

    public ExampleService(String prefix, String suffix){
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word){
        return prefix + suffix + word;
    }
}
