/**
 * Tianjun Chen
 *
 * Factory Pattern
 * Subclass of Store
 * This are Stores sell Fashion style
 */

public class Fashion extends Store{

    public Fashion(String name, int floor) {
        super(name, floor);
        setType(StoreTypes.FASHION);
    }

    //greeting the customer when they enter
    @Override
    public void enter() {
        reception = new GeneralStoreReception();
        reception.greeting(getName());
        reception.finish(getName());
    }
}
