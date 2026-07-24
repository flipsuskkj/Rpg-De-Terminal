package armaduras;

import materiais.Material;

public class Armadura {
    protected String nome;
    protected Material material;

    protected int defesa;
    protected int durabilidadeAtual;

    public Armadura(String nome, Material material, int defesaBase){
        this.nome = nome;
        this.material = material;
        this.defesa = defesaBase + material.getDefesa();
        this.durabilidadeAtual = material.getDurabilidade();
    }

    public String getNome() {
        return nome;
    }

    public Material getMaterial() {
        return material;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDurabilidadeAtual() {
        return durabilidadeAtual;
    }
}
