package P1923.CEITI.GherdelescuGrigore;

public enum TipulAvionului {
    TurboProp,
    Piston,
    Boeing,
    Regional;

    public String getTipulAvionului() {
        return this.name();
    }
}
