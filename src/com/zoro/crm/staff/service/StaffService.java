package com.zoro.crm.staff.service;

import java.util.List;

import com.zoro.crm.staff.domain.CrmStaff;

public interface StaffService {
	public CrmStaff login(CrmStaff staff);
	
	public List<CrmStaff> findAllStaff();
}
