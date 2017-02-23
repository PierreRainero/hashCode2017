package hashCode2k17.theUnamedTeam.strategy;

import hashCode2k17.theUnamedTeam.context.CacheServer;
import hashCode2k17.theUnamedTeam.context.Context;
import hashCode2k17.theUnamedTeam.context.Server;
import org.junit.Before;
import org.junit.Test;

public class FillCacheByCapacityTest {

    private Context context;
    private FillCacheByCapacity strategy;

    @Before
    public void defineContext(){
        Server dataCenter = new Server();
        context.setDataCenter(dataCenter);
        context.setNbCaches(3);
        context.setCacheSize(100);
        context.setNbEndpoints(2);
        context.setNbVids(dataCenter.getVideos().size());
        strategy = new FillCacheByCapacity(context);
    }

    @Test
    public void findBestCache(){

    }
}
