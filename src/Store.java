/**
 * Tianjun Chen
 *
 * Factory Pattern
 * Baseclass of Store
 * This class and subclasses implemented using Factory Pattern
 */

public abstract class Store {
    private String name;
    private StoreTypes type;
    private int floor;

    public Store(String name, int floor){
        this.name = name;
        this.floor = floor;
    }

    public IStoreReception reception;

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setType(StoreTypes type){
        this.type = type;
    }
    public void setFloor(int floor){
        this.floor = floor;
    }

    //Getters
    public String getName(){
        return name;
    }
    public StoreTypes getType(){
        return type;
    }
    public int getFloor(){
        return floor;
    }

    public abstract void enter();

}
