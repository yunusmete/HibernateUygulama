import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		HibernateUtil util = new HibernateUtil();
		SessionFactory factory = HibernateUtil.getSessionFactory();
		session = factory.openSession();
		Musteriler musteri = new Musteriler();
		
		musteri.setAd("Orhan");
		musteri.setSoyad("Kemal");
		musteri.setCinsiyetId(1);
		musteri.setYas(45);
		
		session.save(musteri);
		
		Musteriler aranan = (Musteriler) session.load(Musteriler.class, 5);
		System.out.println("5 nolu ID'ye sahip kiþi: "+ aranan.getAd()+ " "+ aranan.getSoyad());
		
		session.flush();
		session.close();
	}

}
