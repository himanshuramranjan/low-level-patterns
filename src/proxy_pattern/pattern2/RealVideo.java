package proxy_pattern.pattern2;

public class RealVideo implements Video {
    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading video from YouTube: " + fileName);
        try {
            Thread.sleep(1000); // Simulate slow loading
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Playing video: " + fileName);
    }
}
