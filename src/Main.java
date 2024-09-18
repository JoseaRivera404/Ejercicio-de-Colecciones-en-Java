
public class Main{
    
	public static void main( String[] args ){
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String courseId2 = "biol_01";
        String studentId = "120120";
        courseService.displayCourseInformation(courseId);
        courseService.displayStudentInformation(studentId);

        courseService.enrollStudent(studentId, courseId );
        courseService.enrollStudent(studentId, courseId2 );
        courseService.displayStudentInformation( studentId);

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);        
    }

}