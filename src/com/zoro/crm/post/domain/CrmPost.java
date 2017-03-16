package com.zoro.crm.post.domain;

import java.util.HashSet;
import java.util.Set;

import com.zoro.crm.department.domain.CrmDepartment;
import com.zoro.crm.staff.domain.CrmStaff;

public class CrmPost {
	
	/*
	 * CREATE TABLE `crm_post` (
  		`postId` varchar(255) NOT NULL PRIMARY KEY,
  		`postName` varchar(100) DEFAULT NULL,
  		`depId` varchar(255) DEFAULT NULL,
  		CONSTRAINT FOREIGN KEY (`depId`) REFERENCES `crm_department` (`depId`)
	    );
	 */
	
	private String postId;
	private String postName;
	//private String depId;
	
	//多对一，多个职务对应一个部门
	private CrmDepartment department;
	//一个职务对应多个职员
	private Set<CrmStaff> staffSet = new HashSet<CrmStaff>();
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	
	public CrmDepartment getDepartment() {
		return department;
	}
	public void setDepartment(CrmDepartment department) {
		this.department = department;
	}
	public Set<CrmStaff> getStaffSet() {
		return staffSet;
	}
	public void setStaffSet(Set<CrmStaff> staffSet) {
		this.staffSet = staffSet;
	}
	
	
	
}
