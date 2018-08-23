package com.manarice.dao.service;

import com.manarice.bean.CheckAuthenticationBean;
import com.manarice.bean.CustomerDetailsBean;

public interface ManaRiceDaoService
{

	public String checkAuthentication(CheckAuthenticationBean checkAuthenticationBean);
	public String createCustomer(CustomerDetailsBean customerDetailsBean);
	public String changePassword(String username,String password);
		
}
