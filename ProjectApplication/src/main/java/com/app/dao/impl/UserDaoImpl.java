package com.app.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.dao.USerDao;
import com.app.dto.InputRequest;
import com.app.dto.UserRequest;
import com.app.model.AccountOpen;
import com.app.model.Customer;
import com.app.model.User;
import com.app.service.AccountOpenService;
import com.app.service.UserService;
import com.app.util.HibernateUtil;

public class UserDaoImpl implements USerDao {
	

	public int register() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			User user = new UserService().register();
			session.save(user);
			tx.commit();

			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public User login() {
		Session session = null;
		Transaction tx = null;
		User usResponse=new User();
		try {
			SessionFactory factory= factory=new Configuration()
                    .configure("hibernate-cfg.xml")
		            .buildSessionFactory();
			session = factory.openSession();
		
			tx = session.beginTransaction();
			UserRequest user = new UserService().login();
			Query<User> query = session.createQuery(
					"From User where uname='" + user.getUname() + "' and password='" + user.getPassword() + "'");
			usResponse = query.uniqueResult();
				
			
			return usResponse;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		}

	public AccountOpen open() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			SessionFactory factory=new Configuration()
                    .configure("hibernate-cfg.xml")
		            .buildSessionFactory();
			session = factory.openSession();
		
			tx = session.beginTransaction();
			AccountOpen accountopen = new AccountOpenService().open();
			session.save(accountopen);

			return accountopen;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	public Account verifyAccount() {
		Session session = null;
		Transaction tx = null;
		AccountOpen csResponse= new AccountOpen();
		try {
			SessionFactory factory= factory=new Configuration()
                    .configure("hibernate-cfg.xml")
		            .buildSessionFactory();
			session = factory.openSession();
		
			tx = session.beginTransaction();
			CustomerRequest customer = new AccountOpenService().verify();
			Query<customer> query = session.createQuery(
					"From accountopen where accountHolderFirstName='" + customer.getaccountHolderFirstName() + "' accountHolderLastName='" + customer.getaccountHolderLastName() + "'accountHolderAccountNumber'" + customer.getAccountHolderAccountNumber +"'accountHolderPanNumber'" +customer.getaccountHolderPanNumber);
			usResponse = query.uniqueResult();
				
			
			return usResponse;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public List<User> listOfUsers() {
		// TODO Auto-generated method stub
		SessionFactory factory= factory=new Configuration()
                .configure("hibernate-cfg.xml")
	            .buildSessionFactory();
	Session	session = factory.openSession();
	Transaction tx =session.beginTransaction();
		Query query=session.createQuery("From User  ");
		
		return query.list();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		SessionFactory factory= factory=new Configuration()
                .configure("hibernate-cfg.xml")
	            .buildSessionFactory();
	Session	session = factory.openSession();
	Transaction tx =session.beginTransaction();
		Query query=session.createQuery("From User u where u.id=:id");
		query.setParameter("id", id);
		List<User> user=query.list();
		return user.get(0);
	}


}
