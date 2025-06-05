package com.example.correcaoPreco.service;

import com.example.correcaoPreco.model.Produto;
import com.example.correcaoPreco.strategy.CorrecaoPrecoStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class CorrecaoPrecoService {

    private static final Logger logger = LoggerFactory.getLogger(CorrecaoPrecoService.class);

    protected CorrecaoPrecoStrategy strategy;

    public CorrecaoPrecoService(CorrecaoPrecoStrategy strategy) {
        this.strategy = strategy;
    }

    protected abstract boolean autorizar();

    public void corrigir(List<Produto> produtos) {
        logger.info("Iniciando correção dos preços dos produtos...");

        if (!autorizar()) {
            logger.warn("Autorização negada. Correção abortada.");
            return;
        }

        try {
            for (Produto produto : produtos) {
                double precoOriginal = produto.getPreco();
                double precoCorrigido = strategy.corrigirPreco(precoOriginal);
                produto.setPreco(precoCorrigido);
                logger.info("Produto: {}, preço original: {}, preço corrigido: {}", produto.getNome(), precoOriginal, precoCorrigido);
            }
        } catch (Exception e) {
            logger.error("Erro durante a correção de preços. Abortando processo.", e);
            return;
        }

        logger.info("Correção finalizada com sucesso.");
    }
}
