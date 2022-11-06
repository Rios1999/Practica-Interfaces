package practicacompartidainterfaces;

/**
 * @author peluj
 */
public class Jugador extends Persona {

    private Double altura;
    private String posicion;
    private int pj;
    private boolean jugando;//true esta jugando, false 

    public Jugador(String dni, String name, String direc, boolean sx, Double a, String p, int par) {
        super(dni, name, direc, sx);

        if (!(a > 1.64)) {
            a = 1.70;
        }

        altura = a;

        switch (p.toLowerCase()) {
            case "base":
                this.posicion = "Base";
                break;
            case "escolta":
                this.posicion = "Escolta";
                break;
            case "alero":
                this.posicion = "Alero";
                break;
            case "ala-pivot":
                this.posicion = "Ala-pivot";
                break;
            case "pivot":
                this.posicion = "Pivot";
                break;
            default:
                this.posicion = "Alero";
                break;
        }

        pj = par;
        jugando = false;

    }

    public Double getAltura() {
        return altura;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public int setpartidosJugados() {
        return this.pj++;
    }

    public String sexo() {
        String cadena = "";
        if (super.sexo) {
            cadena += "El esta jugando";
        } else {
            cadena += "Ella esta jugando";

        }
        return cadena;
    }

    public void jugando() {
        if (jugando) {
            System.out.println(sexo() + "está jugando.");
        } else {
            System.out.println(sexo() + " no está jugando.");
        }
    }

    public String toString() {
        String cadena = "";
        cadena += "\n" + super.toString();
        cadena += " Altura: " + altura + "\n";
        cadena += " Su posición: " + posicion + "\n";

        if (super.sexo) {
            cadena += " jugador en " + pj + " partidos\n";
        } else {
            cadena += " jugadora en " + pj + " partidos\n";
        }
        if (jugando) {
            cadena += " Ahoramismo está jugando\n";
        } else {
            cadena += " Ahoramismo no está jugando\n";
        }

        return cadena;
    }
}
