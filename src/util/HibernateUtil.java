package util;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static SessionFactory sf = null;
	
	static 
	{
		sf = new Configuration().configure().buildSessionFactory();
	}
	
	public static Session  getSession()
	{
		return sf.openSession();
	}
}
