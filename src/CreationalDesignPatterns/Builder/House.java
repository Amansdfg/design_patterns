package CreationalDesignPatterns.Builder;

public class House {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final boolean hasSwimmingPool;
    public House(HouseBuilder  builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }
    public String getFoundation() {
        return foundation;
    }
    public String getStructure() {
        return structure;
    }
    public String getRoof() {
        return roof;
    }
    public boolean hasGarage() {
        return hasGarage;
    }
    public boolean hasGarden() {
        return hasGarden;
    }
    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }
    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure +
                ", hasGarage=" + hasGarage + ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool + "]";
    }
    //Builder class
    public static class HouseBuilder {
        //Required parameters
        private final String foundation;
        private final String structure;
        private final String roof;
        //Optional parameters
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;
        public HouseBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }
        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }
        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }
        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }
        public House build() {
            return new House(this);
        }
    }

}
