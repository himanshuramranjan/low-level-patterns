package builder_pattern.pattern2;

public class GlassHouseBuilder extends HouseBuilder {

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete and Steel Foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Reinforced Steel and Glass Panels");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Tempered Glass Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Minimalist Interiors with Glass Dividers");
    }
}
