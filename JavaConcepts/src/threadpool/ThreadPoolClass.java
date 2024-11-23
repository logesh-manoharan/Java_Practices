package threadpool;

import java.lang.Runnable;

// Executor Interfaces to Create a pool
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/*
Why Thread Pool ?
	For every requests from the client, server has a create a specific thread to get the response.
	It will be easy to implement, but it may raise a performance issue beacause for every request we are creating the separate thread.
	Thread pool will helps us to resolve this performance issue, and enhances the performance robustly.

Thread Pool:
	It will re-uses a previously created threads to run the current tasks, by this it will resolve thread cycle overhead and resource thrashing.

 */

class Task implements Runnable {
    String taskName;

    public Task(String task) {
        this.taskName = task;
    }

    public void run() {
        // Runnable Code Block. It will run on-demand.
        System.out.println("Running Task Name :: " + this.taskName);

        try {
            Thread.sleep(5000);
            System.out.println("Waited 5 seconds !!");
        } catch (InterruptedException interruptedException) {
            System.out.println("Sleep Interrupted !!");
        }

    }
}

public class ThreadPoolClass {
    public static void main(String[] args) {
        // Since 'Task' class implements 'Runnable Interface', intantiation of Task can be 'Runnable'.
        Runnable task1 = new Task("Task 1");
        Runnable task2 = new Task("Task 2");
        Runnable task3 = new Task("Task 3");
        Runnable task4 = new Task("Task 4");
        Runnable task5 = new Task("Task 5");
        Runnable task6 = new Task("Task 6");


        // Creating the Thread Pool(with Size=5) using Executor and ExecutorService.
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        // All the above Runnable tasks/objects will be passed to the Executor/ThreadPool.
        threadPool.execute(task1);
        threadPool.execute(task2);
        threadPool.execute(task3);
        threadPool.execute(task4);
        threadPool.execute(task5);
        threadPool.execute(task6);

        // Working Explanation::
            // First 5 tasks will start to run simultaneously since we are having 5 threads in ThreadPool.
            // 6th task will start to run after anyone of the task got completed. So, after 5 secs it will start to run.


        // Shutting Down the Executor/Thread Pool
        threadPool.shutdown();

    }
}
