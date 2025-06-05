package com.exemplo.correcaoPreco.service;

import com.example.correcaoPreco.model.Produto;
import com.example.correcaoPreco.service.CorrecaoPrecoService;
import com.example.correcaoPreco.strategy.CorrecaoPrecoStrategy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CorrecaoPrecoServiceTest {

    class TestStrategy implements CorrecaoPrecoStrategy {
        @Override
        public double corrigirPreco(double precoAtual) {
            return precoAtual + 1;
        }
    }

    class TestService extends CorrecaoPrecoService {
        public boolean autorizado = true;

        public TestService(CorrecaoPrecoStrategy strategy) {
            super(strategy);
        }

        @Override
        protected boolean autorizar() {
            return autorizado;
        }
    }

    @Test
    void testCorrigirComAutorizacao() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 10.0));
        produtos.add(new Produto("Produto B", 20.0));

        TestService service = new TestService(new TestStrategy());
        service.autorizado = true;
        service.corrigir(produtos);

        assertEquals(11.0, produtos.get(0).getPreco());
        assertEquals(21.0, produtos.get(1).getPreco());
    }

    @Test
    void testCorrigirSemAutorizacao() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 10.0));
        TestService service = new TestService(new TestStrategy());
        service.autorizado = false;
        service.corrigir(produtos);

        assertEquals(10.0, produtos.get(0).getPreco());
    }
}
