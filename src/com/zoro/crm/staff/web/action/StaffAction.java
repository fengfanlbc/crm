package com.zoro.crm.staff.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zoro.crm.staff.domain.CrmStaff;
import com.zoro.crm.staff.service.StaffService;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff>{

	private CrmStaff staff = new CrmStaff();
	private StaffService staffService;
	//默认按照名称注入
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	@Override
	public CrmStaff getModel() {
		return staff;
	}

	/**
	 * 员工的登入
	 * @return
	 */
	public String login(){
		
		//查询员工
		CrmStaff findStaff = staffService.login(staff);
		if(findStaff != null){
			//查询成功则保存在session中
			ActionContext.getContext().getSession().put("loginStaff", findStaff);
			//重定向回首页
			return "success";
		}
		//添加错误信息
		this.addFieldError("","用户名和密码不匹配");
		//请求转发至登入页
		return "login";
	}
	
	/**
	 * 首页
	 * @return
	 */
	public String home(){
		return "home";
	}
	
	/**
	 * 查询所有员工
	 */
	public String findAll(){
		List<CrmStaff> allStaff = this.staffService.findAllStaff();
		//将取出的结果放入值栈，方便jsp页面取出结果
		ActionContext.getContext().put("allStaff", allStaff);
		return "findAll";
	}
}