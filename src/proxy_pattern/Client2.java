package proxy_pattern;

import proxy_pattern.pattern2.ProxyVideo;
import proxy_pattern.pattern2.Video;



//a YouTube Video Downloader app 🎥:

//Downloading a video is expensive (time + bandwidth).
//You create a Proxy that caches downloaded videos.
//If a user requests the same video again, it serves it from cache instead of downloading it again.

public class Client2 {
    public static void main(String[] args) {
        Video video1 = new ProxyVideo("DesignPatterns.mp4");
        Video video2 = new ProxyVideo("ProxyPatternDemo.mp4");
        Video video3 = new ProxyVideo("DesignPatterns.mp4");

        // First time — loads from YouTube
        video1.display();

        System.out.println();

        // Loads another video
        video2.display();

        System.out.println();

        // Same video again — should come from cache
        video3.display();
    }
}
