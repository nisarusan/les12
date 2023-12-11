package nl.novi.backend.les12.controller;


import nl.novi.backend.les12.model.Student;
import nl.novi.backend.les12.model.Teacher;
import nl.novi.backend.les12.repository.StudentRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        studentRepository.save(student);
        URI uri = URI.create(
                ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/" + student.getStudentNr()).toUriString());
        return ResponseEntity.created(uri).body(student);
    }

}
