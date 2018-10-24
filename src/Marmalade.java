public class Marmalade extends Sweets {
    private String color;

    protected Marmalade(String color) {
        super("Мармеладка", 10, 5);
        this.color = color;
    }

    @Override
    public String getUnique() {
        return "Цвет: " + color;
    }

}