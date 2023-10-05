package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if(user.getId()==null) System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("fellipe", "password"));
        users.add(new User("dino", "password"));
        return users;
    }

    public User findById(Integer id) {
        System.out.printf("Find/username - Recebendo o username: %s para localizar um usuário%n", id);
        return new User("fellipe", "password");
    }

    public User findByUsername(String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar um usuário%n", username);
        return new User("fellipe", "password");
    }
}
