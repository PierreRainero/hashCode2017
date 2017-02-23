package hashCode2k17.theUnamedTeam.context;

public class CacheServer extends Server {
    private int id;
    private int capacity;

    public CacheServer(int id, int capacity) throws IllegalArgumentException{
        super();
        this.id = id;
        if(capacity < 1 || capacity > 500000) throw new IllegalArgumentException();
        this.capacity = capacity;
    }

    public int getId(){
        return this.id;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
