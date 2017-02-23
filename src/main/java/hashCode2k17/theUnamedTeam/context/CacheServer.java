package hashCode2k17.theUnamedTeam.context;

import com.sun.glass.ui.View.Capability;

import hashCode2k17.theUnamedTeam.exception.CacheServerCapacityException;

public class CacheServer extends Server {
    private int id;
    private int initialCapacity;
    private int actualCapacity;
    private int latency;

    public CacheServer(int id, int latency, int capacity) throws IllegalArgumentException{
        super();
        this.id = id;
        if(capacity < 1 || capacity > 500000) throw new IllegalArgumentException();
        this.initialCapacity = capacity;
        this.actualCapacity = this.initialCapacity;
        this.latency = latency;
    }

    public CacheServer(int id, int capacity) throws IllegalArgumentException{
        super();
        this.id = id;
        if(capacity < 1 || capacity > 500000) throw new IllegalArgumentException();
        this.initialCapacity = capacity;
        this.actualCapacity = this.initialCapacity;
    }

    @Override
    public void addVideo(Video video) throws Exception {
        if(this.actualCapacity - video.getVideoSize() < 0)
            throw new CacheServerCapacityException();
        super.addVideo(video);
        this.actualCapacity -= video.getVideoSize();
    }



    public int getId(){
        return this.id;
    }

    public int getInitialCapacity(){
        return this.initialCapacity;
    }

    public int getActualCapacity(){
        return this.actualCapacity;
    }

    public int getLatency() {
        return this.latency;
    }

    public CacheServer clone(){
    	CacheServer newCache = new CacheServer(id, initialCapacity);
    	return newCache;
    }
}
