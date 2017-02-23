package hashCode2k17.theUnamedTeam.context;

import java.util.HashMap;
import java.util.Map;

public class Video {
    private int size;
    private Map<Endpoints, Integer> requests;

    public Video(int size, Map<Endpoints, Integer> requests){
        this.size=size;
        requests = new HashMap<Endpoints, Integer>();
    }
    
    public void AddARequest(Endpoints endP, int nbOfRequest){
    	requests.put(endP, nbOfRequest);
    }
    
    public int getVideoSize(){
    	return size;
    }
}
