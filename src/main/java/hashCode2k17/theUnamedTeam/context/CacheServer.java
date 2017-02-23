package hashCode2k17.theUnamedTeam.context;

import java.util.ArrayList;
import java.util.List;

public class CacheServer {
    private int capacity;
    private List<Video> videos;

    public CacheServer(int capacity) throws IllegalArgumentException{
        if(capacity < 1 || capacity > 500000) throw new IllegalArgumentException();
        this.capacity = capacity;
        this.videos = new ArrayList<Video>();
    }

    public void addVideo(Video video){
        this.videos.add(video);
    }

    public void removeVideo(Video video){
        this.videos.remove(video);
    }

    public List getVideos(){
        return this.videos;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
