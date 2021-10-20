package hu.petrik.bolygoprojekt.bolygo;

public enum Bolygo {
    MERKUR(1, 1),
    VENUSZ(2, 0),
    FOLD(3, 3);

    private final double tomeg;
    private final double sugar;

    Bolygo(double tomeg, double sugar) {
        this.tomeg = tomeg;
        this.sugar = sugar;
    }
}
