package com.zoro.crm.staff.dao;

import java.util.List;

import com.zoro.crm.staff.domain.CrmStaff;

public interface StaffDao {
	public CrmStaff find(String loginName, String loginPwd);
	
	/**
	 * 查询所有员工
	 */
	public List<CrmStaff> findAll();
}
