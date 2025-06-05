package com.example.controller;

import com.example.correcaoPreco.model.Produto;
import com.example.correcaoPreco.service.CorrecaoPrecoComAutorizacaoService;
import com.example.correcaoPreco.strategy.ReajusteStrategy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/correcao")
public class CorrecaoPrecoController {

    // Exemplo usando reajuste de 10%
    private final CorrecaoPrecoComAutorizacaoService correcaoService =
            new CorrecaoPrecoComAutorizacaoService(new ReajusteStrategy(10));

    @PostMapping("/produtos")
    public List<Produto> corrigirPrecos(@RequestBody List<Produto> produtos) {
        correcaoService.corrigir(produtos);
        return produtos;
    }
}
