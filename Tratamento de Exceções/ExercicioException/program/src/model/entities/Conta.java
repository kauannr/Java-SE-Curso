package model.entities;

import model.exceptions.Domainexception;

public class Conta {

    private Integer numero;
    private String nome;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numero, String nome, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void depositar(Double valor) {
        saldo = saldo + valor;
    }

    public void sacar(Double valor) throws Domainexception {
        validacaoSaque(valor);
        saldo = saldo - valor;
    }

    private void validacaoSaque(Double valor) throws Domainexception {

        if (getSaldo() <= 0) {
            throw new Domainexception("Erro: Não há saldo suficiente");
        } else if (valor > getLimiteSaque()) {
            throw new Domainexception("Erro: O valor é maior do que o limite de saque");
        } else if (valor > getSaldo()) {
            throw new Domainexception("Erro: O valor é maior do que o saldo");
        }

    }
}
