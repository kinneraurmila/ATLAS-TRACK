package BuilderDesignPattern;

public class BuildPhone {

    // Product class with nested builder
    static class Mobile {
        private int storage;
        private int memory;

        // Private constructor
        private Mobile() {}

        public int getStorage() {
            return storage;
        }

        public int getMemory() {
            return memory;
        }

        @Override
        public String toString() {
            return "Mobile [Storage = " + storage + " GB, Memory = " + memory + " GB]";
        }

        // Static method to get builder
        public static Builder builder() {
            return new Builder();
        }

        // Nested static Builder class
        public static class Builder {
            private final Mobile mobile;

            public Builder() {
                this.mobile = new Mobile();
            }

            public Builder buildStorage(int storage) {
                mobile.storage = storage;
                return this;
            }

            public Builder buildMemory(int memory) {
                mobile.memory = memory;
                return this;
            }

            public Mobile build() {
                return mobile;
            }
        }
    }

}
