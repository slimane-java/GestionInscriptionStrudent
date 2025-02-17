package services;

import entity.Course;

import java.util.*;

public class CourseServiceImp implements CourseService {

    private static final List<Course> courses = new ArrayList<>();
    public CourseServiceImp() {
    }

    @Override
    public Map<String, String> addCourse(Course course) {
        courses.add(course);
        return Map.of("Message", "Course added successfully");
    }

    @Override
    public Map<String, String> updateCourse(int id, Course course) {
        courses.stream()
                .filter(course1 -> course1.getId() == id)
                .forEach(course1 -> {
                    course1.setTitle(course.getTitle());

                });
        return Map.of();
    }

    @Override
    public Map<String, String> deleteCourse(int course) {
        Course course1 = courses.get(course);
        courses.remove(course1);
        return Map.of();
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public Optional<Course> findCourseByID(int id) {
        return courses.stream().filter(course1 -> course1.getId() == id).findFirst();
    }

    @Override
    public void booleanValue(boolean value) {
   }

    @Override
    public boolean getBooleanValue() {
        return false;
    }
}
