package hashCode2k17.theUnamedTeam.context;

import java.util.HashMap;
import java.util.Map;

public class Video {
    private int id;
    private int size;
    private Map<Endpoints, Integer> requests;

    public Video(int id, int size){
        this.id=id;
        this.size=size;
        requests = new HashMap<Endpoints, Integer>();
    }
    
    public void addARequest(Endpoints endP, int nbOfRequest){
    	requests.put(endP, nbOfRequest);
    }
    
    public int getId(){
    	return id;
    }
    
    public int getVideoSize(){
    	return size;
    }

    public Endpoints getMostAskedEndPoints(){
        int value = 0;
        Endpoints end = null;
        for(Map.Entry<Endpoints, Integer> entry : requests.entrySet()) {
            if(entry.getValue()>value){
                value=entry.getValue();
                end=entry.getKey();
            }
        }
        return end;
    }

    public int getRequestFoEndpoint(Endpoints ep){
        return requests.get(ep);
    }

    public Map<Endpoints, Integer> getRequests() {
        return requests;
    }

    public void setRequests(Map<Endpoints, Integer> requests) {
        this.requests = requests;
    }

}
