import entity.Course;
import entity.Formateur;
import services.CourseService;
import services.CourseServiceImp;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        CourseService courseServiceImp = new CourseServiceImp();

        Formateur formateur = new Formateur();
        formateur.setId(1);
        formateur.setFirstName("John");
        formateur.setLastName("John");
        formateur.setEmail("john@gmail.com");
        formateur.setAdresse("123 Main St");
        formateur.setPhoneNumber("0777777777");

        Course course = new Course();
        course.setId(1);
        course.setDescription("Java Programming");
        course.setTitle("Java Programming");
        course.setStartDate(LocalDate.now());
        course.setEndDate(LocalDate.now().plusDays(30));
        course.setFormateur(formateur);

        courseServiceImp.addCourse(course);

        courseServiceImp.addCourse(course);
        courseServiceImp.addCourse(course);
        courseServiceImp.addCourse(course);

        courseServiceImp.booleanValue(true);

        System.out.println(courseServiceImp.getAllCourses().size());
        courseServiceImp
                .getAllCourses()
                .forEach(course1 -> System.out.println(course1.toString()));

        CourseService courseServiceImp2 = new CourseServiceImp();


        Formateur formateur1 = new Formateur();
        formateur1.setId(2);
        formateur1.setFirstName("John 1");
        formateur1.setLastName("John 1");
        formateur1.setEmail("john@gmail.com 1");
        formateur1.setAdresse("123 Main St 1");
        formateur1.setPhoneNumber("0777777777 1");

        Course course1 = new Course();
        course1.setId(2);
        course1.setDescription("Java Programming 1");
        course1.setTitle("Java Programming 1");
        course1.setStartDate(LocalDate.now());
        course1.setEndDate(LocalDate.now().plusDays(30));
        course1.setFormateur(formateur1);

        courseServiceImp2.addCourse(course1);
        courseServiceImp2.addCourse(course1);
        courseServiceImp2.addCourse(course1);
        courseServiceImp2.addCourse(course1);

        courseServiceImp2.booleanValue(false);
        System.out.println(courseServiceImp.getAllCourses().size());

        courseServiceImp2
                .getAllCourses()
                .forEach(itmes -> System.out.println(itmes.toString()));


        System.out.println("booleans value" + courseServiceImp.getBooleanValue());
        
    }
}