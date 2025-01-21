package Multithreading;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit some tasks
        for (int i = 0; i < 5; i++) {
            executor.submit(new Task(i));
        }

        // Initiating shutdown
        executor.shutdown();
    }

    static class Task implements Runnable {
        private int taskId;

        Task(int id) {
            this.taskId = id;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task " + taskId + " finished execution.");
        }
    }
}
