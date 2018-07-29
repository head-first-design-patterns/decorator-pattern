public abstract class BeverageDecorator extends Beverage {
    public Beverage beverage;

    public abstract int cost();

    public abstract void display();
}
