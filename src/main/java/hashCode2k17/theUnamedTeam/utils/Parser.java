package hashCode2k17.theUnamedTeam.utils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import hashCode2k17.theUnamedTeam.context.CacheServer;
import hashCode2k17.theUnamedTeam.context.Context;
import hashCode2k17.theUnamedTeam.context.Endpoints;
import hashCode2k17.theUnamedTeam.context.Server;
import hashCode2k17.theUnamedTeam.context.Video;

public class Parser {
    private Scanner input;
    private Context context;

    public Parser(File file, Context context) throws Exception {
        input = new Scanner(file);
        this.context = context;
    }
    
    public void parse() throws Exception {
    	context.setNbVids(Integer.parseInt(input.next()));
    	context.setNbEndpoints(Integer.parseInt(input.next()));
        context.setNbRequestDescr(Integer.parseInt(input.next()));
        context.setNbCaches(Integer.parseInt(input.next()));
        context.setCacheSize(Integer.parseInt(input.next()));

        initVideosSizes();
        initEndpoints();
        initRequests();
    }

    private void initVideosSizes() throws NumberFormatException, Exception{
    	Server dataCenter = context.getDataCenter();

        for (int i = 0; i < context.getNbVids(); i++)
        	dataCenter.addVideo(new Video(i, Integer.parseInt(input.next())));
    }

    private void initEndpoints(){
    	List<Endpoints> endpoints = context.getEndpoints();

        for (int i = 0; i < context.getNbEndpoints(); i++) {
            int datacenterLatency = Integer.parseInt(input.next());
            int nbCacheConnected = Integer.parseInt(input.next());

            Endpoints ep = new Endpoints(datacenterLatency);
            endpoints.add(ep);

            initLatencyToCache(ep, nbCacheConnected);
        }
    }

    private void initLatencyToCache(Endpoints ep, int nbCache){
    	Map<Integer, CacheServer> caches = new HashMap<Integer, CacheServer>();
    	
        for (int i = 0; i < nbCache; i++){
            int cacheId = Integer.parseInt(input.next());
            int latency = Integer.parseInt(input.next());
            
            if(!caches.containsKey(cacheId))
            	caches.put(cacheId, new CacheServer(cacheId, context.getCacheSize()));
            
            ep.addACache(caches.get(cacheId), latency);
        }
    }


    private void initRequests(){
        for (int i = 0; i < context.getNbRequestDescr(); i ++){
            int video = Integer.parseInt(input.next());
            int endpoint = Integer.parseInt(input.next());
            int request = Integer.parseInt(input.next());

            context.getDataCenter().getVideos().get(video).addARequest(context.getEndpoints().get(endpoint), request);
        }
    }

}