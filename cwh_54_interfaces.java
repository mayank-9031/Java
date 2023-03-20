interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    int x = 55;

    void blowHornK3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    public int x = 5;
    int speed = 30;

    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
        speed = speed -= decrement;
        System.out.println("speed after applying break is : " + speed);
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
        speed = speed += increment;
        System.out.println("speed after applying speed up is : " + speed);
    }

    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po po");
    }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(5);
        cycleHarry.speedUp(7);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        // System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
