package advJava.day4;

import java.util.ArrayList;
import java.util.List;

public class ImageDownloader {
    static void main(String[] args) throws InterruptedException {
        String image[] = {
                "image1","image2","image3"
        };
        List<Thread> list = new ArrayList<>();
        for(String img : image){
            Downloader loader = new Downloader(img);
            System.out.println("thread started");
            list.add(loader);
            loader.start();

        }
        for (Thread t : list){
            t.join();
        }
        System.out.println("All images Downloaded");
    }
}
class Downloader extends Thread {
    String image;
    public Downloader(String img){
       this.image = img;
    }
    @Override
    public void run() {
        download(image);
    }
    public  void download(String image){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("downloading :  " + image);
    }
}