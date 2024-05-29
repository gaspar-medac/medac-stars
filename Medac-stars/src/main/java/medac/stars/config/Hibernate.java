package medac.stars.config;

import medac.stars.entity.Chat;
import medac.stars.entity.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    public static Session session = null;

    static {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Chat.class);
        configuration.addAnnotatedClass(Message.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
    }

    // Refresh session
    public static void refreshSession() {
        if (session != null && session.isOpen()) return;

        session = session.getSessionFactory().openSession();
    }
}