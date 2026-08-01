package Enemy;

import armaduras.Armadura;
import armas.Arma;

public class Dragon extends Inimigo {
    public Dragon(int vida, int level, int defesa,
                  int dano, Armadura capacete, Armadura peitoral,
                  Armadura botas, Arma arma) {
        super(vida, level, defesa, dano, capacete, peitoral, botas, arma);

    }
}
