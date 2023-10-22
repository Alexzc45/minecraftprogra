package minecraft;

public class Minecraft {

    public static void main(String[] args) {
        
        System.out.println("----------------------------");
        Minero minero1 = new Minero("excavador",30,"eficiencia minando",80,200);       
        minero1.minarbloque();
        System.out.println("----------------------------");
        Constructor constructor1 = new Constructor("Arquitecto",25,"habilidad de construccion",90,150);
        constructor1.construiredificio();
        System.out.println("----------------------------");        
        Explorador explorador1 = new Explorador("Aventurero",25,"rango de exploracion",70,180);
        explorador1.explorarNuevoTerreno();     
        System.out.println("----------------------------");
        minero1.setNivelExperiencia(35);
        minero1.minarbloque();
        System.out.println("----------------------------");
        constructor1.setBloquesRecolectados(200);
        constructor1.construiredificio();
        System.out.println("----------------------------");
    }   
}
