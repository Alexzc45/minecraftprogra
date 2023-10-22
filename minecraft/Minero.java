package minecraft;

public class Minero extends JugadorMinecraft {
    
    private int eficenciaminando;

    public Minero(String nombre, int nivelExperiencia, String especialidad,int eficenciaminando,  int bloquesRecolectados) {
        super(nombre, nivelExperiencia, especialidad, bloquesRecolectados);
        this.eficenciaminando = eficenciaminando;
    }

    public void minarbloque(){
        System.out.println("Es el jugador: "+nombre);
        System.out.println("tiene un nivel de experiencia de: "+nivelExperiencia);
        System.out.println("Especialidad de: : "+especialidad);
        System.out.println(especialidad+" : "+eficenciaminando);
        System.out.println("Sus bloques recolectados son: "+bloquesRecolectados);     
    }
}
