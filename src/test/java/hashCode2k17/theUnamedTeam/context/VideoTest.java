package hashCode2k17.theUnamedTeam.context;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoTest {
    Video v;

    @Before
    public void init(){
        v = new Video(0, 500);
    }

    @Test
    public void testCreate(){
        assertEquals(500, v.getVideoSize());
    }

    public void testAskedPoint(){
        Endpoints endpoints = new Endpoints(1000);
        v.addARequest(endpoints, 100);
        Endpoints endpoints2 = new Endpoints(1500);
        v.addARequest(endpoints2, 50);

    }

}
