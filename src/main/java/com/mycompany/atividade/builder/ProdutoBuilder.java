package com.mycompany.atividade.builder;

import java.time.LocalDate;

public class ProdutoBuilder {
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String categoria;
    private Vendedor vendedor;
    

    public ProdutoBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto build() {
        return new Produto(titulo, descricao, marca, modelo, preco, dataCadastro, dataUltimaAtualizacao, categoria, vendedor);
    }
}
