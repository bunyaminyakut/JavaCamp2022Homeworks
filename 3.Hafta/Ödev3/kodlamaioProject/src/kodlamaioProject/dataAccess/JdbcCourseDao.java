package kodlamaioProject.dataAccess;

import kodlamaioProject.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " JDBC ile eklendi");
		
	}

}
