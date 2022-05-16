/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas.respuestas.modelo;

import java.util.Vector;


/**
 *
 * @author Navas-JC
 */
public class ModeloUsuario {
    
  
   private String nombreUsuario;
   private int puntuacionUsuario;

    

    public ModeloUsuario() {
    }

    public ModeloUsuario(String nombreUsuario, int puntuacionUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.puntuacionUsuario = puntuacionUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getPuntuacionUsuario() {
        return puntuacionUsuario;
    }

    public void setPuntuacionUsuario(int puntuacionUsuario) {
        this.puntuacionUsuario = puntuacionUsuario;
    }

    
   
    
   

    
}
