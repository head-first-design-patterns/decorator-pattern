public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return beverage.cost() + 50;
    }

    public void display() {
        beverage.display();
        System.out.println(", with Cream");
    }
}
