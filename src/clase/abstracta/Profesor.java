/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.abstracta;

/**
 *
 * @author lp-ub-14
 */
public abstract class Profesor extends Persona {

    // Campo de la clase ejemplo aprenderaprogramar.com

    private String IdProfesor;

    // Constructores

    public Profesor() {
        super();
        IdProfesor = "Desconocido";
    }

    public Profesor(String nombre, String apellidos, int edad, String id) {
        super(nombre, apellidos, edad);
        IdProfesor = id;
    }

    // Métodos

    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void mostrarDatos() {
        System.out.println("Datos Profesor. Profesor de nombre: " + getNombre() + " "
                + getApellidos() + " con Id de profesor: " + getIdProfesor());
    }

    @Override
    public String toString() {
        return super.toString()+"  idProfesor "+IdProfesor;
        //return super.toString().concat(" -IdProfesor: ").concat(IdProfesor);
    }

    abstract public float importeNomina();  // Método abstracto
} //Cierre de la clase
