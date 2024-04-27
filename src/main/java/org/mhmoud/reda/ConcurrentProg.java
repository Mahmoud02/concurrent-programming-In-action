package org.mhmoud.reda;

import java.time.Duration;

public class ConcurrentProg {
    public static void main(String[] args) throws InterruptedException {
        /*
        * 1-concurrent means that your task  will be executed in another thread
        *   so the caller thread didn't wait the task to be finished.
        *
        * 2-there are two ways to do that in java
        *   a- create a new thread by using thread class directly and submit the task to it
        *   b- create an executor service which will contains a pool of threads,
        *       and you can use them instead of creating a new thread by your self
        *        and submit the task to the executor service
        *
        * 3- tasks class must implement Runnable interface or Callable interface
        *
        * 4- when you submit your Task class to the new thread or executor service ,
        *      your task will be executed at some point in the future
        *      this is very important hint.
        *
        * */

        System.out.println("main thread start and id is: " + Thread.currentThread().threadId());

        Runnable runnable = () ->
        {
            try {
                Thread.sleep(Duration.ofSeconds(5));
                System.out.println("Runnable background thread: " + Thread.currentThread().threadId());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("main thread logic executing while background thread is running and id is : " + Thread.currentThread().threadId());

        // Wait for the background thread to finish
        thread.join();
    }
}
