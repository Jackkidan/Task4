
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Gift {

    private List<Sweets> gift = new ArrayList();

    public void showGift() {

        for (Sweets f : gift) {
            System.out.println(f.getName());
        }
    }

    public void chocolateCount() {
        long sweetCount = gift.stream().filter((p) -> p instanceof Chocolate).count();
        System.out.println("Количество шоколадок в подарке: " + sweetCount);
    }

    public void getSweetClass() {
        gift.stream().forEach(sweets -> System.out.println(sweets.getName() + " " + sweets.getClass()));
    }


    public void addCandy(Sweets sweet, Predicate<Sweets> predicate) {
        if (predicate.test(sweet)) {
            gift.add(sweet);
        }
    }

    public void removeCandy(String sweet) {

        //Поиск по совпадающему значению из списка. Ошибки быть не может т.к. выпонляется поиск из этого самого списка

        for (int i = 0; i < gift.size(); i++) {
            if (sweet.equals("Мармеладка") && gift.get(i) instanceof Marmalade) {
                gift.remove(i);
                break;
            } else if (sweet.equals("Шоколадка") && gift.get(i) instanceof Chocolate) {
                gift.remove(i);
                break;
            } else if (sweet.equals("Конфетка") && gift.get(i) instanceof Jellybean) {
                gift.remove(i);
                break;
            }
        }
    }


    public void converterEUR(double cost) {
        Function<Double, String> convert = x->
                BigDecimal.valueOf(cost / 80).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue() + " Евро";
        System.out.println(convert.apply(cost));
    }


    public void converterAll(double cost, double rate) {
        Function<Double, String> convert = x->
                BigDecimal.valueOf(cost / rate).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue() + " Единиц";
        System.out.println(convert.apply(cost));
    }
}