package hashCode2k17.theUnamedTeam.context;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoTest {
    Video v;

    @Before
    public void init(){
        v = new Video(500, 0);
    }

    @Test
    public void testCreate(){
        assertEquals(500, v.getVideoSize());
    }

}
