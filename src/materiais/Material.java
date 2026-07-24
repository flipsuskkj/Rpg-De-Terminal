package materiais;

public enum Material {

    MADEIRA(1, 0, 10),
    PEDRA(2, 1, 20),
    COBRE(3, 2, 35),
    FERRO(6, 5, 80),
    OURO(5, 3, 7),
    ESMERALDA(10, 11, 120),
    DIAMANTE(12, 13, 200),
    RUBI(14, 10, 100),
    TITANIO(16, 15, 300),
    ADAMANTITA(18, 18, 400);


    private final int dano;
    private final int defesa;
    private final int durabilidade;


    Material(int dano, int defesa, int durabilidade) {
        this.dano = dano;
        this.defesa = defesa;
        this.durabilidade = durabilidade;
    }


    public int getDano() {
        return dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDurabilidade() {
        return durabilidade;
    }
}