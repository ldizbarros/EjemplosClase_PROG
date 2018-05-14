package exemploclaseinterna;

public class ExemploClaseInterna {

    public static void main(String[] args) {
        ExternaInterna obx1 = new ExternaInterna();
        /*Este metodo nos vale si la clase interna es publica. (Interna Membro)*/
        //ExternaInterna.Interna obxIn = obx.new Interna();
        //obxIn.amosar();
        /*Si la clase es privada accedemos a ella mediante un metodo en la clase externa. (Interna Membro)*/
        obx1.verInterna();
        
        /*Clase interna tipo metodo*/
        InternaMetodo obx2 = new InternaMetodo();
        obx2.ver();
        
        InternaAnonima obx3 = new InternaAnonima();
        obx3.operacion();
    }
    
}
