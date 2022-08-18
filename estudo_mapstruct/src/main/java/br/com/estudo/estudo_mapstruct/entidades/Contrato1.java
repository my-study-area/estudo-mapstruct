package br.com.estudo.estudo_mapstruct.entidades;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Contrato1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    private LocalDate dataAssinatura;

    @ManyToOne
    @JoinColumn(name = "mutuario_id")
    private Mutuario1 mutuario1;

    public Contrato1(BigDecimal valor, LocalDate dataAssinatura, Mutuario1 mutuario1) {
        this.valor = valor;
        this.dataAssinatura = dataAssinatura;
        this.mutuario1 = mutuario1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Mutuario1 getMutuario1() {
        return mutuario1;
    }

    public void setMutuario1(Mutuario1 mutuario1) {
        this.mutuario1 = mutuario1;
    }

    @Override
    public String toString() {
        return "Contrato1{" +
                "id=" + id +
                ", valor=" + valor +
                ", dataAssinatura=" + dataAssinatura +
                ", mutuario1=" + mutuario1 +
                '}';
    }
}
