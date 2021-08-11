/**
 * Tianjun Chen
 *
 * Subclass of Store
 * This is for stores that are restaurants
 */

public class Restaurant extends Store{

    public Restaurant(String name, int floor) {
        super(name, floor);
        setType(StoreTypes.RESTAURANT);
    }

    //greeting the customer when they enter
    @Override
    public void enter() {
        reception = new RestaurantReception();
        reception.greeting(getName());
        reception.finish(getName());
    }
}
