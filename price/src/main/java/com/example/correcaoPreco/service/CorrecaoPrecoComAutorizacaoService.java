package com.example.correcaoPreco.service;

import com.example.correcaoPreco.strategy.CorrecaoPrecoStrategy;

import java.util.Scanner;

public class CorrecaoPrecoComAutorizacaoService extends CorrecaoPrecoService {

    public CorrecaoPrecoComAutorizacaoService(CorrecaoPrecoStrategy strategy) {
        super(strategy);
    }

    @Override
    protected boolean autorizar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite 'sim' para autorizar a correção dos preços:");
            String resposta = scanner.nextLine();
            return resposta.equalsIgnoreCase("sim");
        }
    }
}
