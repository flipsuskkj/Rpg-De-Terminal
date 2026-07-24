package Player;

import armaduras.Armadura;
import armas.Arma;

public class Player {

    private int vida = 20;
    private int dano = 1;
    private int defesa = 3;

    private Armadura capacete;
    private Armadura peitoral;
    private Armadura botas;

    private Arma arma;
    private int flechas;


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
