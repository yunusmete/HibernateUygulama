import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    private static SessionFactory buildSessionFactory() {
        try {
            // hibernate.cfg.xml dosyasýndan SessionFactory nesnesi yaratýr.
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            // SessionFactory nesnesinin yaratýlamadýðý istinayý yakalar.
            System.err.println("SessionFactory yaratýlamadý." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	
}
