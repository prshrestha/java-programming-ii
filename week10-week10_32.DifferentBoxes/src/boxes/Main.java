package boxes;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        /*MaxWeightBox coffeeBox = new MaxWeightBox(10);
         coffeeBox.add(new Thing("Saludo", 5));
         coffeeBox.add(new Thing("Pirkka", 5));
         coffeeBox.add(new Thing("Kopi Luwak", 5));

         System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
         System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
         System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));*/

        /*OneThingBox box = new OneThingBox();
         box.add(new Thing("Saludo", 5));
         box.add(new Thing("Pirkka", 5));

         System.out.println(box.isInTheBox(new Thing("Saludo")));
         System.out.println(box.isInTheBox(new Thing("Pirkka")));*/
        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
    }
}
