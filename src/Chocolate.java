public class Chocolate extends Sweets {

    private int kkal;

    protected Chocolate(int kkal) {
        super("Шоколадка", 50, 20);
        this.kkal = kkal;
    }

    @Override
    public String getUnique() {
        return kkal + "kkal";
    }

}