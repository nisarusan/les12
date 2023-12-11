package nl.novi.backend.les12.repository;

import nl.novi.backend.les12.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {


    // eigen method voor ophalen van een datum na find after
    public List<Teacher> findByDobAfter(LocalDate date);

}
