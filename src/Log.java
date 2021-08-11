/**
 * Tianjun Chen
 *
 * Builder Pattern
 * This class create a log of customer's action in the mall
 */

public class Log {

    private boolean fashion;
    private boolean sports;
    private boolean grocery;
    private boolean restaurant;
    private boolean electronic;
    private String report;

    //private constructor prevent this class get initiated from outside.
    private Log(){};

    //constructor
    private Log(LogBuilder logBuilder){
        this.fashion = logBuilder.fashion;
        this.sports = logBuilder.sports;
        this.grocery = logBuilder.grocery;
        this.restaurant = logBuilder.restaurant;
        this.electronic = logBuilder.electronic;
        this.report = logBuilder.report;
    }

    //builder of Log object
    public static class LogBuilder {
        //required parameters
        //initiated to false because customer just got in store, haven't gone to any store yet
        private boolean fashion = false;
        private boolean sports = false;
        private boolean grocery = false;
        private boolean restaurant = false;
        private boolean electronic = false;
        private static String report = "Customer went home with ";

        //optional parameters
        //changes when customer went into corresponding store
        private static String fashionLog = "";
        private static String sportsLog = "";
        private static String groceryLog = "";
        private static String restaurantLog = "";
        private static String electronicLog = "";

        //building the Log
        public LogBuilder goFashion(){
            fashionLog = "new clothes, ";
            this.fashion = true;
            return this;
        }

        public LogBuilder goSports(){
            sportsLog = "new shoes, ";
            this.sports = true;
            return this;
        }

        public LogBuilder goGrocery(){
            groceryLog = "some groceries, ";
            this.sports = true;
            return this;
        }

        public LogBuilder goRestaurant(){
            restaurantLog = "a full stomach.";
            this.restaurant = true;
            return this;
        }

        public LogBuilder goElectronic(){
            electronicLog = "new electronic devices, ";
            this.electronic = true;
            return this;
        }
        //end of building log

        //create a Log object
        public Log build(){
            if(!fashion && !sports && !grocery && !restaurant && !electronic)
                this.report = "Customer went home empty handed and empty stomach.";
            this.report += fashionLog + sportsLog + electronicLog + groceryLog + restaurantLog;
            return new Log(this);
        }
    }

    //return the finished log of customer's action in mall
    public String print(){
        return this.report;
    }
}
