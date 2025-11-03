package builder_pattern;

import builder_pattern.pattern2.*;

public class Client2 {
    public static void main(String[] args) {

        // Build Wooden House
        HouseBuilder woodenBuilder = new WoodenHouseBuilder();
        HouseDirector engineer = new HouseDirector(woodenBuilder);
        engineer.constructHouse();
        House woodenHouse = engineer.getHouse();
        System.out.println("🏠 Wooden House: " + woodenHouse);

        // Build Glass House
        HouseBuilder glassBuilder = new GlassHouseBuilder();
        engineer = new HouseDirector(glassBuilder);
        engineer.constructHouse();
        House glassHouse = engineer.getHouse();
        System.out.println("🏡 Glass House: " + glassHouse);
    }
}
