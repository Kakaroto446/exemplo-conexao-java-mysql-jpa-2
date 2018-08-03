package controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Alunos;

public class HibernateUtil {
	private static final SessionFactory factory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		Configuration config = new Configuration();
		
		//pacote onde ficam as classes que representam as entidades
		config.addAnnotatedClass(Alunos.class);
		
		config.configure();
		
		return config.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
