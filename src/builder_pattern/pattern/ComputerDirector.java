package builder_pattern.pattern;

public class ComputerDirector {

    public Computer buildGamingPC() {
        return Computer.Builder.builder()
                .withCpu("Intel i9")
                .withRam("32GB")
                .withStorage("1TB SSD")
                .withGpu("NVIDIA RTX 4080")
                .withOs("Windows 11")
                .build();
    }

    public Computer buildOfficePC() {
        return Computer.Builder.builder()
                .withCpu("Intel i5")
                .withRam("16GB")
                .withStorage("512GB SSD")
                .withGpu("Integrated Graphics")
                .withOs("Windows 10")
                .build();
    }

    public Computer buildLinuxServer() {
        return Computer.Builder.builder()
                .withCpu("AMD Ryzen 7")
                .withRam("64GB")
                .withStorage("2TB NVMe")
                .withGpu("None")
                .withOs("Ubuntu Server")
                .build();
    }
}
