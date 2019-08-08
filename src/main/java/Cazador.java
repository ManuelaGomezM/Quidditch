package main.java;

public class Cazador extends Jugador {
    private Integer punteriaJugador;
    private Integer fuerzaJugador;

    /**
     * Constructor
     **/
    public Cazador(Integer punteriaJugador, Integer fuerzaJugador, Double pesoJugador, Integer skillsJugador, Escoba escoba, Equipo equipo) {
        super(pesoJugador, skillsJugador, escoba, equipo);
        this.punteriaJugador = punteriaJugador;
        this.fuerzaJugador = fuerzaJugador;
    }

    public Double habilidadJugador() {
        return super.habilidadJugador() + punteriaJugador * fuerzaJugador;
    }

    /**
     * 4a
     **/

    public Boolean puedeBloquear(Jugador unjugador) {
        return this.lePasaElTrapo(unjugador);
    }

    //3a//

    //public Boolean Jugar (){
    //return false;
    //}

    public Boolean intentaMeterGol() {
        return this
    }
}

