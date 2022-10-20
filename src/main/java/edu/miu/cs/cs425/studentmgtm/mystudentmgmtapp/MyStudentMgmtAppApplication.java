package edu.miu.cs.cs425.studentmgtm.mystudentmgmtapp;

import edu.miu.cs.cs425.studentmgtm.mystudentmgmtapp.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var s1 = new Student( 000-61-0001, "Anna", "Lynn", "Smith", 3.45f, LocalDate.of(2019, 5, 24));
    }
}
