package edu.miu.cs.cs425.studentmgtm.mystudentmgmtapp.service;

import edu.miu.cs.cs425.studentmgtm.mystudentmgmtapp.model.Student;

public interface StudentService {
   public Iterable<Student> findAll();
    public void save(Student student);
    public Student findById(Long id);
    public void update(Long id, Student studentId);
    public void delete(Long id);
}
