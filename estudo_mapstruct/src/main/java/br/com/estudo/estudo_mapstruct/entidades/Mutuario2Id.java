package br.com.estudo.estudo_mapstruct.entidades;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Mutuario2Id implements Serializable {
    private String banco;

    private String agencia;

    private String conta;

    private String cpf;


    public Mutuario2Id() {
    }

    public Mutuario2Id(String banco, String agencia, String conta, String cpf) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Mutuario2Id{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
