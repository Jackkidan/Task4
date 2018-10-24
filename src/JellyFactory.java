public class JellyFactory implements SweetFactory {

    @Override
    public Sweets createSweet(String name, int weight) {
        Jellybean jellybean = new Jellybean(name, weight);
        return jellybean;
    }
}
