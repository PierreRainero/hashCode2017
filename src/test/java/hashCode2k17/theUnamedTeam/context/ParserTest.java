package hashCode2k17.theUnamedTeam.context;

import hashCode2k17.theUnamedTeam.utils.Parser;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class ParserTest {
private Context ctxt;

    @Before
    public void initContext() throws Exception {
        ctxt = new Context();
        Parser parser = new Parser(new File("contexts/pdf_exmpl.in"), ctxt);
        parser.parse();
    }

    @Test
    public void checkEdpt(){
        assertEquals(2, ctxt.getNbEndpoints());
        assertEquals(1000, ctxt.getEndpoints().get(0).getLatency());
        assertEquals(500, ctxt.getEndpoints().get(1).getLatency());
        assertEquals(100, ctxt.getEndpoints().get(0).getCaches().get(0).getLatency());
    }

    @Test
    public void checkEdpt1(){
        assertEquals(2, ctxt.getNbEndpoints());
        assertEquals(1000, ctxt.getEndpoints().get(0).getLatency());
        assertEquals(500, ctxt.getEndpoints().get(1).getLatency());
        assertEquals(100, ctxt.getEndpoints().get(0).getCaches().get(0).getLatency());
    }
}
