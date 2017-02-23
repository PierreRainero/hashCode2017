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
        this.context=context;
    }

    public String schedule() throws Exception {
        List<Video> videos = context.getDataCenter().getVideos();
        Endpoints endpoint = null;
        for(int i=1;i<videos.size();i++){
            endpoint = videos.get(i).getMostAskedEndPoints();
            if(endpoint!=null) {
                CacheServer bestCache = findBestCache(endpoint, videos.get(i));
                if(bestCache != null)
                    bestCache.addVideo(videos.get(i));
            }
        }
        return returnedString();
    }

    private CacheServer findBestCache(Endpoints endpoints, Video video){
        CacheServer bestCache = null;
        int bestLatency = -1;

        for(Map.Entry<CacheServer, Integer> entry : endpoints.getCaches().entrySet()){
            if((bestCache == null || entry.getValue() < bestLatency) && entry.getKey().getActualCapacity() - video.getVideoSize() >= 0) {
                bestCache = entry.getKey();
                bestLatency = entry.getValue();
            }
        }

        return bestCache;
    }

    private String returnedString(){
        StringBuilder sb = new StringBuilder();
        Map<Integer, CacheServer> cs = context.getCaches();
        int usedCaches = 0;
        for(int i = 0 ; i<context.getNbCaches();i++){
            if(cs.get(i).getVideos().size()!=0){
                usedCaches++;
                sb.append(i + " ");
                for(int j = 0;j<cs.get(i).getVideos().size();j++){
                    sb.append(cs.get(i).getVideos().get(j).getId() + " ");
                }
                sb.append("\n");
            }
        }
        String returnedString = "";
        returnedString+=usedCaches+"\n";
        returnedString+=sb;
        return returnedString;
    }
}
