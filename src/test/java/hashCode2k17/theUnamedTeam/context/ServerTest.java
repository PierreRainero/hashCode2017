package hashCode2k17.theUnamedTeam.context;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ServerTest {

    private Server server;

    @Before
    public void defineContext(){
        server = new Server();
    }

    @Test
    public void addVideo() throws Exception {
        Video video = new Video(0,20);
        server.addVideo(video);
        assertTrue(server.getVideos().contains(video));
    }
}
