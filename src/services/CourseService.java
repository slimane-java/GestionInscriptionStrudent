package services;

import entity.Course;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CourseService {
    Map<String, String> addCourse(Course course);
    Map<String, String> updateCourse(int id, Course course);
    Map<String, String> deleteCourse(int id);
    List<Course> getAllCourses();
    Optional<Course> findCourseByID(int id);

    void booleanValue(boolean value);

    boolean getBooleanValue();
}
