package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Conta con1 = new Conta("Perico to loco","25698745F","ES09 99089 97873 097889798",24000);
        System.out.println(con1.toString());
        
        Persoa p1 = new Persoa("lolo","25698745W");
        con1.setTitular(p1);
        System.out.println(con1.toString());
        
        Persoa p2 = new Persoa("pepe","36989745R");
        Conta con2 = new Conta(p2,"ES09 99089 97873 097889798",4000);
        System.out.println(con2.toString());
        
    }
    
}