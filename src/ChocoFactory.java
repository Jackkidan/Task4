public class ChocoFactory implements SweetFactory {
    @Override
    public Sweets createSweet(String name, int weight) {
        Chocolate chocolate = new Chocolate(name, weight);
        return chocolate;

    }
}
