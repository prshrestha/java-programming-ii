package farmsimulator;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        /*BulkTank tank = new BulkTank();
         tank.getFromTank(100);
         tank.addToTank(25);
         tank.getFromTank(5);
         System.out.println(tank);

         tank = new BulkTank(50);
         tank.addToTank(100);
         System.out.println(tank);*/

        /*Cow cow = new Cow();
         System.out.println(cow);

         Alive livingCow = cow;
         livingCow.liveHour();
         livingCow.liveHour();
         livingCow.liveHour();
         livingCow.liveHour();

         System.out.println(cow);

         Milkable milkingCow = cow;
         milkingCow.milk();

         System.out.println(cow);
         System.out.println("");

         cow = new Cow("Ammu");
         System.out.println(cow);
         cow.liveHour();
         cow.liveHour();
         System.out.println(cow);
         cow.milk();
         System.out.println(cow);*/
        /*MilkingRobot milkingRobot = new MilkingRobot();
         Cow cow = new Cow();
         System.out.println("");

         BulkTank tank = new BulkTank();
         milkingRobot.setBulkTank(tank);
         System.out.println("Bulk tank: " + tank);

         for (int i = 0; i < 2; i++) {
         System.out.println(cow);
         System.out.println("Living..");
         for (int j = 0; j < 5; j++) {
         cow.liveHour();
         }
         System.out.println(cow);

         System.out.println("Milking...");
         milkingRobot.milk(cow);
         System.out.println("Bulk tank: " + tank);
         System.out.println("");*/
        /*Barn barn = new Barn(new BulkTank());
         System.out.println("Barn: " + barn);

         MilkingRobot robot = new MilkingRobot();
         barn.installMilkingRobot(robot);

         Cow ammu = new Cow();
         ammu.liveHour();
         ammu.liveHour();

         barn.takeCareOf(ammu);
         System.out.println("Barn: " + barn);

         LinkedList<Cow> cowList = new LinkedList<Cow>();
         cowList.add(ammu);
         cowList.add(new Cow());

         for (Cow cow : cowList) {
         cow.liveHour();
         cow.liveHour();
         }

         barn.takeCareOf(cowList);
         System.out.println("Barn: " + barn);*/
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());

        farm.liveHour();
        farm.liveHour();

        farm.manageCows();

        System.out.println(farm);
    }
}
