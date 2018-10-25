public class Jellybean extends Sweets {
    private int size;

    protected Jellybean(String name, int cost) {
        super(name, cost);
        this.size = 15;
    }

    @Override
    public String getUnique() {
        return "Размер: " + size;
    }

}