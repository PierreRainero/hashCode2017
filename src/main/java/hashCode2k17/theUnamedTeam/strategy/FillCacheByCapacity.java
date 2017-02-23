package hashCode2k17.theUnamedTeam.strategy;

import hashCode2k17.theUnamedTeam.context.*;

import java.util.List;

public class FillCacheByCapacity {
    private Context context;

    public FillCacheByCapacity(Context context){
        this.context=context.clone();
    }

    public String schedule(){
        List<Video> videos = context.getDataCenter().getVideos();
        Endpoints endpoint = null;
        for(int i=1;i<videos.size();i++){
            endpoint = videos.get(i).getMostAskedEndPoints();
        }
    }
/*
    public String returnedString(){

    }*/
}
