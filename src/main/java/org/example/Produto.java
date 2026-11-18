package org.example;

public class Produto implements Cloneable {
    private int sku;
    private String nome;
    private FichaTributaria fichaTributaria;
    private String tamanho;

    public Produto(int sku, String nome, FichaTributaria fichaTributaria, String tamanho) {
        this.sku = sku;
        this.nome = nome;
        this.fichaTributaria = fichaTributaria;
        this.tamanho = tamanho;
    }

    public int getSku() { return sku; }
    public void setSku(int sku) { this.sku = sku; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public FichaTributaria getFichaTributaria() { return fichaTributaria; }
    public void setFichaTributaria(FichaTributaria fichaTributaria) { this.fichaTributaria = fichaTributaria; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        // Cópia profunda: essencial para não haver dependências de memória!
        produtoClone.fichaTributaria = (FichaTributaria) produtoClone.fichaTributaria.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku=" + sku +
                ", nome='" + nome + '\'' +
                ", fichaTributaria=" + fichaTributaria +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}