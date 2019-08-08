package main.java;

import java.util.List;
import java.util.Random;

public class Guardian extends Jugador {
    private Integer nivelReflejos;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Guardian(Integer nivelReflejos, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo){
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.nivelReflejos = nivelReflejos;
        this.fuerzaJugador = fuerzaJugador;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+ nivelReflejos + fuerzaJugador;
    }

    /**Punto 4.a**/
    public Boolean puedeBloquear (Jugador jugador){
        Integer numero = (int) (Math.random() * 3) + 1;
        return numero==3;
    } //en los del equipo contrario

}
