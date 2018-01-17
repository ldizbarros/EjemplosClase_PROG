package exemploarraybasico;

import javax.swing.JOptionPane;

public class Temperatura {
    public void amosar(float [] temp){
        for(int i=0;i<temp.length;i++){
            System.out.println("Temperatura "+(i+1)+" = "+temp[i]);
        }
    }
    
    public void amosarTemperatura(float [] temp){
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion"));
        while (posicion>temp.length || posicion < 1){
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion"));
        }
        System.out.println("Temperatura "+(posicion)+" = "+temp[posicion-1]);
    }
    
    public void buscarTemperatura(float[] temp){
        boolean encontrado=false; //A temperatura non esta na lista
        float temperatura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura a buscar"));
        for (int i=0;i<temp.length;i++){
            if (temp[i]==temperatura){
                System.out.println("A temperatura intoducida encontrase na posicion "+(i+1));
                encontrado=true;
            }
        }
        if (encontrado==false){
            System.out.println("A temperatura intoducida no esta en la lista");
        }
        
    }
    
    public void ordenar(float[] temp){
        int i,j;
        float aux;
        for (i=0;i<temp.length-1;i++){
            for (j=i+1;j<temp.length;j++){
                if (temp[i]>temp[j]){
                    aux=temp[i];
                    temp[i]=temp[j];
                    temp[j]=aux;
                }
            }
        }
    }
}
