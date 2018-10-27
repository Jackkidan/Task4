public class Chocolate extends Sweets {

    private String something;
    Enum type;

    enum ChocolateType {
        WHITE("Белый"), BLACK("Темный"), WITHNUTS("С орешками"), OTHER("Другая");
        private String description;
        ChocolateType(String description) {
            this.description = description;
        }

        public String getDescription() {return description;}

    }


    protected Chocolate(String name, int cost) {
        super(name, cost);
        this.something = "Без параметра";

    }

    protected Chocolate(String name, int cost, Enum type) {
        super(name, cost);
        this.type = type;
    }

    @Override
    public String getUnique() {
        return something;
    }
}