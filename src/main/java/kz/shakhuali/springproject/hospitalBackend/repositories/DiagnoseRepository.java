package kz.shakhuali.springproject.hospitalBackend.repositories;

import jakarta.transaction.Transactional;
import kz.shakhuali.springproject.hospitalBackend.model.Diagnose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DiagnoseRepository extends JpaRepository<Diagnose, Long> {
    Diagnose findByName(String name);
}
