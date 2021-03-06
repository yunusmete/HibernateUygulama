import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    private static SessionFactory buildSessionFactory() {
        try {
            // hibernate.cfg.xml dosyasından SessionFactory nesnesi yaratır.
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            // SessionFactory nesnesinin yaratılamadığı istinayı yakalar.
            System.err.println("SessionFactory yaratılamadı." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	
}
