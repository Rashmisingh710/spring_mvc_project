package com.jsp.dao;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jsp.entity.Student;
	@Component
	public class StudentDao {
		@Autowired
		private EntityManager em;
		public void saveStudent(Student student) {
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(student);
			et.commit();
		}	
//----------------------------------------------------------------------------------
		public List<Student>getAllStudent(){
			Query q=em.createQuery("Select s from Student s");
			List<Student>stlist=q.getResultList();
			return stlist;
			
		}
		public void deleteStudentById(int id) {
			EntityTransaction et = em.getTransaction();
			Student st = em.find(Student.class, id);
			et.begin();
			em.remove(st);
			et.commit();
		}
//------------------------------------------------------------------------------------------

		public  Student getStudentById(int id) {
			return em.find(Student.class, id);
		}

		public void updateStudent(Student student) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.merge(student);
			transaction.commit();
		}
		
//------------------------------------------------------------------------------
		


			
}
	