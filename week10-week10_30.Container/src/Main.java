
import containers.ProductContainer;
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        // write test code here
        /*ProductContainer juice = new ProductContainer("Juice", 1000.0);
         juice.addToTheContainer(1000.0);
         juice.takeFromTheContainer(11.3);
         System.out.println(juice.getName()); // Juice
         System.out.println(juice);           // volume = 988.7, free s*/

        /*ProductContainer juice = new ProductContainer("Juice", 1000.0);
         juice.addToTheContainer(1000.0);
         juice.takeFromTheContainer(11.3);
         System.out.println(juice.getName()); // Juice
         juice.addToTheContainer(1.0);
         System.out.println(juice);           // Juice: volume = 989.7,*/
        /*ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
         juice.takeFromTheContainer(11.3);
         System.out.println(juice.getName()); 
         juice.addToTheContainer(1.0);
         System.out.println(juice); 
         System.out.println(juice.history()); */
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        juice.addToTheContainer(1.0);

        juice.printAnalysis();

    }

}
