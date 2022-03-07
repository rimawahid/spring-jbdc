package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.TeacherDao;
import com.springjdbc.model.Student;
import com.springjdbc.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started....." );
        
        ApplicationContext ctx = 
        		new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
         JdbcTemplate template = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
         
        
        
			/*
			 * StudentDao studentDao = ctx.getBean("studentDao", StudentDao.class); Student
			 * student = new Student();
			 * 
			 * student.setId(333); student.setName("John"); student.setCity("Dhaka");
			 * 
			 * int result =studentDao.insert(student);
			 * System.out.println("student added "+result);
			 */
        
        TeacherDao teacherDao = ctx.getBean("teacherDao", TeacherDao.class);
        Teacher teacher = new Teacher();
        teacher.setId(123);
        teacher.setName("Maruf");
        teacher.setSalary(50000);
        
        int result1 = teacherDao.insert(teacher);
        System.out.println("teacher adder "+ result1);
    }
}
