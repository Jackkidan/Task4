import jdk.nashorn.internal.objects.annotations.Function;
@FunctionalInterface
public interface SweetFactory {

    public enum SweetType {
        CHOCOLATE,
        MARMALADE,
        JELLYBEAN,
    }
    Sweets createSweet(SweetType type);
}
