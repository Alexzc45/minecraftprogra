package minecraft;

public class Explorador extends JugadorMinecraft{
    
    private int explorarNuevoTerreno;

    public Explorador(String nombre, int nivelExperiencia, String especialidad,int explorarNuevoTerreno, int bloquesRecolectados) {
        super(nombre, nivelExperiencia, especialidad, bloquesRecolectados);
        this.explorarNuevoTerreno = explorarNuevoTerreno;
    }
 
    public void explorarNuevoTerreno(){
        System.out.println("Es el jugador: "+nombre);
        System.out.println("tiene un nivel de experiencia de: "+nivelExperiencia);
        System.out.println("Especialidad de: : "+especialidad);
        System.out.println(especialidad+" : "+explorarNuevoTerreno);
        System.out.println("Sus bloques recolectados son: "+bloquesRecolectados);   
    }  
}
