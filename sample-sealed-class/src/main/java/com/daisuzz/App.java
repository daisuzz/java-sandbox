package com.daisuzz;

/**
 * Hello world!
 */
public class App {
    public static void main(final String[] args) {

        final Shape s = new Circle();

        /* 今後のバージョンで以下のようにdefaultを書かずに分岐を行うことができる

        final boolean name = switch (s){
            case Circle c ->  "円";
            case Rectangle r -> "長方形";
            case Square s -> "正方形";
        }

        */
    }
}
