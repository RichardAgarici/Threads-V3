package examples;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask()  {
        this.status = new DownloadStatus();
    }
    @Override
    public void run() {
        System.out.println("Download complete: " +Thread.currentThread().getName());
        for(var i = 0; i < 10_000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        System.out.println("Downloading a file:"+Thread.currentThread().getName());

    }
    public DownloadStatus getStatus() {
        return status;
    }

    //===========================================================================================


//    @Override
//    public void run() {
//        System.out.println("Download complete: " +Thread.currentThread().getName());
//        for(var i = 0; i < 10_000; i++) {
//            if(Thread.currentThread().isInterrupted()) return;
//            status.incrementTotalBytes();
//        }
//        System.out.println("Downloading a file:"+Thread.currentThread().getName());
//    }
//
//

    //===========================================================================================

//    @Override
//    public void run() {
//        System.out.println("Downloading a file:"+Thread.currentThread().getName());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Download complete: " +Thread.currentThread().getName());
//    }
    //===========================================================================================

}
