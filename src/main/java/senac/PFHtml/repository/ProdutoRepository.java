package senac.PFHtml.repository;

import senac.PFHtml.Model.Produto;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository
                 extends JpaRepository<Produto,Integer> {


                    List<Produto>findByNomeContains(String filter, Sort s);
    
}
