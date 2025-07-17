package com.rs.firstrestapi.model;

/**
 * created by rs 7/15/2025.
 */
public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
