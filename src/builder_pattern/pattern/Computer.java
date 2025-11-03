package builder_pattern.pattern;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String os;

    // Private constructor to enforce use of builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // Static inner Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String os;

        // Entry point for builder (fluent style)
        public static Builder builder() {
            return new Builder();
        }

        public Builder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder withRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder withGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder withOs(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer {" +
                "CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", Storage='" + storage + '\'' +
                ", GPU='" + gpu + '\'' +
                ", OS='" + os + '\'' +
                '}';
    }
}

