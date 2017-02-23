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
    
    public int getVideoSize(){
    	return size;
    }
}
