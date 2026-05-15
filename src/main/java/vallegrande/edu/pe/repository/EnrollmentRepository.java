package vallegrande.edu.pe.repository;

import vallegrande.edu.pe.entity.Enrollment;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface EnrollmentRepository
        extends JpaRepository<Enrollment, Long> {

}