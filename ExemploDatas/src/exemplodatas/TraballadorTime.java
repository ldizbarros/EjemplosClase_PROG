package exemplodatas;

import java.time.LocalDate;

public class TraballadorTime {
    private String nome;
    private LocalDate dataAlta;
    private LocalDate dataBaixa;

    public TraballadorTime() {
    }

    public TraballadorTime(String nome, LocalDate dataAlta, LocalDate dataBAixa){
        this.nome = nome;
        this.dataAlta =  dataAlta;
        this.dataBaixa = dataBAixa;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public LocalDate getDataBaixa() {
        return dataBaixa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = dataAlta;
    }

    public void setDataBaixa(LocalDate dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " -- Data de Alta: " + dataAlta + " --  Data de Baixa: " +  dataBaixa;
    }
}
