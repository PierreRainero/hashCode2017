package hashCode2k17.theUnamedTeam;

import java.io.File;
import java.io.FileWriter;

import hashCode2k17.theUnamedTeam.context.Context;
import hashCode2k17.theUnamedTeam.strategy.FillCacheByCapacity;
import hashCode2k17.theUnamedTeam.utils.Parser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
        	Context context = new Context();
            Parser parser = new Parser(new File("contexts/me_at_the_zoo.in"), context);
            parser.parse();

            String result;
            FillCacheByCapacity strategy = new FillCacheByCapacity(context);
            result = strategy.schedule();

            //Writing the output file
            File f = new File("result.out");
            FileWriter fw = new FileWriter(f, false);
            fw.write(result);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
