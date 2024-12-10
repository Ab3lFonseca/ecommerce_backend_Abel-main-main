package senac.PFHtml.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.List;
 
import senac.PFHtml.Model.Produto;
import senac.PFHtml.repository.ProdutoRepository;



 
@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
 
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> get(@RequestParam(required = false, defaultValue = "nome") String order, @RequestParam(required = false) String filter) {
      Sort sort;    
      // Verifica qual campo foi solicitado para ordenação
      switch (order) {
          case "maiorPreco":
              // Ordena pelo campo "preco" em ordem decrescente
              sort = Sort.by(Sort.Direction.DESC, "preco");
              break;
          case "menorPreco":
              // Ordena pelo campo "preco" em ordem crescente
              sort = Sort.by(Sort.Direction.ASC, "preco");
              break;
          case "nome":
          default:
              // Ordena pelo campo "nome" em ordem crescente
              sort = Sort.by(Sort.Direction.ASC, "nome");
              break;
      }
  
      if (filter != null && !filter.isEmpty()) {
        return repository.findByNomeContains(filter, sort);
    }

      return repository.findAll(sort);
  }
  

    @PostMapping
     public Produto save(@RequestBody Produto produto){
       return repository.save(produto);
     }
} 