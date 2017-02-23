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
        List<Video> videos = context.getDataCenter().getVideos();
        Endpoints endpoint = null;
        for(int i=1;i<videos.size();i++){
            endpoint = videos.get(i).getMostAskedEndPoints();
            findBestCache(endpoint, videos.get(i));
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

    private String returnedString(){
        StringBuilder sb = new StringBuilder();
        List<CacheServer> cs = context.getCaches();
        for(int i = 0 ; i<context.getNbCaches();i++){
            sb.append(cs.getId() + " ");
            for(int j = 0;j<cs.getVideosNumber()){
                sb.append(cs.getId() + " ");
            }
        }
    }
}
