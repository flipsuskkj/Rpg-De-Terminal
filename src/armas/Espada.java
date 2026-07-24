package armas;

import materiais.Material;

public class Espada extends Arma{

    public Espada(String nome, Material material){
        super(nome, material);
    }
    public Espada{
        super();
    }

    @Override
    public void atacar(){
        durabilidadeAtual -= 1;
    }
    public void ataqueForte(){
        durabilidadeAtual -= 2;
    }
}
