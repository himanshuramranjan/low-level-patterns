package builder_pattern;

import builder_pattern.pattern.Computer;
import builder_pattern.pattern.ComputerDirector;

// Fluent Style Builder Pattern
public class Client {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        Computer gamingPC = director.buildGamingPC();
        Computer officePC = director.buildOfficePC();

        // Manual custom build using fluent style
        Computer customPC = Computer.Builder.builder()
                .withCpu("Apple M3")
                .withRam("16GB")
                .withStorage("1TB SSD")
                .withGpu("Integrated GPU")
                .withOs("macOS Sonoma")
                .build();

        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
        System.out.println("Custom PC: " + customPC);
    }
}