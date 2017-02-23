package hashCode2k17.theUnamedTeam;

import java.io.File;

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
            Parser test = new Parser(new File("contexts/me_at_the_zoo.in"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
