/**
 * Tianjun chen
 *
 * I/O
 * display options to the customer
 * changes base on the input
 */

import java.util.Scanner;

public class CustomerAction {

    private boolean inStore = true;

    MallManager mallManager = new MallManager();
    //initialize the location to first floor
    //this is where customers enter
    Mall mall = mallManager.firstFloor;

    public void movement(){
            while (inStore) {
                mall.display();
                System.out.print("\nCustomer decides to: ");
                Scanner input = new Scanner(System.in);
                String decision = input.next();

                if (decision.equalsIgnoreCase("u"))
                    mall = mall.moveUp();
                else if (decision.equalsIgnoreCase("d"))
                    mall = mall.moveDown();
                else if (decision.equalsIgnoreCase("l"))
                    DisplayCar.getInstance().look();
                else if (decision.equalsIgnoreCase("e")) {
                    System.out.println(mall.getCustomerLog().build().print());
                    inStore = false;
                } else if (isInt(decision)) {
                    //update the customer log if they went in some store
                    int select = Integer.parseInt(decision);
                    if (select <= mall.getStores().size()) {
                        mall.getStores().get(select - 1).enter();
                        if (mall.getStores().get(select - 1).getType() == StoreTypes.FASHION)
                            mall.getCustomerLog().goFashion();
                        else if (mall.getStores().get(select - 1).getType() == StoreTypes.GROCERY)
                            mall.getCustomerLog().goGrocery();
                        else if (mall.getStores().get(select - 1).getType() == StoreTypes.RESTAURANT)
                            mall.getCustomerLog().goRestaurant();
                        else if (mall.getStores().get(select - 1).getType() == StoreTypes.ELECTRONIC)
                            mall.getCustomerLog().goElectronic();
                        else if (mall.getStores().get(select - 1).getType() == StoreTypes.SPORTS)
                            mall.getCustomerLog().goSports();
                    }
                } else
                    return;
            }
    }

    //check if the input contains only integer
    //in case there are more than one input character
    //i.e. more than 10 stores on one floor
    private boolean isInt(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isDigit(s.charAt(i))))
                return false;
        }
        return true;
    }
}
