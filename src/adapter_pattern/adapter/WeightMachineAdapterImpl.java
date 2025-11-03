package adapter_pattern.adapter;
import adapter_pattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    private final WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return weightMachine.getWeight() * .45;
    }
}
