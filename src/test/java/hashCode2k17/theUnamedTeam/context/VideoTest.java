package hashCode2k17.theUnamedTeam.context;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class VideoTest {

    @Test
    public void testCreate(){
        Endpoints endpoints = new Endpoints(500);
        Endpoints endpoints1 = new Endpoints(500);
        Endpoints endpoints2 = new Endpoints(500);
        Map<Endpoints, Integer> map = new HashMap<Endpoints, Integer>();
        map.put(endpoints, 1500);
        map.put(endpoints1, 1500);
        map.put(endpoints2, 1500);
        Video v = new Video(500, map);

    }
}
