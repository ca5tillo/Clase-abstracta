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
public class ProfesorTitular extends Profesor {

    // Constructor ejemplo aprenderaprogramar.com

    public ProfesorTitular(String nombre, String apellidos, int edad, String id) {
        super(nombre, apellidos, edad, id);
    }

    @Override
    public float importeNomina() {
        return 30f * 43.20f;
    }  //Método abstracto sobreescrito en esta clase
} //Cierre de la clase
