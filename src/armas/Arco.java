package armas;

import materiais.Material;

public class Arco extends Arma{
    private int flechas;

    public Arco(String nome, Material material, int flechas) {
        super(nome, material);
        this.flechas = flechas;
    }
    public Arco(int flechas){
        super();
        this.flechas = flechas;
    }

    @Override
    public void atacar() {
        if(flechas > 0){
            flechas--;
            durabilidadeAtual--;
        }
    }
    public void flechaTripla(){
        if (flechas >= 3){
            flechas -= 3;
            durabilidadeAtual -= 3;
        }
    }
}
