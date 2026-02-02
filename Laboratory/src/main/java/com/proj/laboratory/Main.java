import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Patient.class);
        configuration.addAnnotatedClass(Laboratory.class);
        configuration.addAnnotatedClass(TypesOfTests.class);
        configuration.addAnnotatedClass(PerformedTests.class);

        try (SessionFactory sessionFactory
                     = configuration.buildSessionFactory()) {

            Session session = sessionFactory.openSession();

            Laboratory lab1 = new Laboratory("Ramus");
            Employee employee1 = new Employee("Spas454", "1234", "Spas Dimitrov", Role.Employee, lab1, "laborant");
            Patient patient1 = new Patient("Viktoria123", "123", "Viktoria Georgieva", Role.Patient, "0882453637", Gender.FEMALE);
            TypesOfTests test1 = new TypesOfTests("kryvno izsledvane", lab1);
            PerformedTests performedTests1 = new PerformedTests(patient1, employee1, lab1, test1);

            session.beginTransaction();

            session.persist(lab1);
            session.persist(employee1);
            session.persist(patient1);
            session.persist(test1);
            session.persist(performedTests1);


            session.getTransaction().commit();
        }
    }
}
