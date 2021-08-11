/**
 * Tianjun Chen
 *
 * Factory Pattern
 * Subclass of Store
 * This is for stores that sell groceries
 */

public class Grocery extends Store{

    public Grocery(String name, int floor) {
        super(name, floor);
        setType(StoreTypes.GROCERY);
    }

    //greeting the customer when they enter
    @Override
    public void enter() {
        reception = new GeneralStoreReception();
        reception.greeting(getName());
        reception.finish(getName());
    }
}
