package builder_pattern.pattern2;

public class WoodenHouseBuilder extends HouseBuilder {

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden Poles Foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood and Bamboo Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden Roof with Tiles");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden Furniture and Rustic Finish");
    }
}
