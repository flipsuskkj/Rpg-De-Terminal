package Enemy;

import armaduras.Armadura;
import armas.Arma;

public abstract class Inimigo {

    public Inimigo(int vida, int level, int defesa, int dano,
                   Armadura capacete, Armadura peitoral, Armadura botas,
                   Arma arma) {
        this.vida = vida;
        this.level = level;
        this.defesa = defesa;
        this.dano = dano;
        this.capacete = capacete;
        this.peitoral = peitoral;
        this.botas = botas;
        this.arma = arma;
    }

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
