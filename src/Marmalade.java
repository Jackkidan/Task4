public class Marmalade extends Sweets {
    private String color;

    protected Marmalade(String name, int cost) {
        super(name, cost);
        this.color = "Зеленый";
    }

    @Override
    public String getUnique() {
        return "Цвет: " + color;
    }

}