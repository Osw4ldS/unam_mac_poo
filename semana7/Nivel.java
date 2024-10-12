package semana7;

public enum Nivel {
    PRINCIPIANTE("Principiante"),
    INTERMEDIO("Intermedio"),
    AVANZADO("Avanzado");

    private final String nivel;

    Nivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return nivel;
    }
}
