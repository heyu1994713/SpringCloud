package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)//链式写法
public class Dept implements Serializable{
   
	//主键
	private Long deptno;
	//部门名称
	private String deptname;
	//采用那个数据库
	private String db_source;
	//名字
	private String  name;
	
	public static void main(String[] args) {
		Dept dept=new Dept();
		dept.setDeptname("heyu").setDeptno(88L).setDb_source("day01");
	}
	

}
