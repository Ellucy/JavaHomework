package homeWorkPart2.task4;

public class Video {
    public String title;
    public String url;
    public VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public VideoType getVideoType() {
        return videoType;
    }
}
