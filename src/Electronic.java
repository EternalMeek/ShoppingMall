/**
 * Tianjun Chen
 *
 * Factory Pattern
 * Subclass of Store
 * This are for Stores that sells Electronic
 */

public class Electronic extends Store{

    public Electronic(String name, int floor) {
        super(name, floor);
        setType(StoreTypes.ELECTRONIC);
    }

    //greeting when customer enters
    @Override
    public void enter() {
        reception = new GeneralStoreReception();
        reception.greeting(getName());
        reception.finish(getName());
    }
}
