package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        // Analista cadastra a Camisa Polo tamanho M com a regra fiscal padrão (CFOP 5102)
        Produto produto = new Produto(1000, "Camisa Polo", new FichaTributaria("6105.10.00", 5102), "M");

        // O sistema clona a Camisa para criar a variação G
        Produto produtoClone = produto.clone();
        produtoClone.setSku(1001);
        produtoClone.setNome("Camisa Polo Clone");
        produtoClone.setTamanho("G");

        // A regra fiscal do tamanho G é alterada para CFOP 5405 (Substituição Tributária)
        produtoClone.getFichaTributaria().setCfop(5405);

        // Validamos que a alteração da ficha no tamanho G não destruiu a ficha do tamanho M!
        assertEquals("Produto{sku=1000, nome='Camisa Polo', fichaTributaria=FichaTributaria{ncm='6105.10.00', cfop=5102}, tamanho='M'}", produto.toString());
        assertEquals("Produto{sku=1001, nome='Camisa Polo Clone', fichaTributaria=FichaTributaria{ncm='6105.10.00', cfop=5405}, tamanho='G'}", produtoClone.toString());
    }
}