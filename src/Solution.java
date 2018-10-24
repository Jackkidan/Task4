import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        Gift gift = new Gift();

        ChocoFactory chocoFactory = new ChocoFactory();
        JellyFactory jellyFactory = new JellyFactory();

        // Фабрика мармеладок
        SweetFactory marmaladeFactory = (name, weight) -> {
            Marmalade marmalade = new Marmalade(name, weight);
            return marmalade;
        };

        // Еще одна фабрика шоколадок
        SweetFactory chocolateFactory = (name, weight) -> {
            Chocolate chocolate = new Chocolate(name, weight);
            return chocolate;
        };

        Sweets marma1 = marmaladeFactory.createSweet("Мармеладка1", 100);
        Sweets marma2 = marmaladeFactory.createSweet("Мармеладка2", 200);
        Sweets choco1 = chocolateFactory.createSweet("Шоколадка с фабрики 2", 500);

        Sweets chocolate1 = chocoFactory.createSweet("Шоколадка", 50);
        Sweets chocolate2 = jellyFactory.createSweet("Белая шоколадка", 60);
        Sweets jellybean1 = jellyFactory.createSweet("Конфетка", 20);

        Predicate<Sweets> predicate1 = (s) -> s instanceof Jellybean;
        Predicate<Sweets> predicate2 = (s) -> s instanceof Chocolate;

        gift.addCandy(marma1, predicate1);
        gift.addCandy(jellybean1, predicate1);
        gift.addCandy(choco1, predicate2);
        gift.showGift();
        System.out.println("---------------------------");

        System.out.println(chocolate1.getName());
        System.out.println(chocolate2.getName());
        System.out.println(jellybean1.getName());
        System.out.println(marma1.getName()+" "+marma1.getUnique());
        System.out.println(marma2.getName()+" "+marma1.getUnique());
        System.out.println(choco1.getName()+" "+choco1.getUnique());
    }

}
