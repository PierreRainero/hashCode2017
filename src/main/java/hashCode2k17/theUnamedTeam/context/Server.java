package hashCode2k17.theUnamedTeam.context;

import hashCode2k17.theUnamedTeam.exception.CacheServerCapacityException;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Video> videos;

    public Server(){
        this.videos = new ArrayList<Video>();
    }

    public void addVideo(Video video) throws Exception {
        this.videos.add(video);
    }

    public List getVideos(){
        return this.videos;
    }
}
