/**
 * Tianjun Chen
 *
 * Strategy Pattern
 * concrete class that implement the IStoreReception interface
 * This class will represent the greeting of a general store
 */

public class GeneralStoreReception implements IStoreReception {
    @Override
    public void greeting(String name) {
        System.out.println("------------------------------------------------------------------\n");
        System.out.println("Welcome to "+name);
    }

    @Override
    public void finish(String name) {
        System.out.println("Thanks for shopping at "+name);
        System.out.println("\n------------------------------------------------------------------");
    }
}
