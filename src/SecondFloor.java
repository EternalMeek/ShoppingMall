/**
 * Tianjun Chen
 *
 * Subclass of Mall
 * This class also used singleton inorder to move other floors
 */

public class SecondFloor extends Mall {

    //singleton pattern
    private static SecondFloor secondFloor = null;
    private SecondFloor(){
    };

    public static SecondFloor getInstance(){
        if(secondFloor == null)
            secondFloor = new SecondFloor();
        return secondFloor;
    }
    //end of singleton patter

    //list the available actions a customer can do on this floor
    @Override
    void display() {
        System.out.println("\nNow on 2nd floor.");
        System.out.printf('\u2022'+"(U) - Move to 3rd floor.%n");
        listShops();
        System.out.printf('\u2022'+"(L) - Look around.%n");
        System.out.printf('\u2022'+"(D) - Move to 1st floor%n");
    }

    //move to the third floor
    //this works because third floor used singleton pattern
    @Override
    Mall moveUp() {
        return ThirdFloor.getInstance();
    }

    //move to the first floor
    //achieved because first floor used singleton pattern
    @Override
    Mall moveDown() {
        return FirstFloor.getInstance();
    }
}
