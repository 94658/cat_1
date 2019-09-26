package com.example.demo;

import com.example.demo.feign.FeignRestClient;
import com.example.demo.model.BlindDate;
import com.example.demo.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {
   private final FeignRestClient feignRestClient;

    public Test(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

//    @Autowired
//    FeignRestClient feignRestClient;


    @Override

    public void run(String... args) throws Exception {

        Student student = feignRestClient.registerStudent(new Student("94658","Idah Koome"));
        System.out.println("Registered student: "+ student);

        BlindDate requestedDate = feignRestClient.requestDate(student.getId(),"FEMALE");
        System.out.println("Requested date "+ requestedDate);




    }
}
