package exemploarraybidimensional;

import javax.swing.JOptionPane;

public class Notas {
    int[][] notas = new int[4][3];
    int[] medias = new int[notas.length];
    
    public void crearTaboa() {
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas[fila].length; columna++) {
                notas[fila][columna] = Integer.parseInt(JOptionPane.showInputDialog("nota "));
            }
        }
    }
    
    public void amosar() {
        for (int f = 0; f < notas.length; f++) {
            System.out.print("| ");
            for (int c = 0; c < notas[f].length; c++) { //notas[f].length devuelve numero  de columnas
                System.out.print(notas[f][c] + "  ");
            }
            System.out.println("|\n");
        }
    }

    public void mediaAlumno() {
        int acu, f, c;
        for (f = 0; f < notas.length; f++) {
            acu = 0;
            for (c = 0; c < notas[f].length; c++) {
                acu = acu + notas[f][c];
            }
            System.out.println("media = " + acu / notas[f].length); //muestra la media de cada fila
        }
    }
    
    public int[] mediaAlumno2() {
        int acu, f, c;
        for (f = 0; f < notas.length; f++) {
            acu = 0;
            for (c = 0; c < notas[f].length; c++) {
                acu = acu + notas[f][c];
            }
            medias[f]= acu / notas[f].length;
        }
        return medias;
    }
    
    public void mediaModulo(){
        int c,f,acu;
        int []mediasModulos = new int [notas[0].length];
        for(c=0;c<notas[0].length;c++){
            acu=0;
            for (f = 0; f < notas.length; f++) {
                acu=acu+notas[f][c];
            }
            System.out.print(acu+" "); //Muestra la suma de cada columna
            mediasModulos[c]=acu/notas.length;
        }
    }
    
    public void ordenar(){
        int i,j,aux1,k,aux2;
        for (i=0;i<medias.length-1;i++){
            for(j=0;j<medias.length;j++){
                if (medias[i]>medias[j]){
                    aux1=medias[i];
                    medias[i]=medias[j];
                    medias[j]=aux1;
                    for(k=0;k<notas[0].length;k++){
                        aux2=notas[i][k];
                        notas[i][k]=notas[j][k];
                        notas[j][k]=aux2;
                    }
                }
            }
        }
    }
}
