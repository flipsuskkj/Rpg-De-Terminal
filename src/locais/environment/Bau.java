package locais.environment;

import armaduras.Armadura;
import armaduras.Botas;
import armaduras.Capacete;
import armaduras.Peitoral;
import armas.Arco;
import armas.Arma;
import armas.Espada;
import armas.Machado;
import materiais.Material;

import java.util.concurrent.ThreadLocalRandom;

public class Bau {

    public Arma gerarArma() {
        Material material = Material.sortearMat();
        int tipo = ThreadLocalRandom.current().nextInt(3);

        switch (tipo) {
            case 0:
                return new Espada("Espada de ", material);
            case 1:
                return new Machado("Machado de ", material);
            default:
                return new Arco("Arco de ", material, 0);
        }
    }

    public Armadura gerarArmadura(){
        Material material = Material.sortearMat();
        int tipo = ThreadLocalRandom.current().nextInt(3);
        switch(tipo){
            case 0:
                return new Botas("Botas de "+ material, material, material.getDefesa());
            case 1:
                return new Capacete("Capacete de "+ material, material, material.getDefesa());
            default:
                return new Peitoral("Peitoral de "+ material, material, material.getDefesa());
        }
    }

    public void bauRandomize(){
        int rand = ThreadLocalRandom.current().nextInt(2);
        if(rand == 1){
            gerarArma();
        } else {
            gerarArmadura();
        }
    }
}