package hashCode2k17.theUnamedTeam.context;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private int nbRequestDescr;
    private int nbCaches;
    private int cacheSize;
    private int nbVids;
    private int nbEndpoints;
    private Server dataCenter;
    private List<Endpoints> endpoints;
    
    public Context(){
    	endpoints = new ArrayList<Endpoints>();
    	dataCenter = new Server();
    }
    
    public void setNbVids(int nbVids){
    	this.nbVids = nbVids;
    }
    
    public int getNbVids(){
    	return nbVids;
    }
    
    public void setNbEndpoints(int nbEndpoints){
    	this.nbEndpoints = nbEndpoints;
    }
    
    public int getNbEndpoints(){
    	return nbEndpoints;
    }
    
    public List<Endpoints> getEndpoints(){
    	return endpoints;
    }

    public Server getDataCenter(){
    	return dataCenter;
    }
    
    public void setDataCenter(Server dataCenter){
    	this.dataCenter = dataCenter;
    }
    
    public Context clone(){
    	Context newCtx = new Context();
    	newCtx.setNbVids(nbVids);
    	newCtx.setNbEndpoints(nbEndpoints);
    	newCtx.setDataCenter(dataCenter);
    	
    	for(int i=0; i<nbEndpoints; i++){
    		newCtx.getEndpoints().add(endpoints.get(i).clone());
    	}
    	
    	return newCtx;
    }

    public int getNbRequestDescr() {
        return nbRequestDescr;
    }

    public void setNbRequestDescr(int nbRequestDescr) {
        this.nbRequestDescr = nbRequestDescr;
    }

    public int getNbCaches() {
        return nbCaches;
    }

    public void setNbCaches(int nbCaches) {
        this.nbCaches = nbCaches;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

}
