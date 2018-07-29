public class CafeCoffeeDay {
    public static void main(String[] args) {
        Beverage hotChocolateOne = new HotChocolate();

        hotChocolateOne.display();
        System.out.println(hotChocolateOne.cost());

        System.out.println("");

        Beverage hotChocolateTwo = new HotChocolate();
        hotChocolateTwo = new Cream(hotChocolateTwo);

        hotChocolateTwo.display();
        System.out.println(hotChocolateTwo.cost());

        System.out.println("");

        Beverage hotChocolateThree = new HotChocolate();
        hotChocolateThree = new Cream(hotChocolateThree);
        hotChocolateThree = new Marshmallows(hotChocolateThree);
        hotChocolateThree = new Cream(hotChocolateThree);

        hotChocolateThree.display();
        System.out.println(hotChocolateThree.cost());

    }
}
