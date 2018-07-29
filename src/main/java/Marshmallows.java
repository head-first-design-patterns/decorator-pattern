public class Marshmallows extends BeverageDecorator {
    public Marshmallows(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return beverage.cost() + 80;
    }

    public void display() {
        beverage.display();
        System.out.println(", with Marshmallows");
    }
}
