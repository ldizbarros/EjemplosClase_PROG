package exemplodatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Metodos {
    
    private DateFormat formatoData = new SimpleDateFormat("d/M/yyyy"); 
    
    public TraballadorDate crearTraballadorDate() throws ParseException{
        String fechaHoy = formatoData.format(new Date()); 
        TraballadorDate traballador1 = new TraballadorDate("Pepe","02/3/2015",fechaHoy);
        return traballador1;
    }
    
    public void verDataAlta(){
        try {
            TraballadorDate traballador = crearTraballadorDate();
            System.out.println("A data de alta de "+traballador.getNome()+" e "+formatoData.format(traballador.getDataAlta()));
        } catch (ParseException ex) {
            Logger.getLogger(TraballadorDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void diferenciaDatas(){
        try {
            TraballadorDate traballador = crearTraballadorDate();
            //Esto esta mal
            double anos = (traballador.getDataBaixa().getTime()-traballador.getDataAlta().getTime())/(1000*3600*60*24*365);
            System.out.println("A antiguadade de "+traballador.getNome()+" e de "+anos);
        } catch (ParseException ex) {
            Logger.getLogger(TraballadorDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public TraballadorTime crearTraballadorTime(){ 
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fecha = LocalDate.of(2015,03,05);
        TraballadorTime traballador1 = new TraballadorTime("Pepe",fecha,fechaHoy);
        return traballador1;
    }
    
    public void antiguedade(){
        TraballadorTime trab = crearTraballadorTime();
        Period dif = Period.between(trab.getDataAlta(), trab.getDataBaixa());
        System.out.println("Antiguedade = "+dif.getYears());
    }
}
