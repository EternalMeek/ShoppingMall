/**
 * Tianjun Chen
 *
 * Singleton Pattern
 * This class create a display car
 * This class use singleton pattern so only one instance of display car would be initiated.
 */
public class DisplayCar {

    private static DisplayCar displayCar = null;

    private String look;

    private DisplayCar() {
        look = "A display car in the center of mall.";
    }

    //create an instance if no display car exist
    //otherwise return the exist display car
    public static DisplayCar getInstance(){
        if(displayCar == null)
            displayCar = new DisplayCar();
        return displayCar;
    }

    public void look(){
        System.out.println("------------------------------------------------------------------\n");
        System.out.println(look);
        System.out.println("\n------------------------------------------------------------------");
    }
}
