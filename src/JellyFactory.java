public class JellyFactory implements SweetFactory {

    @Override
    public Sweets createSweet(String name, int cost) {
        Jellybean jellybean = new Jellybean(name, cost);
        return jellybean;
    }
}
