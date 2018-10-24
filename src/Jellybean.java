public class Jellybean extends Sweets {
    private int size;

    protected Jellybean(String name, int weight) {
        super(name, weight);
        this.size = 15;
    }

    @Override
    public String getUnique() {
        return "Размер: " + size;
    }

}