package com.example.VanierCourseRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VanierCourseRegistration.model.Course;
import com.example.VanierCourseRegistration.model.Student;
import com.example.VanierCourseRegistration.model.Teacher;

@RestController
@RequestMapping("/api")
public class CourseRegistrationController {
    
@GetMapping("/ViewAllCourseData")
public void method(){

}

@GetMapping("/GetByID/{id}")
public void idsearch(@PathVariable("id") int id){
    

}

@PostMapping("/AddNewStudent")
public Student method1(@RequestBody Student s){


    return s;
}

@PostMapping("/AddNewTeacher")
public void method1(@RequestBody Teacher t){

}

@PostMapping("/AddNewCourse")
public void method1(@RequestBody Course c){

}

@PutMapping("/put")
public void deletemethod(){

}

@DeleteMapping("/delete")
public void delete(){

}




}
