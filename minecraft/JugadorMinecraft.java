package minecraft;

public abstract class JugadorMinecraft {
    
    protected String nombre;
    protected int nivelExperiencia;
    protected String especialidad;
    protected int bloquesRecolectados;

    public JugadorMinecraft(String nombre, int nivelExperiencia, String especialidad, int bloquesRecolectados) {
        this.nombre = nombre;
        this.nivelExperiencia = nivelExperiencia;
        this.especialidad = especialidad;
        this.bloquesRecolectados = bloquesRecolectados;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public void setBloquesRecolectados(int bloquesRecolectados) {
        this.bloquesRecolectados = bloquesRecolectados;
    }
    
}
