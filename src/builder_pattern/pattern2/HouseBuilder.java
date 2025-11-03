package builder_pattern.pattern2;

public abstract class HouseBuilder {
    protected House house;

    public void createNewHouse() {
        house = new House();
    }

    public House getHouse() {
        return house;
    }

    public abstract void buildFoundation();
    public abstract void buildStructure();
    public abstract void buildRoof();
    public abstract void buildInterior();
}
