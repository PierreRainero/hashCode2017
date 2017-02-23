package hashCode2k17.theUnamedTeam.strategy;

import hashCode2k17.theUnamedTeam.context.CacheServer;
import hashCode2k17.theUnamedTeam.context.Context;
import hashCode2k17.theUnamedTeam.context.Endpoints;
import hashCode2k17.theUnamedTeam.context.Video;

import java.util.List;

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
        CacheServer bestCache = (endpoints.getCaches().size() > 0)? endpoints.getCaches().get(0) : null;

        for(int i = 0; i < endpoints.getCaches().size(); i++){
            if(endpoints.getCaches().get(i).getLatency() < bestCache.getLatency())
                bestCache = endpoints.getCaches().get(i);
        }

        return bestCache;
    }
}
