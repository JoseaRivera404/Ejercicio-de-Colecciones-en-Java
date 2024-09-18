import java.util.HashMap;

public class CourseService{
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Course> courses = new HashMap<>();


    public CourseService(){
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
    	if (students.containsKey(studentId) && courses.containsKey(courseId)) {
    		students.get(studentId).enroll(courses.get(courseId));
    		System.out.println("The student " + students.get(studentId).getName() + " was enrolled in the " + courses.get(courseId).name + " course");
    	}else {
    		System.out.println("Student could not be enrolled");
    	}
    }

    public void unEnrollStudent(String studentId, String courseId){
    	if (students.containsKey(studentId) && courses.containsKey(courseId)) {
    		students.get(studentId).unEnroll(courses.get(courseId));
    		System.out.println("Student " + students.get(studentId).getName() + " was unrolled from the " + courses.get(courseId).name + " course");
    	}else {
    		System.out.println("The student could not be unenrolled");
    	}
    }

    public void displayCourseInformation(String courseId){
    	System.out.println("-----------Course Information------------");
    	System.out.println("Id: " + courses.get(courseId).id);
    	System.out.println("Name: " + courses.get(courseId).name);
        System.out.println("Credits: " + courses.get(courseId).credits);
    }

    public void displayStudentInformation(String studentId){
//    	System.out.println(students.get(studentId).toString());
    	System.out.println("+-----------Student Information------------");
    	System.out.println("Id: " + students.get(studentId).getId());
    	System.out.println("Name: " + students.get(studentId).getName());
    	System.out.println("Total Course: " + students.get(studentId).totalEnrolledCourses());
        if (students.get(studentId).totalEnrolledCourses() > 0) {
        	System.out.println("Enrolled Courses: ");
            for (Course curso: students.get(studentId).getEnrolledCourses()) {
            	displayCourseInformation(curso.id);
            }
            totalCredits(studentId);	
        }
        System.out.println("+------------------------------------------");
    }
    
    public void totalCredits (String studentId) {
    	int total = 0;
    	for (Course course: students.get(studentId).getEnrolledCourses()) {
    		total += course.credits;
    	}
    	System.out.println("Total Credits: " + total);
    }

}