package exemploclaseproxectos;

public class ExemploClaseProxectos {

    public static void main(String[] args) {
        CPU cpu1 = new CPU(2000,1000);
        Pantalla p1 =  new Pantalla("Philips",15.5F);
        Rato r1 = new Rato(new Mouse("con cable"));
        Ordenador o1 = new Ordenador(cpu1,p1,r1);
        
        //System.out.println(o1.toString());
        
        Ordenador o2 = new Ordenador(new CPU(500,2000),new Pantalla("Samsung",17.2F),new Rato(new Mouse("inalambrico")));
        
        //System.out.println(o2.toString());
        
        o1.getProcesador().setVelocidade(5000);
        
        //System.out.println(o1.toString());
        
        System.out.println(o2.getPantalla().getMarca());
        
        Ordenador o3 = new Ordenador();
        
        o3.getProcesador().setVelocidade(3000);
        o3.getProcesador().setMemoria(1500);
        o3.getPantalla().setMarca("Asus");
        o3.getPantalla().setPulgadas(13.2F);
        o3.getRato().getRato().setTipo("sen cables");

        System.out.println(o3.toString());
    }
    
}
