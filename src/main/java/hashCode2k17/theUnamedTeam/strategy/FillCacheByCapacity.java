package hashCode2k17.theUnamedTeam.strategy;

import hashCode2k17.theUnamedTeam.context.Video;

import java.util.List;

public class FillCacheByCapacity {
    private Context context;

    public FillCacheByCapacity(Context context){
        this.context=context.clone();
    }

    public void schedule(){
        int videoNumber=0;
        List<Video> videos = context.getServer.getVideo();
        for(int i=1;i<videos.size();i++){

        }
    }
}
