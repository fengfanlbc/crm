package com.zoro.crm.coursetype.domain;

import java.util.HashSet;
import java.util.Set;

import com.zoro.crm.classes.domain.CrmClasses;

public class CrmCoursetype {

	/*
	 * CREATE TABLE `crm_course_type` (
  		`courseTypeId` varchar(255) NOT NULL PRIMARY KEY,
  		`courseCost` double DEFAULT NULL,
  		`total` int(11) DEFAULT NULL,
  		`courseName` varchar(500) DEFAULT NULL,
  		`remark` varchar(5000) DEFAULT NULL
		);
	 */
	private String CourseTypeId;
	private Double courseCost;
	private Integer total;
	private String courseName;
	private String remark;
	
	//一个课程类型对应多个班级
	private Set<CrmClasses> ClassSet = new HashSet<CrmClasses>();
	public String getCourseTypeId() {
		return CourseTypeId;
	}

	public void setCourseTypeId(String courseTypeId) {
		CourseTypeId = courseTypeId;
	}

	public Double getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(Double courseCost) {
		this.courseCost = courseCost;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<CrmClasses> getClassSet() {
		return ClassSet;
	}

	public void setClassSet(Set<CrmClasses> classSet) {
		ClassSet = classSet;
	}

	
	
}
