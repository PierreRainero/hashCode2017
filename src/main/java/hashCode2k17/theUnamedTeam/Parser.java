package hashCode2k17.theUnamedTeam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hashCode2k17.theUnamedTeam.context.Video;

public class Parser {
    private Scanner input;

    private int nbVids;
    private int nbEndpoints;
    private int nbRequestDescr;
    private int nbCaches;
    private int cacheSize;


    public Parser(File file) throws Exception {
        input = new Scanner(file);

        nbVids = Integer.parseInt(input.next());
        nbEndpoints = Integer.parseInt(input.next());
        nbRequestDescr = Integer.parseInt(input.next());
        nbCaches = Integer.parseInt(input.next());
        cacheSize = Integer.parseInt(input.next());

        initVideosSizes();
    }

    private void initVideosSizes(){
    	DataCenter dataCenter = new DataCenter();

        for (int i = 0; i < nbVids; i++)
        	dataCenter.addVideo(new Video(Integer.parseInt(input.next())));
    }
}