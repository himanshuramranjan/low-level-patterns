package adapter_pattern.adaptee;

public class WeightMachineForBabies implements WeightMachine {
    private final double weight;

    public WeightMachineForBabies(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
