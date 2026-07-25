package materiais;

import java.util.concurrent.ThreadLocalRandom;

public enum Material {

    MADEIRA(1, 0, 10, 25),
    PEDRA(2, 1, 20, 20),
    COBRE(3, 2, 35, 16),
    FERRO(6, 5, 80, 12),
    OURO(5, 3, 7, 9),
    ESMERALDA(10, 11, 120, 7),
    DIAMANTE(12, 13, 200, 5),
    RUBI(14, 10, 100, 3),
    TITANIO(16, 15, 300, 2),
    ADAMANTITA(18, 18, 400, 1);


    private final int dano;
    private final int defesa;
    private final int durabilidade;
    private final int chance;


    Material(int dano, int defesa, int durabilidade, int chance) {
        this.dano = dano;
        this.defesa = defesa;
        this.durabilidade = durabilidade;
        this.chance = chance;
    }

    public int getChance() {
        return chance;
    }

    public static Material sortearMat(){
        int numero = ThreadLocalRandom.current().nextInt(100);
        int soma = 0;

        for (Material material : Material.values()) {
            soma += material.getChance();

            if (numero < soma) {
                return material;
            }
        }
            return null;
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