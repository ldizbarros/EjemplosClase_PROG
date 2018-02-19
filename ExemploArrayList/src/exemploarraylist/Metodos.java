package exemploarraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Metodos {
    
    static int mayor;
    static int menor;
    
    public void engadirElemento(ArrayList <Integer> lista){
        Integer num =  Integer.parseInt(JOptionPane.showInputDialog("Intruduce un numero entero"));
        lista.add(num);
    }
    
    public void amosar(ArrayList <Integer> lista){
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
    
    public void borrarElementoPosicion(ArrayList <Integer> lista,int pos){
        lista.remove(pos-1);
//        for(int i=0;i<lista.size();i++){
//            if (i==(pos-1)){
//                lista.remove(i);
//            }
//        }
    }
    
    public void borrarElemento(ArrayList <Integer> lista,int ele){
        lista.remove(new Integer (ele));
//        for(int i=0;i<lista.size();i++){
//            if(lista.get(i)==ele){
//                lista.remove(i);
//            }
//        }
    }
    
    public void cambiarElementoPosicion(ArrayList <Integer> lista,int pos){
        int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el nuevo elemento"));
        lista.set(pos-1,nuevoElemento);
//        for(int i=0;i<lista.size();i++){
//            if (i==(pos-1)){
//                int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el nuevo elemento"));
//                lista.remove(i);
//                lista.add(i, nuevoElemento);
//            }
//        }
    }
    
    public void cambiarElemento(ArrayList <Integer> lista,int ele){
        int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el nuevo elemento"));
        int pos = lista.indexOf(ele);
        lista.set(pos, nuevoElemento);
//        for(int i=0;i<lista.size();i++){
//            if(lista.get(i)==ele){
//                int nuevoElemento = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el nuevo elemento"));
//                lista.remove(i);
//                lista.add(i, nuevoElemento);
//            }
//        }
    }
    
    public void mayorMenorElemento(ArrayList <Integer> lista){
        Comparator<? super Integer> c = null;
        lista.sort(c);
        mayor=lista.get(lista.size()-1);
        menor=lista.get(0);
    }

    public ArrayList <Integer> arrayPares(ArrayList <Integer> lista){
        Iterator it = lista.iterator();
        ArrayList <Integer> listaPares = new ArrayList();
        while(it.hasNext()){
            int num= (int) it.next();
            if (num%2==0){
                listaPares.add(num);
            }
        }
        return listaPares;
    }
}
