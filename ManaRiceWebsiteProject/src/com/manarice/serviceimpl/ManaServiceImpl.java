package com.manarice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.manarice.bean.CheckAuthenticationBean;
import com.manarice.bean.CustomerDetailsBean;
import com.manarice.dao.service.ManaRiceDaoService;
import com.manarice.service.ManaService;

public class ManaServiceImpl implements ManaService
{

	@Autowired
	private ManaRiceDaoService manaRiceDaoService;
	
	
	@Override
	public String checkAuthentication(CheckAuthenticationBean checkAuthenticationBean) 
	{
		
		return manaRiceDaoService.checkAuthentication(checkAuthenticationBean);
	}

	@Override
	public String createCustomer(CustomerDetailsBean customerDetailsBean) 
	{
		
		return manaRiceDaoService.createCustomer(customerDetailsBean);
	}

	@Override
	public String changePassword(String username, String password)
	{
	
		return manaRiceDaoService.changePassword(username, password);
	}
}
