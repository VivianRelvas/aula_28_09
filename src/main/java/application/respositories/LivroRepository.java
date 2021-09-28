package application.respositories;
import org.springframework.data.repository.CrudRepository;   //Salva, deleta e atualiza

import application.models.Livro;
public interface LivroRepository extends CrudRepository<Livro, Integer> {
    
}
