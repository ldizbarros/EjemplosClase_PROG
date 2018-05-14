package exemplodatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TraballadorDate {
   
    private String nome;
    private Date dataAlta;
    private Date dataBaixa;
    private DateFormat formatoData; 

    public TraballadorDate() {
    }

    public TraballadorDate(String nome, String dataAlta, String dataBAixa) throws ParseException {
        this.nome = nome;
        formatoData = new SimpleDateFormat("d/M/yyyy");
        this.dataAlta = formatoData.parse(dataAlta);
        this.dataBaixa = formatoData.parse(dataBAixa);
    }

    public String getNome() {
        return nome;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " -- Data de Alta: " + formatoData.format(dataAlta) + " --  Data de Baixa: " +  formatoData.format(dataBaixa);
    }
    
}
