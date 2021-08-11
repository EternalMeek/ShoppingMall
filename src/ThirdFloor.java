/**
 * Tianjun Chen
 *
 * Subclass of Mall
 * This class also used singleton inorder to move other floors
 */

public class ThirdFloor extends Mall {

    //singleton pattern
    private static ThirdFloor thirdFloor = null;
    private ThirdFloor(){
    };

    public static ThirdFloor getInstance(){
        if(thirdFloor == null)
            thirdFloor = new ThirdFloor();
        return thirdFloor;
    }
    //end of singleton pattern

    //display available actions a customer can do on this floor
    @Override
    void display() {
        System.out.println("\nNow on 3rd floor.");
        listShops();
        System.out.printf('\u2022'+"(L) - Look around.%n");
        System.out.printf('\u2022'+"(D) - Move to 2nd floor.%n");
    }

    //return null because this is the top floor in the mall
    //no higher floor exist
    @Override
    Mall moveUp() {
        System.out.println("This is top floor.");
        return null;
    }

    //move to the second floor
    //achieved because the second floor used singleton pattern
    @Override
    Mall moveDown() {
        return SecondFloor.getInstance();
    }
}
