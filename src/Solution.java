
public class Solution {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Sweets chocolate = factory.createSweet(Factory.SweetType.CHOCOLATE);
        Sweets marmalade = factory.createSweet(Factory.SweetType.MARMALADE);
        Sweets jellybean = factory.createSweet(Factory.SweetType.JELLYBEAN);

        System.out.println(chocolate.getName()+" "+chocolate.getUnique());


    }
}
