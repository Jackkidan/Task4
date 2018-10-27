public class ChocoFactory implements SweetEnumFactory {
    @Override
    public Sweets createSweet(String name, int cost, Enum num) {
        Chocolate chocolate = new Chocolate(name, cost, num);
        return chocolate;

    }
}
