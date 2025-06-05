# Projeto Correção Automática de Preços

Este projeto demonstra um serviço que corrige automaticamente os preços de produtos utilizando o padrão Strategy para diferentes tipos de correções (desconto, reajuste, etc.).

O serviço pede autorização (simulação via console) antes de realizar a correção. Caso um erro aconteça, o serviço para.

## Estrutura

- `model/Produto.java`: Classe modelo para produtos.
- `strategy/CorrecaoPrecoStrategy.java`: Interface para estratégias de correção de preço.
- `strategy/DescontoStrategy.java`: Implementação de desconto.
- `strategy/ReajusteStrategy.java`: Implementação de reajuste.
- `service/CorrecaoPrecoService.java`: Serviço abstrato que gerencia correção com autorização e logs.
- `service/CorrecaoPrecoComAutorizacaoService.java`: Serviço que solicita autorização via console.
- `controller/CorrecaoPrecoController.java`: Controller REST para receber lista de produtos e corrigir.
- `test/CorrecaoPrecoServiceTest.java`: Testes unitários para o serviço.

## Como executar

1. Clone o projeto.
2. Execute `mvn clean install` para compilar e rodar testes.
3. Execute a aplicação com `mvn spring-boot:run`.
4. Use o endpoint REST `POST /api/correcao/produtos` para enviar uma lista JSON de produtos e obter os preços corrigidos.

Exemplo de JSON:
```json
[
  {"nome": "Arroz", "preco": 10.0},
  {"nome": "Feijão", "preco": 8.5}
]
