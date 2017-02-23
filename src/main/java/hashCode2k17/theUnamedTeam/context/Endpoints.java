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

	public List<CacheServer> getCaches(){
		return caches;
	}
	
	public Endpoints clone(){
		Endpoints newEndpoints = new Endpoints(latency);
		for(int i=0; i<caches.size(); i++){
			newEndpoints.getCaches().add(caches.get(i).clone());
		}
		return newEndpoints;
	}
}
