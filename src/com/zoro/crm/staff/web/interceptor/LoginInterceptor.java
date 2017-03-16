package com.zoro.crm.staff.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//检测用户是否登入
		Object obj = ActionContext.getContext().getSession().get("loginStaff");
		//没有登入则跳转到登入页面
		if(obj == null){
			Object action = invocation.getAction();
			if(action instanceof ActionSupport){
				ActionSupport actionSupport = (ActionSupport)action;
				//添加错误信息
				actionSupport.addFieldError("","请登入");
			}
			return "login";
			
		}
		return invocation.invoke();
	}

}
