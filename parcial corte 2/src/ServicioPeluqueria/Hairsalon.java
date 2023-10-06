package ServicioPeluqueria;

public enum Hairsalon {
    COURT("mullet","corte de pelo que se caracteriza por ser más corto en la parte frontal y más largo en la parte trasera",15000) {
        @Override
        public String showServiceDescription() {
            return "mullet";
        }
    },
    NAILS("redondas","un solo color",14000) {
        @Override
        public String showServiceDescription() {
            return "redondas";
        }
    },
    DYE("blanco","parte superior",22000){
        @Override
        public String showServiceDescription() {
            return "blanco";
        }
    };
    private String name;
    private String description;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Hairsalon(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public abstract String showServiceDescription();
}
