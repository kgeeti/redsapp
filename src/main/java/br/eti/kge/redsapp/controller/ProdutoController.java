package br.eti.kge.redsapp.controller;

import br.eti.kge.redsapp.model.Produto;
import br.eti.kge.redsapp.repositories.ProdutoRepository;
import br.eti.kge.redsapp.services.ProdutoService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kge
 */
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    // utilizar Service quando necessário tratamento.
    @Autowired
    ProdutoService produtoService;

    // Utilizar repository quando não necessário tratamento.
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping()
    public ResponseEntity<List<Produto>> findAllProducts() {
        List<Produto> result = produtoService.findAll();

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }

    }
 
    @GetMapping("/{id}")
    public ResponseEntity<Produto> findProductById(@PathVariable String id) {
        return ResponseEntity.ok(produtoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Produto> createProduct(@RequestBody @Valid Produto produto) {
        Produto created = produtoService.create(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> updateProduct(@PathVariable String id, @RequestBody @Valid Produto produto) {
        return ResponseEntity.ok(produtoService.update(id, produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}

