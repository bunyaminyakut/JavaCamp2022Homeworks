package kodlamaioProject.business;



import kodlamaioProject.core.logging.Logger;
import kodlamaioProject.dataAccess.CourseDao;
import kodlamaioProject.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] Loggers;

	public CourseManager(CourseDao courseDao, Logger[] Loggers) {
		this.courseDao = courseDao;
		this.Loggers = Loggers;
	}

	public void add(Course course) throws Exception {
		
	if(course.getPrice()<0)

	{
		throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
	}

	courseDao.add(course);

	for (Logger logger : Loggers) {
		logger.Log(course.getName());
	}
	}
}
