package minecraft;

public class Constructor extends JugadorMinecraft {
    
    private int habilidadconstruccion;

    public Constructor(String nombre, int nivelExperiencia,String especialidad, int habilidadconstruccion, int bloquesRecolectados) {
        super(nombre, nivelExperiencia, especialidad, bloquesRecolectados);
        this.habilidadconstruccion = habilidadconstruccion; 
    }
    public void construiredificio(){
        System.out.println("Es el jugador: "+nombre);
        System.out.println("tiene un nivel de experiencia de: "+nivelExperiencia);
        System.out.println("Especialidad de: : "+especialidad);
        System.out.println(especialidad+" : "+habilidadconstruccion);
        System.out.println("Sus bloques recolectados son: "+bloquesRecolectados); 
            
    }  
}
