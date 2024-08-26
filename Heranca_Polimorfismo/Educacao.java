public enum Educacao {
    NENHUM(0), BASICO(1), MEDIO(2), GRADUACAO(3);

    private final int nivel;

    Educacao(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
