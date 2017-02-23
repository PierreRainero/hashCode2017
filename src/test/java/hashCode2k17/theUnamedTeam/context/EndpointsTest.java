package hashCode2k17.theUnamedTeam.context;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EndpointsTest {
	private Endpoints endpoint;
	
	@Before
	public void initContext(){
		endpoint = new Endpoints(200);
	}
	
	@Test
	public void checkLatency(){
		assertEquals(200, endpoint.getLatency());
	}
	
	@Test
	public void addCache(){
		CacheServer cache = new CacheServer(0, 200);
		endpoint.addACache(cache);
		assertEquals(1, endpoint.getNumberOfCache());
	}

}
