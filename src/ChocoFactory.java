public class ChocoFactory implements SweetFactory {
    @Override
    public Sweets createSweet(String name, int cost) {
        Chocolate chocolate = new Chocolate(name, cost);
        return chocolate;

    }
}
