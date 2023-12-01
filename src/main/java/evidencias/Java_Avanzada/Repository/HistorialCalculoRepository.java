package evidencias.Java_Avanzada.Repository;

import evidencias.Java_Avanzada.Model.CalculoIMC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HistorialCalculoRepository extends JpaRepository<CalculoIMC, Long> {

    List<CalculoIMC> findByUserId(Long userId);
}