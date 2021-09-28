package application.respositories;
import org.springframework.data.repository.CrudRepository;   //CRUD - Criar, Ler, Atualizar e Deletar 

import application.models.Livro;
public interface LivroRepository extends CrudRepository<Livro, Integer> {
    
}
