package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {
	private static StandardServiceRegistry registry = null;
	private static SessionFactory sessionFactory = null;
	
	static{
		registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();
		sessionFactory = new MetadataSources(registry)
				.buildMetadata()
				.buildSessionFactory();
	}
	
	public static Session getSession(){
		return sessionFactory.openSession();
	}
}
