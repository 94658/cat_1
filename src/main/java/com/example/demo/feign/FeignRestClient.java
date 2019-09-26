package com.example.demo.feign;

import com.example.demo.feign.FeignConfig;
import com.example.demo.model.BlindDate;
import com.example.demo.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name ="client", url="http:// 10.51.10.111:2200",configuration = FeignConfig.class)
public interface FeignRestClient {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    BlindDate requestDate(@RequestParam(value = "studentId")Long studentid, @RequestParam(value = "gender")String gender);
//
    @RequestMapping(method = RequestMethod.PATCH, value = "matches/{id}")
    BlindDate rejectDate(@PathVariable(name = "id") Long id,@RequestBody Student student);
}
