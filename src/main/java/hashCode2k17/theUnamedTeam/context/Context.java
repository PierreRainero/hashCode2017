package hashCode2k17.theUnamedTeam.context;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private int nbVids;
    private int nbEndpoints;
    private List<Endpoints> endpoints;
    
    public Context(){
    	endpoints = new ArrayList<Endpoints>();
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
}
