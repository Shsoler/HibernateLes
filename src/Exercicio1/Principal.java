package Exercicio1;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public abstract class Principal {

	public static void main(String[] args) {
		try{
			
			Configuration cfg = new Configuration();
			cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
			cfg.setProperty("hibernate.connection.username", "sa");
			cfg.setProperty("hibernate.connection.password", "");
			cfg.setProperty("hibernate.connection.url", "jdbc:hsqldb:file:./banco/dados");
			cfg.setProperty("hibernate.connection.driver_class", "org.hsqldb.jdbcDriver");
			cfg.setProperty("hibernate.show_sql", "false");
			cfg.addClass(Sindico.class);
			cfg.addClass(Edificio.class);
			cfg.addClass(Apartamento.class);
			cfg.addClass(Comodo.class);
			
			
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			session.getTransaction().begin();
			Sindico sindico = new Sindico();
			sindico.setId(2);
			sindico.setNome("Zé");
			
			//session.save(sindico);
			
			Edificio edificio = new Edificio();
			edificio.setEndereco("rua tal");
			edificio.setEstrelas(4);
			edificio.setId(2);
			edificio.setNome("Edificio 2");
			edificio.setSindico(sindico);
		//	session.save(edificio);
			
			Apartamento apart = new Apartamento();
			apart.setId(2);
			apart.setFinanciado(true);
			apart.setMedida("6x5");
			apart.setNumero("26");
			apart.setPiso("4");
			apart.setValorCondominio(new BigDecimal(400.50));
			apart.setEdificio(edificio);
		//	session.save(apart);
			
			Comodo com1 = new Comodo();
			com1.setId(1);
			com1.setDescricao("Cozinha");
			com1.setMedida("2x2");
			com1.setPossuiJanela(true);
			com1.setApartamento(apart);
		//	session.save(com1);
			
			Comodo com2 = new Comodo();
			com2.setId(2);
			com2.setDescricao("Banheiro");
			com2.setMedida("1x2");
			com2.setPossuiJanela(true);
			com2.setApartamento(apart);
		//session.save(com2);
			
			Comodo com3 = new Comodo();
			com3.setId(3);
			com3.setDescricao("Quarto");
			com3.setMedida("3x3");
			com3.setPossuiJanela(false);
			com3.setApartamento(apart);
		//session.save(com3);
			
			Sindico s = (Sindico) session.load(Sindico.class, 1);
			Edificio e = (Edificio) session.load(Edificio.class, 1);
			Apartamento a = (Apartamento) session.load(Apartamento.class, 1);
			Comodo c = (Comodo) session.load(Comodo.class, 3);
			//System.out.println(s.getNome());
			//System.out.println(e.getNome() + " " + e.getSindico().getNome());
			//System.out.println(a.getNumero() + " "+ a.getValorCondominio() + " - " + a.getEdificio().getNome());
			c.toString();
			System.out.println(c);
			System.out.println(c.getApartamento());
			System.out.println(c.getApartamento().getEdificio());
			System.out.println(c.getApartamento().getEdificio().getSindico());
			
			
			for (Comodo com : c.getApartamento().getComodos()) {
				System.out.println(com);
			}
	
			
			
			session.getTransaction().commit();
			session.close();
			
		
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}