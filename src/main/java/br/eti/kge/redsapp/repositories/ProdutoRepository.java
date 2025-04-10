package br.eti.kge.redsapp.repositories;

import br.eti.kge.redsapp.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kge
 */
@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
    
}
