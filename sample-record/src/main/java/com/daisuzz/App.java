package com.daisuzz;

public class App {
    public static void main(final String[] args) {

        final HelloWorld helloWorld = new HelloWorld("Hello World");
        final HelloWorld helloWorld2 = new HelloWorld("Hello World");

        System.out.println(helloWorld.value());
        System.out.println(helloWorld.toString());
        System.out.println(helloWorld.hashCode());
        System.out.println(helloWorld.equals(helloWorld2));
    }
}
