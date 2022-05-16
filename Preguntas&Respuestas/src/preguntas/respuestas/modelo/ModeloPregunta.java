/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas.respuestas.modelo;

/**
 *
 * @author Navas-JC
 */
public class ModeloPregunta {
    
   private String pregunta,respuesA,respuestaB,respuestaC,respuestaD,respuestaCorrecta;
   
   
   

    public ModeloPregunta() {
    }

    public ModeloPregunta(String pregunta, String respuesA, String respuestaB, String respuestaC, String respuestaD, String respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuesA = respuesA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.respuestaD = respuestaD;
        this.respuestaCorrecta = respuestaCorrecta;
        
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesA() {
        return respuesA;
    }

    public void setRespuesA(String respuesA) {
        this.respuesA = respuesA;
    }

    public String getRespuestaB() {
        return respuestaB;
    }

    public void setRespuestaB(String respuestaB) {
        this.respuestaB = respuestaB;
    }

    public String getRespuestaC() {
        return respuestaC;
    }

    public void setRespuestaC(String respuestaC) {
        this.respuestaC = respuestaC;
    }

    public String getRespuestaD() {
        return respuestaD;
    }

    public void setRespuestaD(String respuestaD) {
        this.respuestaD = respuestaD;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }



    

    
    
}
