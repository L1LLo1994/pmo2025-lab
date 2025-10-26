public class BasicArm implements RobotWithArms {

    private String name;
    private boolean busy;
    private int counterObj;
    private double energyCons;



    public BasicArm(String name) {
        this.name = name;
        this.busy = false;
        this.counterObj = 0;
        this.energyCons = 0;
    }


    public boolean isGrabbing() {
        return busy;
    }

    public boolean pickUp() {
        if(!this.isGrabbing()) {
             this.busy = true;
             this.energyCons += 0.5;
             this.counterObj++;
             return this.busy;   
        } else {
            return false;
        }
        }


    public boolean dropDown() {
        if(this.isGrabbing()) {
            this.busy = false;
            this.energyCons += 0.5;
            this.counterObj--;
            return true;
        } else {
            return this.busy;
        }
    }

    public double getConsuptionForPickUp() {
        return this.energyCons;
    
    }

   public double getConsuptionForDropDown() {
        return this.energyCons;

    
    }

    public String toString() {
        return "BasicArm = ["+this.name + ": " + this.energyCons + "]";

    }

    public int getCarriedItemsCount() {
        return counterObj;
    }
 


}
