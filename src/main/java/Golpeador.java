package main.java;

public class Golpeador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;
    //private Integer skillsJugador;
    //private Integer pesoJugador;

    /**Constructor**/
    public Golpeador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba){
        super(pesoJugador, skillsJugador, escoba);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
        //this.skillsJugador = skillsJugador;
        //this.pesoJugador = pesoJugador;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador() + punteriaJugador + fuerzaJugador;
    }
}
