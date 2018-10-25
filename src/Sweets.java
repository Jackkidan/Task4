public abstract class Sweets{
    private String name;
    private double cost;

    protected Sweets(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    //Для получения уникального параметра
    abstract String getUnique();

    //Тут могли быть сеттеры на основные параметры
}