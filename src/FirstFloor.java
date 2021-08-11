/**
 * Tianjun Chen
 *
 * Subclass of Mall
 * This class also used singleton inorder to move other floors
 */

public class FirstFloor extends Mall {

    //Singleton pattern on first floor
    private static FirstFloor firstFloor = null;
    private FirstFloor(){
    };

    public static FirstFloor getInstance(){
        if(firstFloor == null)
            firstFloor = new FirstFloor();
        return firstFloor;
    }
    //end of singleton

    //list the available actions a customer can do on this floor
    @Override
    void display() {
        System.out.println("\nNow on 1st floor.");
        System.out.printf('\u2022'+"(U) - Move to 2nd floor%n");
        listShops();
        System.out.printf('\u2022'+"(L) - Look around.%n");
        System.out.printf('\u2022'+"(E) - Leave the mall.%n");
    }

    //move to the second floor
    //achieved because the second floor used singleton pattern
    @Override
    Mall moveUp() {
        return SecondFloor.getInstance();
    }

    //return null because this is the lowest floor of the mall
    //no lower floor exist
    @Override
    Mall moveDown() {
        System.out.println("This is bottom floor.");
        return null;
    }
}
