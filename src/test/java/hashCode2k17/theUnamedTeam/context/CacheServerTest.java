package hashCode2k17.theUnamedTeam.context;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CacheServerTest {

    private CacheServer cacheServer;

    @Before
    public void defineContext(){
        cacheServer = new CacheServer(0,200);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorWithInvalidCapacity(){
        thrown.expect(InvalidArgumentException.class);
        cacheServer = new CacheServer(0,0);
        cacheServer = new CacheServer(0,500001);
    }
}
