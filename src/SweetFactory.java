import jdk.nashorn.internal.objects.annotations.Function;
@FunctionalInterface
public interface SweetFactory {

    Sweets createSweet(String name, int cost);
}
