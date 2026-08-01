package Enemy;

import armaduras.Armadura;
import armas.Arma;

public class Goblin extends Inimigo {
    public Goblin(int vida, int level, int defesa, int dano, Armadura capacete, Armadura peitoral, Armadura botas, Arma arma) {
        super(vida, level, defesa, dano, capacete, peitoral, botas, arma);
    }
}
