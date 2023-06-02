package examples;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        //===========================================================================================
//        Confinement
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            task.ad
            var thread = new Thread(new DownloadFileTask());
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(status.getTotalBytes());
        //===========================================================================================
//        List<Thread> threads = new ArrayList<>();
//        var status = new DownloadStatus();
//        for (int i = 0; i < 10; i++) {
//            var thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(status.getTotalBytes());
        //===========================================================================================
//         Thread thread = new Thread(new DownloadFileTask());
//         thread.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread.interrupt();

        //===========================================================================================
//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();
//        try {
//            thread.join();
//            join means that this thread needs to finish before other threads can be activated.
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("File is ready to be scanned.");
        //===========================================================================================
//        System.out.println(Thread.currentThread().getName());
//        Each thread has name and id.

//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//        }
//        Thread can accept an object of type runnable which is has a single method called run();
//        This basically give the threads indications
        //===========================================================================================
    }
}
