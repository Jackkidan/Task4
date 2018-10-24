public class Marmalade extends Sweets {
    private String color;

    protected Marmalade(String name, int weight) {
        super(name, weight);
        this.color = "Зеленый";
    }

    @Override
    public String getUnique() {
        return "Цвет: " + color;
    }

}