package hashCode2k17.theUnamedTeam.context;

import java.util.HashMap;
import java.util.Map;

public class Endpoints {
	private int latency;
	private Map<CacheServer, Integer> caches;
	
	public Endpoints(int latency){
		this.latency = latency;
		caches = new HashMap<CacheServer, Integer>();
	}
	
	public void addACache(CacheServer cacheToAdd, int latency){
		caches.put(cacheToAdd, latency);
	}
	
	public int getNumberOfCache(){
		return caches.size();
	}
	
	public int getLatency(){
		return latency;
	}

	public Map<CacheServer, Integer> getCaches(){
		return caches;
	}
	
	public Endpoints clone(){
		Endpoints newEndpoints = new Endpoints(latency);
		for(Map.Entry<CacheServer, Integer> entry : caches.entrySet()){
			newEndpoints.addACache(entry.getKey().clone(), entry.getValue());
		}
		return newEndpoints;
	}
}
