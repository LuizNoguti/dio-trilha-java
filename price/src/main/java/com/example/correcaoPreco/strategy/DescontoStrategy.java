package com.example.correcaoPreco.strategy;

public class DescontoStrategy implements CorrecaoPrecoStrategy {

    private double percentualDesconto;

    public DescontoStrategy(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double corrigirPreco(double precoAtual) {
        return precoAtual * (1 - percentualDesconto/100);
    }
}
