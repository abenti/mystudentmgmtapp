package edu.miu.cs.cs425.studentmgtm.mystudentmgmtapp.service;

import edu.miu.cs.cs425.studentmgtm.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.studentmgtm.mystudentmgmtapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        return(Student) studentRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Long id, Student studentId) {
        var student = studentRepository.findById(id).orElse(null);
        if(student == null) throw new NullPointerException("No Such student");
        student.setFirstName(student.getFirstName());
        student.setLastName(student.getLastName());
        student.setStudentNumber(student.getStudentNumber());
        student.setDateOfEnrollment(student.getDateOfEnrollment());
        student.setMiddleName(student.getMiddleName());
        student.setCgpa(student.getCgpa());
        studentRepository.save(student);
    }

    @Override
    public void delete(Long studentId) {
        studentRepository.deleteById(studentId);

    }
}
