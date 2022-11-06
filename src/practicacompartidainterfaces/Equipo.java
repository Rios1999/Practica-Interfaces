package practicacompartidainterfaces;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private int anio_fundacion;
    private double presupuesto;
    private int maximo;
    private int victorias;
    private ArrayList<Jugador> lista;

    public Equipo(String nombre, int max, int anio, double pre) {
        this.nombre = nombre;
        anio_fundacion = anio;
        presupuesto = 20000;
        maximo = 8;
        victorias = 0;
        lista = new ArrayList();

        if (max <= 12 && max >= 6) {
            maximo = max;
        }

        if (pre > 19700) {
            presupuesto = pre;
        }
    }

    public String anadirJugador(Jugador nuevo) {
        String cadena = "";

        if (inscripcion()) {
            lista.add(nuevo);
            cadena = "Se ha agregado el jugador correctamente";
        } else {
            cadena = "No se ha podido agregar el jugador.";
        }

        return cadena;
    }

    public boolean enEquipo(Jugador equipo) {
        return lista.contains(equipo);
    }

    public String quitarJugador(Jugador nuevo) {
        String cadena = "";

        if (lista.size() > 0) {
            lista.remove(nuevo);
            cadena = "Se ha eliminado el jugador correctamente";
        } else {
            cadena = "No se ha podido eliminar el jugador.";
        }

        return cadena;
    }

    public boolean inscripcion() {
        return (lista.size()< maximo);
    }

    public void aniadirVictoria() {
        this.victorias++;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setLista() {
        for(int i = 0;i<lista.size();i++) {
            lista.get(i).setpartidosJugados();
        }

    }

    @Override
    public String toString() {
        String cadena = "";

        cadena += "Nombre Del Club: " + this.nombre + "\n";
        cadena += "Año fundacion: " + this.anio_fundacion + "\n";
        cadena += "Presupuesto: " + this.presupuesto + "\n";
        cadena += "Victorias: " + this.victorias + "\n";

        for (int i = 0; i < lista.size(); i++) {
            cadena += "Jugador: " + lista.get(i) + "\n";
        }

        return cadena;

    }
}

