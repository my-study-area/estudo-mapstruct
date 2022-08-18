package br.com.estudo.estudo_mapstruct.dtos;

import br.com.estudo.estudo_mapstruct.entidades.Mutuario1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Contrato1Dto {
    private Long id;

    private BigDecimal valor;

    private LocalDate dataAssinatura;

    private Long mutuarioId;

    public Contrato1Dto(BigDecimal valor, LocalDate dataAssinatura, Long mutuarioId) {
        this.valor = valor;
        this.dataAssinatura = dataAssinatura;
        this.mutuarioId = mutuarioId;
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

    public Long getMutuarioId() {
        return mutuarioId;
    }

    public void setMutuarioId(Long mutuarioId) {
        this.mutuarioId = mutuarioId;
    }

    @Override
    public String toString() {
        return "Contrato1Dto{" +
                "id=" + id +
                ", valor=" + valor +
                ", dataAssinatura=" + dataAssinatura +
                ", mutuarioId=" + mutuarioId +
                '}';
    }
}
