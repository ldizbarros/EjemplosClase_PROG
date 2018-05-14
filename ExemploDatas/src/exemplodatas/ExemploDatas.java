package exemplodatas;

public class ExemploDatas {

    public static void main(String[] args){
        Metodos obx = new Metodos();
        
        obx.verDataAlta();
        obx.diferenciaDatas();
        
        TraballadorTime trab = obx.crearTraballadorTime();
        System.out.println(trab);
        
        obx.antiguedade();
    }
    
}
