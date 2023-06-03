package designpatterns.structural.decorator.iceream;

public class Customer {
    public static void main(String[] args) {
        IceCreamCone iceCreamCone =
                new ChocolateScoop(new VanillaScoop
                        (new ChocolateScoop(new BlueCone())));

        System.out.println(iceCreamCone.getConstituents());
        System.out.println(iceCreamCone.getCost());

        IceCreamCone chocolateIcecream = new ChocolateScoop(new OrangeCone());
        IceCreamCone TrippleChocolateIceCream = new ChocolateScoop(
                new ChocolateScoop(chocolateIcecream)
        );

        System.out.println(TrippleChocolateIceCream.getConstituents());
        System.out.println(TrippleChocolateIceCream.getCost());

    }
}
