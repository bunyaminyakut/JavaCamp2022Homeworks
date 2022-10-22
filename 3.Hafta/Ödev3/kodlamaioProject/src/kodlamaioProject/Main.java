package kodlamaioProject;

import kodlamaioProject.entities.Course;
import kodlamaioProject.business.CourseManager;
import kodlamaioProject.core.logging.DatabaseLogger;
import kodlamaioProject.core.logging.FileLogger;
import kodlamaioProject.core.logging.Logger;
import kodlamaioProject.core.logging.MailLogger;
import kodlamaioProject.dataAccess.HibernateCourseDao;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course("C# + ANGULAR Kampı","C#", 100);
		Course course1 = new Course("Java + REACT kampı","JAVA", 200);
		Course course2 = new Course("Java + SPRİNG Kampı","JAVA", 300);
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		System.out.println("------------------");
		courseManager.add(course1);
		System.out.println("------------------");
		courseManager.add(course2);
		
	}

}
