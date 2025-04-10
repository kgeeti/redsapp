package br.eti.kge.redsapp.services;

import br.eti.kge.redsapp.exception.ResourceNotFoundException;
import br.eti.kge.redsapp.model.Produto;
import br.eti.kge.redsapp.repositories.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kge
 */
@Service
public class ProdutoService {
    
    @Autowired
    ProdutoRepository produtoRepository;
    
   public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Produto findById(String id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto com ID " + id + " não encontrado."));
    }

    public Produto create(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto update(String id, Produto produto) {
        Produto existente = findById(id);
        produto.setId(existente.getId());
        return produtoRepository.save(produto);
    }

    public void delete(String id) {
        Produto existente = findById(id);
        produtoRepository.delete(existente);
    }
    
}
