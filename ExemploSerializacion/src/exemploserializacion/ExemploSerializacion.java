package exemploserializacion;

import java.io.IOException;

public class ExemploSerializacion {

    public static void main(String[] args) throws IOException {
        Metodos obxfich = new Metodos();
        obxfich.escribirFicheiro("persoas.dat");         
        obxfich.lerFicheiro("persoas.dat");
        obxfich.engadeFicheiro("persoas.dat");
        obxfich.lerFicheiro("persoas.dat");
    }
}
