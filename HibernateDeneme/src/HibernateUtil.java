import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    private static SessionFactory buildSessionFactory() {
        try {
            // hibernate.cfg.xml dosyas�ndan SessionFactory nesnesi yarat�r.
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            // SessionFactory nesnesinin yarat�lamad��� istinay� yakalar.
            System.err.println("SessionFactory yarat�lamad�." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	
}
