public enum PassengerType {
    STANDARD("Standard", 1.0),
    GOLD("Gold", 0.9),
    PREMIUM("Premium", 0.0);

    private final String name;
    private final double discount;

    private PassengerType(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

}
