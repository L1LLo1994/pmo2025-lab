public class RobotWithTwoArms {

    private BasicArm left;
    private BasicArm right;
    
    public RobotWithTwoArms() {
        this.left = new BasicArm("Left Arm");
        this.right = new BasicArm("Right Arm");
    }

    public BasicArm getLeftArm() {
        return this.left;
    }

     public BasicArm getRightArm() {
        return this.right;
    }
}
