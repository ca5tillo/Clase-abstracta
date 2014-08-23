
package clase.abstracta;

public class Persona { //Código de la clase Persona ejemplo aprenderaprogramar.com

    private String nombre = "";
    private String apellidos = "";
    private int edad = 0;

    public Persona() {
        nombre = "";
        apellidos = "";
        edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        Integer datoEdad = edad;
        return "Nombre: "+nombre+"  Apellidos  "+apellidos+"  Edad  "+edad;
        //return "-Nombre: ".concat(nombre).concat(" -Apellidos: ").concat(apellidos).concat(" -Edad: ").concat(datoEdad.toString());
    }
} //Cierre de la clase
