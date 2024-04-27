package org.mhmoud.reda;

import java.util.List;

public class AsyncProg {
    public static void main(String[] args) {
    //the println will be executed later at some point
    //the async code may be executed in the main thread or a background Thread
    // async is programming is not related to concurrent programming
    // async is programming is used with concurrent programming, but they are different concepts

        var numbers = List.of(1,2,3);
        numbers.forEach(System.out::println);

    }
}
