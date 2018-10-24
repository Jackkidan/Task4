

public class Factory {

    public enum SweetType {
        CHOCOLATE,
        MARMALADE,
        JELLYBEAN,
    }

    public Sweets createSweet(SweetType sweetType) {
        switch (sweetType) {
            case CHOCOLATE:
                return new Chocolate();
            case MARMALADE:
                return new Marmalade();
            case JELLYBEAN:
                return new Jellybean();
            default:
                return null;
        }
    }
}
