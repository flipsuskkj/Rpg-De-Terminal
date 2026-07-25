package Enemy;

import armaduras.Armadura;
import armas.Arma;

public abstract class Inimigo {
    protected int vida;

    protected int level;
    
    protected int defesa;
    protected int dano;
    
    protected Armadura capacete;
    protected Armadura peitoral;
    protected Armadura botas;
    
    protected Arma arma;

    public int getDefesaTotal(){
        if(capacete != null)
            defesa += capacete.getDefesa();
        if(peitoral != null)
            defesa += peitoral.getDefesa();
        if(botas != null)
            defesa += botas.getDefesa();
        return defesa;
    }
    public int getDanoTotal(){
        if(arma != null)
            dano += arma.getDano();
        return dano;
    }
    
}
