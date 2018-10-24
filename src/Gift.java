
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Gift {

    private List<Sweets> gift = new ArrayList();
    private double totalWeight;
    private double totalPrice;

    public void showGift() {

        for (Sweets f : gift) {
            System.out.println(f.getName());
        }
    }


    public String getTotalWeight() {
        String weight = "" + totalWeight;
        return weight;
    }

    public void addCandy(Sweets sweet, Predicate<Sweets> predicate) {
        if (predicate.test(sweet)){
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
}