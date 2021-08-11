/**
 * Tianjun Chen
 *
 * The mall structure(floors) will get created in this class
 */

public abstract class MallControl {

    protected FirstFloor firstFloor = FirstFloor.getInstance();
    protected SecondFloor secondFloor = SecondFloor.getInstance();
    protected ThirdFloor thirdFloor = ThirdFloor.getInstance();

    //categorize new store with given type to corresponding types in mall
    //assign the floor of new store base on the application
    protected void allocate(String name, String type, int floor){
        Store newStore;
        if(type.equalsIgnoreCase(StoreTypes.RESTAURANT.toString()))
            newStore = new Restaurant(name, floor);
        else if(type.equalsIgnoreCase(StoreTypes.ELECTRONIC.toString()))
            newStore = new Electronic(name, floor);
        else if(type.equalsIgnoreCase(StoreTypes.FASHION.toString()))
            newStore = new Fashion(name, floor);
        else if(type.equalsIgnoreCase(StoreTypes.SPORTS.toString()))
            newStore = new Sports(name, floor);
        else if(type.equalsIgnoreCase(StoreTypes.GROCERY.toString()))
            newStore = new Grocery(name, floor);
        else return;
        switch (newStore.getFloor()){
            case 1:
                firstFloor.addShop(newStore);
                break;
            case 2:
                secondFloor.addShop(newStore);
                break;
            case 3:
                thirdFloor.addShop(newStore);
                break;
        }
    }
}
