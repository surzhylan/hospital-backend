package kz.shakhuali.springproject.hospitalBackend.repositories;

import jakarta.transaction.Transactional;
import kz.shakhuali.springproject.hospitalBackend.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
