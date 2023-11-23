package homeWorkPart2.task4;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

public class VideoService {

    // 1) a list of all episodes
    public List<Episode> getAllEpisodes(List<Season> seasons) {
        return seasons.stream()
                .flatMap(season -> season.getEpisodes().stream())
                .collect(Collectors.toList());
    }

    // 2) a list of all videos
    public List<Video> getAllVideos(List<Season> seasons) {
        return getAllEpisodes(seasons).stream()
                .flatMap(episode -> episode.getVideos().stream())
                .collect(Collectors.toList());
    }

    // 3) a list of all season names
    public List<String> getAllSeasonNames(List<Season> seasons) {
        return seasons.stream()
                .map(Season::getSeasonName)
                .collect(Collectors.toList());
    }

    // 4) a list of all season numbers
    public List<Integer> getAllSeasonNumbers(List<Season> seasons) {
        return seasons.stream()
                .map(Season::getSeasonNumber)
                .collect(Collectors.toList());
    }

    // 5) a list of all episode names
    public List<String> getAllEpisodeNames(List<Season> seasons) {
        return getAllEpisodes(seasons).stream()
                .map(Episode::getEpisodeName)
                .collect(Collectors.toList());
    }

    // 6) a list of all episode numbers
    public List<Integer> getAllEpisodeNumbers(List<Season> seasons) {
        return getAllEpisodes(seasons).stream()
                .map(Episode::getEpisodeNumber)
                .collect(Collectors.toList());
    }

    // 7) a list of all video names
    public List<String> getAllVideoNames(List<Season> seasons) {
        return getAllVideos(seasons).stream()
                .map(Video::getTitle)
                .collect(Collectors.toList());
    }

    // 8) a list of all url addresses for each video
    public List<String> getAllVideoUrls(List<Season> seasons) {
        return getAllVideos(seasons).stream()
                .map(Video::getUrl)
                .collect(Collectors.toList());
    }

    // 9) only episodes from even seasons
    public List<Episode> getEpisodesFromEvenSeasons(List<Season> seasons) {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 == 0)
                .flatMap(season -> season.getEpisodes().stream())
                .collect(Collectors.toList());
    }

    // 10) only videos from even seasons
    public List<Video> getVideosFromEvenSeasons(List<Season> seasons) {
        return getEpisodesFromEvenSeasons(seasons).stream()
                .flatMap(episode -> episode.getVideos().stream())
                .collect(Collectors.toList());
    }

    // 11) only videos from even episodes and seasons
    public List<Video> getVideosFromEvenEpisodesAndSeasons(List<Season> seasons) {
        return seasons.stream()
                .flatMap(season -> season.getEpisodes().stream()
                        .map(episode -> new AbstractMap.SimpleEntry<>(season, episode))
                        .filter(entry -> entry.getValue().getEpisodeNumber() % 2 == 0 && entry.getKey().getSeasonNumber() % 2 == 0)
                        .flatMap(entry -> entry.getValue().getVideos().stream())
                )
                .collect(Collectors.toList());
    }

    // 12) only Clip videos from even episodes and odd seasons
    public List<Video> getClipVideosFromEvenEpisodesAndOddSeasons(List<Season> seasons) {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 != 0)
                .flatMap(season -> season.getEpisodes().stream())
                .filter(episode -> episode.getEpisodeNumber() % 2 == 0)
                .flatMap(episode -> episode.getVideos().stream())
                .filter(video -> video.getVideoType() == VideoType.CLIP)
                .collect(Collectors.toList());
    }

    // 13) only Preview videos from odd episodes and even seasons
    public List<Video> getPreviewVideosFromOddEpisodesAndEvenSeasons(List<Season> seasons) {
        return seasons.stream()
                .filter(season -> season.getSeasonNumber() % 2 == 0)
                .flatMap(season -> season.getEpisodes().stream())
                .filter(episode -> episode.getEpisodeNumber() % 2 != 0)
                .flatMap(episode -> episode.getVideos().stream())
                .filter(video -> video.getVideoType() == VideoType.PREVIEW)
                .collect(Collectors.toList());
    }
}
