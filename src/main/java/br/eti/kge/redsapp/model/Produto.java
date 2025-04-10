package br.eti.kge.redsapp.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kge
 */ 
@Document(collection = "produto")
public class Produto {
    
    @Id
    private String id;
    private String produto;
    private double saldo;
    private double valor;

    public Produto() {
    }

    public Produto(String id, String produto, double saldo, double valorVenda) {
        this.id = id;
        this.produto = produto;
        this.saldo = saldo;
        this.valor = valorVenda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    @Override
    public String toString() {
        return String.format("Produto [id=%s, produto=%s, saldo=%.2f, valorVenda=%.2f", 
                this.id, this.produto, this.saldo, this.valor);
        
    }
    
}
