package com.manarice.dao.serviceimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.manarice.bean.CheckAuthenticationBean;
import com.manarice.bean.CustomerDetailsBean;
import com.manarice.dao.service.ManaRiceDaoService;
import com.manarice.persistance.ManaRiceCustomer;

public class ManaRiceDaoImpl  implements ManaRiceDaoService
{
@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String checkAuthentication(CheckAuthenticationBean checkAuthenticationBean)
	{
			
		Session session=sessionFactory.openSession();
		Query qry=session.createQuery("select C.firstName from  ManaRiceCustomer C where C.emailId='"
		+checkAuthenticationBean.getUserId()+"'and C.password='"+checkAuthenticationBean.getPassword()+"'");
		
		List<String> list=qry.list();
		
		if(list.size()>0)
		{
			return list.get(0);
		}
		else
		{
		return null;
		}
	}
	@Override
	public String createCustomer(CustomerDetailsBean customerDetailsBean) 
	{		
		ManaRiceCustomer manaricecutomer = new ManaRiceCustomer();
		manaricecutomer.setFirstName(customerDetailsBean.getFirstName());
		manaricecutomer.setLastName(customerDetailsBean.getLastName());
		manaricecutomer.setEmailId(customerDetailsBean.getEmailId());
		manaricecutomer.setPassword(customerDetailsBean.getPassword());		
		manaricecutomer.setGender(customerDetailsBean.getGender());	
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(manaricecutomer);
		tx.commit();
		
		return "success";
	}
	@Override
	public String changePassword(String username, String password)
    {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("update ManaRiceCustomer set password=? where emailId=?");
		query.setString(0, password);
		query.setString(1, username);
		int result=query.executeUpdate();
		if(result>0)
		{
			return "success";
		}
		else
		{
			return null;
		}
		}
	}
