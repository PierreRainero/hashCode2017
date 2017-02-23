package hashCode2k17.theUnamedTeam.context;

import java.util.ArrayList;
import java.util.List;

public class Endpoints {
	private int latency;
	private List<CacheServer> caches;
	
	public Endpoints(int latency){
		this.latency = latency;
		caches = new ArrayList<CacheServer>();
	}
	
	public void addACache(CacheServer cacheToAdd){
		caches.add(cacheToAdd);
	}
	
	public int getNumberOfCache(){
		return caches.size();
	}
	
	public int getLatency(){
		return latency;
	}
}
