package proxy_pattern.pattern2;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideo implements Video {
    private static final Map<String, RealVideo> cache = new HashMap<>();
    private String fileName;

    public ProxyVideo(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        RealVideo realVideo = cache.get(fileName);

        if (realVideo == null) {
            System.out.println("Cache miss: downloading video...");
            realVideo = new RealVideo(fileName);
            cache.put(fileName, realVideo);
        } else {
            System.out.println("Cache hit: loading video from cache...");
        }

        realVideo.display();
    }
}
