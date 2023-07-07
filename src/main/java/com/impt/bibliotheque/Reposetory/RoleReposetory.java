import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.impt.bibliotheque.entities.Role;

@Repository
public interface RoleReposetory extends JpaRepository<Role,Long>{
  Role finByName(String name);
  

}