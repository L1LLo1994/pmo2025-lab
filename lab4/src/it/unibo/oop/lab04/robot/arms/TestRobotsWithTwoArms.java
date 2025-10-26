public class TestRobotsWithTwoArms {

public static void main(String[] args) {

    RobotWithTwoArms robot1 =  new RobotWithTwoArms();

    robot1.getLeftArm().pickUp();
    robot1.getLeftArm().pickUp();
    robot1.getLeftArm().getCarriedItemsCount();
    robot1.getRightArm().pickUp();
    robot1.getLeftArm().dropDown();

    System.out.println("Nel braccio sx ci sono: " + robot1.getLeftArm().getCarriedItemsCount());
    System.out.println("Nel braccio dx ci sono: " + robot1.getRightArm().getCarriedItemsCount());
    System.out.println(robot1.getLeftArm().toString());


}    
}
