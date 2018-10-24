public abstract class Sweets{
    private String name;
    private double weight;

    protected Sweets(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    //Для получения уникального параметра
    abstract String getUnique();

    //Тут могли быть сеттеры на основные параметры
}