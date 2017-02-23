package hashCode2k17.theUnamedTeam.strategy;

import hashCode2k17.theUnamedTeam.context.CacheServer;
import hashCode2k17.theUnamedTeam.context.Context;
import hashCode2k17.theUnamedTeam.context.Endpoints;
import hashCode2k17.theUnamedTeam.context.Video;

import java.util.List;
import java.util.Map;

public class FillCacheByCapacity {
    private Context context;

    public FillCacheByCapacity(Context context){
        this.context=context.clone();
    }

    public void schedule(){
        int videoNumber=0;
        List<Video> videos = context.getDataCenter().getVideos();
        for(int i=1;i<videos.size();i++){

        }
    }

    private CacheServer findBestCache(Endpoints endpoints, Video video){
        CacheServer bestCache = null;
        int bestLatency = -1;

        for(Map.Entry<CacheServer, Integer> entry : endpoints.getCaches().entrySet()){
            if(bestCache == null || entry.getValue() < bestLatency) {
                bestCache = entry.getKey();
                bestLatency = entry.getValue();
            }
        }

        return bestCache;
    }
}
