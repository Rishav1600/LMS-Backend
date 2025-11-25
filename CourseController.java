package com.example.lms.controller;

import com.example.lms.entity.Course;
import com.example.lms.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;  // <-- THIS imports @RestController, @RequestMapping, @GetMapping, etc.
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }
}
