package br.com.estudo.estudo_mapstruct.entidades;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Contrato2Id implements Serializable {
    private String banco;
    private String agencia;
    private String conta;
    private Long numero;

    public Contrato2Id() {
    }

    public Contrato2Id(String banco, String agencia, String conta, Long numero) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }
}
