package com.example.correcaoPreco.strategy;

public class ReajusteStrategy implements CorrecaoPrecoStrategy {

    private double percentualReajuste;

    public ReajusteStrategy(double percentualReajuste) {
        this.percentualReajuste = percentualReajuste;
    }

    @Override
    public double corrigirPreco(double precoAtual) {
        return precoAtual * (1 + percentualReajuste/100);
    }
}
