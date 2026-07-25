package locais.environment;

import armaduras.Capacete;
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
}