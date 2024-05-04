package com.example.parcial.sprinbootapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/course")
public class controller {
    private List<course> courses = new ArrayList<>();

    @GetMapping("/")
    public List<Course> getAllCourses() {
        return courses;
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        // Buscar el curso por su ID y devolverlo
    }

    @PostMapping("/")
    public void createCourse(@RequestBody Course course) {
        courses.add(course);
    }

    @PutMapping("/{id}")
    public void updateCourse(@PathVariable int id, @RequestBody Course course) {
        // Buscar el curso por su ID y actualizarlo con los datos proporcionados
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        // Buscar el curso por su ID y eliminarlo
    }
}