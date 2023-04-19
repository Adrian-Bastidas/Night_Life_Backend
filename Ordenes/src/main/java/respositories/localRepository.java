package respositories;

import com.NightLife.Locales.Entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface localRepository extends JpaRepository<Local,Integer> {
    Local findByLocNombre(String locNombre);
}
