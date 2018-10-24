
public class Solution {
    public static void main(String[] args) {
        ChocoFactory chocoFactory = new ChocoFactory();
        ChocoAndJellyFactory chocoAndJellyFactory = new ChocoAndJellyFactory();


        Sweets chocolate1 = chocoFactory.createSweet(SweetFactory.SweetType.CHOCOLATE);
        Sweets chocolate2 = chocoAndJellyFactory.createSweet(SweetFactory.SweetType.CHOCOLATE);
        Sweets jellybean1 = chocoAndJellyFactory.createSweet(SweetFactory.SweetType.JELLYBEAN);

        System.out.println(chocolate1.getName());
        System.out.println(chocolate2.getName());
        System.out.println(jellybean1.getName());

    }
}
