import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        Gift gift = new Gift();

        ChocoFactory chocoFactory = new ChocoFactory();
        JellyFactory jellyFactory = new JellyFactory();

        // Конвертер в доллары

        // Фабрика мармеладок
        SweetFactory marmaladeFactory = (name, cost) -> {
            Marmalade marmalade = new Marmalade(name, cost);
            return marmalade;
        };

        // Еще одна фабрика шоколадок
        SweetFactory chocolateFactory = (name, cost) -> {
            Chocolate chocolate = new Chocolate(name, cost);
            return chocolate;
        };

        Sweets marma1 = marmaladeFactory.createSweet("Мармеладка1", 100);
        Sweets marma2 = marmaladeFactory.createSweet("Мармеладка2", 200);
        Sweets choco1 = chocolateFactory.createSweet("Шоколадка с фабрики 2", 500);
        Sweets chocolate1 = chocoFactory.createSweet("Шоколадка", 50);
        Sweets chocolate2 = chocoFactory.createSweet("Белая шоколадка", 60);
        Sweets jellybean1 = jellyFactory.createSweet("Конфетка", 20);

        Predicate<Sweets> predicate1 = (s) -> s instanceof Jellybean;
        Predicate<Sweets> predicate2 = (s) -> s instanceof Chocolate;
        Predicate<Sweets> predicate3 = (s) -> s.getCost() < 50;

        gift.addCandy(jellybean1, predicate1);
        gift.addCandy(choco1, predicate2);
        gift.addCandy(chocolate1, predicate2);
        gift.addCandy(chocolate2, predicate3); // Добавлена не будет
        gift.addCandy(marma1, predicate1); // Добавлена не будет
        gift.addCandy(marma2, predicate2); // добавлена не будет

        System.out.println("---------------------------");

        gift.chocolateCount(); // Подсчет объектов Chocolate

        System.out.println("---------------------------");

        gift.showGift();

        /*
        System.out.println(chocolate1.getName());
        System.out.println(chocolate2.getName());
        System.out.println(jellybean1.getName());
        System.out.println(choco1.getName()+" "+choco1.getUnique());
        */
        System.out.println("---------------------------");
        // Не добавленные, но созданные мармеладки
        System.out.println(marma1.getName() + " " + marma1.getUnique());
        System.out.println(marma2.getName() + " " + marma2.getUnique());
        System.out.println("---------------------------");
        // Вывод класса каждого объекта в подарке
        gift.getSweetClass();
        System.out.println("---------------------------");
        // Конвертер в евро

        gift.converter(marma1.getCost());


    }

}
