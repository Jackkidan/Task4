public class Chocolate extends Sweets {

    private int kkal;

    protected Chocolate(String name,int weight) {
        super(name, weight);
        this.kkal = 550;
    }

    @Override
    public String getUnique() {
        return kkal + "kkal";
    }

}