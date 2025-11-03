package adapter_pattern;

import adapter_pattern.adaptee.WeightMachineForBabies;
import adapter_pattern.adapter.WeightMachineAdapter;
import adapter_pattern.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies(30));
        System.out.println(weightMachineAdapter.getWeightInKg());

    }
}
