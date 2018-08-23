package com.manarice.service;

import com.manarice.bean.CheckAuthenticationBean;
import com.manarice.bean.CustomerDetailsBean;

public interface ManaService
{
	public String checkAuthentication(CheckAuthenticationBean checkAuthenticationBean);
	public String createCustomer(CustomerDetailsBean customerDetailsBean);
	public String changePassword(String username,String password);
}
