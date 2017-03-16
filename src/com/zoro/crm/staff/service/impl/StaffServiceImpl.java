package com.zoro.crm.staff.service.impl;

import java.util.List;

import com.zoro.crm.staff.dao.StaffDao;
import com.zoro.crm.staff.domain.CrmStaff;
import com.zoro.crm.staff.service.StaffService;
import com.zoro.crm.utils.MyStringUtils;

public class StaffServiceImpl implements StaffService {

	private StaffDao staffDao;
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	@Override
	public CrmStaff login(CrmStaff staff) {
		//将输入的登入密码加密
		String loginPwd = MyStringUtils.getMD5Digest(staff.getLoginPwd());
		return staffDao.find(staff.getLoginName(), loginPwd);
	}
	@Override
	public List<CrmStaff> findAllStaff() {
		
		return staffDao.findAll();
	}
	
}
