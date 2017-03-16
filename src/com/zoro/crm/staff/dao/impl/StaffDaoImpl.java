package com.zoro.crm.staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zoro.crm.staff.dao.StaffDao;
import com.zoro.crm.staff.domain.CrmStaff;

//在spring中配置dao层时需要注入sessionFactory
public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao  {

	@Override
	public CrmStaff find(String loginName, String loginPwd) {
		List<CrmStaff> allStaff =  (List<CrmStaff>) this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd=? ", loginName,loginPwd);
		if(allStaff.size() == 1){
			return allStaff.get(0);
		}
		return null;
	}

	@Override
	public List<CrmStaff> findAll() {
		
		return (List<CrmStaff>) this.getHibernateTemplate().find("from CrmStaff");
	}

	
}
