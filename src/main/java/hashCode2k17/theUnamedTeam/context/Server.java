package hashCode2k17.theUnamedTeam.context;

import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Video> videos;

    public Server(){
        this.videos = new ArrayList<Video>();
    }

    public void addVideo(Video video){
        this.videos.add(video);
    }

    public List getVideos(){
        return this.videos;
    }
}
