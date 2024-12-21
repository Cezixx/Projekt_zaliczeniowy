package Test;

public enum Departament {
    SALES("Sprzedaż"),
    ADMINISTRATION("Administracja"),
    FINANCES("Finanse"),
    BOOKING("Rachunkowość");

    private String name;

    Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
