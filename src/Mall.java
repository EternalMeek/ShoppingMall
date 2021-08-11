/**
 * Tianjun Chen
 *
 * This is the base class for the mall structure
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Mall {

    //An arraylist that contain stores
    //each subclass will have their own store list because of polymorphism
    private List<Store> Stores = new ArrayList<>();
    private Log.LogBuilder customerLog = new Log.LogBuilder();

    //add new shop in the store list
    protected void addShop(Store s){
        Stores.add(s);
    }
    //Getters
    protected List<Store> getStores(){
        return Stores;
    }
    public Log.LogBuilder getCustomerLog() {
        return customerLog;
    }

    //list the stores from list
    //each subclass will have their own content in the list because of polymorphism
    protected void listShops(){
        for(Store s : Stores){
            System.out.printf('\u2022'+"("+(1+ Stores.indexOf(s))+") - " + s.getName()+"%n");
        }
    }

    abstract void display();
    abstract Mall moveUp();
    abstract Mall moveDown();

}
