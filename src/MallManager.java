/**
 * Tianjun Chen
 *
 * The manager/supervisor? of the mall
 * inherit the ability from MallControl class
 * have the ability to process new store application
 */

public class MallManager extends MallControl{

    public MallManager(){
        newStore();
    }

    //allocating new store to the designate area in the mall
    private void newStore(){
        allocate("Diner", "restaurant", 3);
        allocate("Grocery Store", "grocery", 2);
        allocate("Camera Store", "electronic", 2);
        allocate("Cloth Store", "fashion", 1);
        allocate("Shoe Store", "sports", 1);
    }
}
