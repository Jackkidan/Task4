public class Jellybean extends Sweets {
    private int size;

    protected Jellybean(int size) {
        super("Жевательная конфета", 20, 10);
        this.size = size;
    }

    @Override
    public String getUnique() {
        return "Размер: " + size;
    }

}