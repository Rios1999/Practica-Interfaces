package practicacompartidainterfaces;

/*
 * @author Guillermo Rubio Martin
 */
public class Persona {

    private String DNI;
    private String Nombre;
    private String direccion;
    protected boolean sexo;

    /*true = Masc | false = Fem*/

    public Persona(String dni, String name, String direc, boolean sx) {
        this.DNI = dni;
        this.Nombre = name;
        this.direccion = direc;
        this.sexo = sx;
    }

    public Persona(Persona copia) {
        this.DNI = copia.DNI;
        this.Nombre = copia.Nombre;
        this.direccion = copia.direccion;
        this.sexo = copia.sexo;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }
    
    
    @Override
    public String toString() {
        String res = "\n "+ this.Nombre + " - " + this.DNI;
        if (sexo) {
            res += "\n Es un chico";
        }else{
            res += "\n Es una chica";
        }
        res += "\n DirecciÃ³n: " + this.direccion;
        return res;
    }

}
