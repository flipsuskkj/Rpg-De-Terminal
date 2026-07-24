package armas;

import materiais.Material;

public abstract class Arma {

    protected String nome;
    protected Material material;
    protected int durabilidadeAtual;

    public Arma(String nome, Material material) {
        this.nome = nome;
        this.material = material;
        this.durabilidadeAtual = material.getDurabilidade();
    }

    public Arma(){}

    public int getDano() {
        return material.getDano();
    }

    public Material getMaterial(){
        return material;
    }

    public abstract void atacar();

    public boolean estaQuebrada() {
        return durabilidadeAtual <= 0;
    }

    public int getDurabilidadeAtual() {
        return durabilidadeAtual;
    }
}