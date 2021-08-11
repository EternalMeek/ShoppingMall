/**
 * Tianjun Chen
 *
 * Factory Pattern
 * Subclass of Store
 * This are Stores that sell sports goods
 */

public class Sports extends Store{

    public Sports(String name, int floor) {
        super(name, floor);
        setType(StoreTypes.SPORTS);
    }

    //greeting customer when they enter
    @Override
    public void enter() {
        reception = new GeneralStoreReception();
        reception.greeting(getName());
        reception.finish(getName());
    }
}
