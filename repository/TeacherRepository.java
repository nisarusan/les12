package nl.novi.backend.les12.repository;

import nl.novi.backend.les12.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
