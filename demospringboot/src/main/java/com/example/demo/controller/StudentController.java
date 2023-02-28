package com.example.demo.controller;

import com.example.demo.model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    static List<StudentModel> studentModelList = new ArrayList<>();

    @PostMapping("")
    public ResponseEntity<?> getReqParam(@RequestParam String name,
                                         @RequestParam int age) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        studentModelList.add(studentModel);
        return  new ResponseEntity<>(studentModelList, HttpStatus.OK);
    }

    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> getPath(@PathVariable String name,
                                     @PathVariable int age) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        studentModelList.add(studentModel);
        return  new ResponseEntity<>(studentModelList, HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> getReqBody(@RequestBody StudentModel studentModel) {
        studentModelList.add(studentModel);
        return  new ResponseEntity<>(studentModelList, HttpStatus.OK);
    }
}
