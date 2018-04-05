package exemploserializar2;

import java.io.IOException;

public class ExemploSerializar2 {

    public static void main(String[] args) throws IOException {
        Metodos met = new Metodos();
        met.escribirFicheiro("ordenador.dat");
        met.lerFicheiro("ordenador.dat");
        met.engadeFicheiro("ordenador.dat");
        met.lerFicheiro("ordenador.dat");
    }    
}
