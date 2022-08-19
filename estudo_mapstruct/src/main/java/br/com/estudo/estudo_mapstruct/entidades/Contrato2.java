package br.com.estudo.estudo_mapstruct.entidades;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Contrato2 {

    @EmbeddedId
    private Contrato2Id contrato2Id;

    private BigDecimal valor;

    private String cpf;

    private LocalDate dataAssinatura;

    @ManyToOne
    @JoinColumns({
                    @JoinColumn(name = "banco", referencedColumnName = "banco"),
                    @JoinColumn(name = "agencia", referencedColumnName = "agencia"),
                    @JoinColumn(name = "conta", referencedColumnName = "conta"),
                    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
            })
    @MapsId("mutuario2Id")
    private Mutuario2 mutuario2;

    public Contrato2() {
    }


    public Contrato2(Contrato2Id contrato2Id, BigDecimal valor, String cpf, LocalDate dataAssinatura, Mutuario2 mutuario2) {
        this.contrato2Id = contrato2Id;
        this.valor = valor;
        this.cpf = cpf;
        this.dataAssinatura = dataAssinatura;
        this.mutuario2 = mutuario2;
    }

    public Contrato2Id getContrato2Id() {
        return contrato2Id;
    }

    public void setContrato2Id(Contrato2Id contrato2Id) {
        this.contrato2Id = contrato2Id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(LocalDate dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Mutuario2 getMutuario2() {
        return mutuario2;
    }

    public void setMutuario2(Mutuario2 mutuario2) {
        this.mutuario2 = mutuario2;
    }

    @Override
    public String toString() {
        return "Contrato2{" +
                "contrato2Id=" + contrato2Id +
                ", valor=" + valor +
                ", dataAssinatura=" + dataAssinatura +
                ", mutuario2=" + mutuario2 +
                '}';
    }
}
