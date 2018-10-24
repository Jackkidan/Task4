public class ChocoAndJellyFactory implements SweetFactory {

    @Override
    public Sweets createSweet(SweetType type) {
        switch (type) {
            case CHOCOLATE:
                return new Chocolate(550);
            case JELLYBEAN:
                return new Jellybean(5);
            default:
                return null;

        }
    }
}
