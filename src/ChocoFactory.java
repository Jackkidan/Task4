public class ChocoFactory implements SweetFactory {
    @Override
    public Sweets createSweet(SweetType type) {

        switch (type) {
            case CHOCOLATE :
            return new Chocolate(550);
            default: return null;
        }
    }
}
