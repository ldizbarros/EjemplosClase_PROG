package exemploarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploArrayList {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("Hola");
        lista.add(1.6);
        lista.add('A');
        
//        for(int i=0;i<lista.size();i++){
//            System.out.println(lista.get(i));
//        }
//        
//        for(Object elemento:lista){
//            System.out.println(elemento);
//        }
       
        Metodos obx1 = new Metodos();
        
        ArrayList <Integer> listaNumeros = new ArrayList();

        System.out.println("******** MENU *********\n"
                + "1)Añadir elemento a la lista\n"
                + "2)Mostrar lista\n"
                + "3)Borrar elemento por posiscion\n"
                + "4)Borrar elemento especificado\n"
                + "5)Cambiar elemento por posiscion\n"
                + "6)Cambiar elemento especificado\n"
                + "7)Mostrar el numero mayor y menos\n"
                + "8)Crear ArrayList de numeros pares\n"
                + "0)Salir\n");
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Intruduce una opcion"));
        
        while(opcion!=0){
            switch(opcion){
                case 1: obx1.engadirElemento(listaNumeros);
                        break;
                case 2: obx1.amosar(listaNumeros);
                        break;
                case 3: int posicion = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la posiscion a borrar"));
                        obx1.borrarElementoPosicion(listaNumeros, posicion);
                        break;
                case 4: int elemento = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el elemento a borrar"));
                        obx1.borrarElemento(listaNumeros, elemento);
                        break;
                case 5: int posicion2 = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la posiscion del elemento a cambiar"));
                        obx1.cambiarElementoPosicion(listaNumeros, posicion2);
                        break;
                case 6: int elemento2 = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el elemento a cambiar"));
                        obx1.cambiarElemento(listaNumeros, elemento2);
                        break;
                case 7: obx1.mayorMenorElemento(listaNumeros);
                        System.out.println("Numero mayor: "+Metodos.mayor+" Numero menor: "+Metodos.menor);
                        break;
                case 8: ArrayList <Integer> listaPares = obx1.arrayPares(listaNumeros);
                        obx1.amosar(listaPares);
                        break;
                case 0: break;
                default: System.out.println("Opcion no valida");
            }
            
            System.out.println("******** MENU *********\n"
                + "1)Añadir elemento a la lista\n"
                + "2)Mostrar lista\n"
                + "3)Borrar elemento por posiscion\n"
                + "4)Borrar elemento especificado\n"
                + "5)Cambiar elemento por posiscion\n"
                + "6)Cambiar elemento especificado\n"
                + "7)Mostrar el numero mayor y menos\n"
                + "8)Crear ArrayList de numeros pares\n"
                + "0)Salir\n");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Intruduce una opcion"));
        }

    }
    
}
