package armas;

import materiais.Material;

public class Machado extends Arma{
    public Machado(String nome, Material material){
        super(nome, material);
    }
    public Machado(){
        super();
    }

    @Override
    public void atacar(){
        durabilidadeAtual -= 2;
    }
    public void quebrarArmadura(){
        durabilidadeAtual -= 4;
    }
}
