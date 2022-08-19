package br.com.estudo.estudo_mapstruct.entidades;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mutuario2 {
    @Id
    @EmbeddedId
    private Mutuario2Id mutuario2Id;

    private String nome;
    private String endereco;

    public Mutuario2() {
    }

    public Mutuario2(Mutuario2Id mutuario2Id, String nome, String endereco) {
        this.mutuario2Id = mutuario2Id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Mutuario2Id getMutuario2Id() {
        return mutuario2Id;
    }

    public void setMutuario2Id(Mutuario2Id mutuario2Id) {
        this.mutuario2Id = mutuario2Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Mutuario2{" +
                "id=" + mutuario2Id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
