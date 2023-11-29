# Adapter Pattern in Java 😁

## Objetivo do Projeto 🚀

Este projeto demonstra a implementação do padrão de design Adapter em Java. O padrão Adapter é um padrão estrutural que facilita a colaboração entre objetos com interfaces incompatíveis, permitindo que classes que não poderiam trabalhar juntas devido às diferenças nas interfaces colaborem sem a necessidade de alterar o código-fonte original.

## Definição do Problema 🍷

Este projeto aborda dois cenários comuns onde o padrão Adapter é aplicável:

1. **Métodos de Pagamento:** Demonstra a integração de métodos de pagamento com interfaces distintas, como cartão de crédito e boleto bancário.

2. **Bancos de Dados:** Ilustra a conexão com diferentes sistemas de banco de dados, como MySQL e Oracle, cada um com sua própria interface.

## Estrutura do Projeto 📁

A estrutura do projeto está organizada da seguinte maneira:

```
$PWD/
│
├── src/
│   ├── Main.java
│   ├── adapter/
│   │   ├── ClientDatabaseInterface.java
│   │   └── DatabaseAdapter.java
│   └── database/
│       ├── DatabaseInterface.java
│       └── SimpleDatabase.java
└── README.md
```

## Como Usar 🤔

Para executar este projeto, siga estes passos:

1. Clone o repositório para sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento Java.
3. Execute o arquivo `Main.java` para ver a demonstração do padrão Adapter.

## Licença 📝

Este projeto está sob a licença MIT.