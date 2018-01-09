package exemplopaquetes;

import com.laura.taller.Taller;
import com.laura.ventas.Ventas;

public class ExemploPaquetes {

    public static void main(String[] args) {
        Coche coche1 = new Coche("1245RTP");
        Coche coche2 = new Coche("1128PTP");
        Ventas venta1 =  new Ventas(coche1,12000,"Citroen");
        Taller taller1 = new Taller(coche1,500F);
        Taller taller2 = new Taller(coche2,700F);
        
        
        //System.out.println(venta1.toString());
        //System.out.println(taller1.toString());
        
        taller1.costeArranxo(venta1);
        taller2.costeArranxo(venta1);
    }
    
}
