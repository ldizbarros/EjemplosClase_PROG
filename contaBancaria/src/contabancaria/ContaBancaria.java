package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

    /**
     * Codifica un programa para xestionar una conta bancaria. Para iso crea una
     * clase CONTA con 3 atributos: nome, numero de conta e saldo(double)
     * Constructores: por defecto e con prametros.
     * Metodos de acceso: para o numero de conta, para recibir o nome da 
     * conta e para mudar o saldo.
     * Metodo que reciba  una cantidad de cartos e os ingrese na nosa conta 
     * e devolva o slado final. Metodo que reciba una cantidade de cartos e os 
     * retire da nosa conta e mostre o saldo final. Pode quedar a conta en numeros negativos. 
     */
    public static void main(String[] args) {
        Conta con1 = new Conta("Perico to loco","25698745F","ES09 99089 97873 097889798",24000);
        System.out.println(con1.toString());
        
        Persoa p1 = new Persoa("lolo","25698745W");
        con1.setTitular(p1);
        System.out.println(con1.toString());
        
        
        //Conta libreta1 = new Conta();
        //System.out.println(libreta1.toString());
        //libreta1.setSaldo(1500);
        //libreta1.setNumConta("ES09 99089 97873 097889798");
        //System.out.println(libreta1.toString());
        
        //Conta libreta2 = new Conta("Ana","22222",5000);
        //System.out.println(libreta2.toString());
        //libreta2.setNumConta("1234");
        //System.out.println(libreta2.toString());
        
        //Scanner sc = new Scanner(System.in);
        //System.out.println( "Introduzca el nombre de la cuenta bancaria: " );
        //String nome = sc.nextLine();
        //System.out.println( "Introduzca el numero de cuenta: " );
        //String numConta = sc.next();
        //System.out.println( "Introduzca el saldo: " );
        //double saldo = sc.nextDouble();
        
        //Conta libreta3 = new Conta(nome,numConta,saldo);
        //System.out.println(libreta3.toString());
        //System.out.println("nuevo saldo: "+libreta3.ingresarSaldo(3000));
        //System.out.println("nuevo saldo: "+libreta3.quitarSaldo(1000));
        //System.out.println("nuevo saldo: "+libreta3.quitarSaldo(4000));
        //libreta3.anularConta();
        //System.out.println(libreta3.toString());
    }
    
}