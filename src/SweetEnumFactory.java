@FunctionalInterface
public interface SweetEnumFactory {
    Sweets createSweet(String name, int cost, Enum num);
}
