package kodlamaioProject.dataAccess;

import kodlamaioProject.entities.Course;

public class HibernateCourseDao implements CourseDao{


	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " Hibernate ile eklendi");
		
	}

}
