package br.com.estudo.estudo_mapstruct.dtos;

public class Contrato1DtoString {
    private String id;

    private String valor;

    private String dataAssinatura;

    private String mutuarioId;

    public Contrato1DtoString(String id, String valor, String dataAssinatura, String mutuarioId) {
        this.id = id;
        this.valor = valor;
        this.dataAssinatura = dataAssinatura;
        this.mutuarioId = mutuarioId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(String dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public String getMutuarioId() {
        return mutuarioId;
    }

    public void setMutuarioId(String mutuarioId) {
        this.mutuarioId = mutuarioId;
    }

    @Override
    public String toString() {
        return "Contrato1DtoString{" +
                "id='" + id + '\'' +
                ", valor='" + valor + '\'' +
                ", dataAssinatura='" + dataAssinatura + '\'' +
                ", mutuarioId='" + mutuarioId + '\'' +
                '}';
    }
}
