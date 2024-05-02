package com.entity.vo;

import com.entity.DudaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 督导
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public class DudaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 督导姓名
	 */
	
	private String dudaoxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 督导电话
	 */
	
	private String dudaodianhua;
		
	/**
	 * 督导邮箱
	 */
	
	private String dudaoyouxiang;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：督导姓名
	 */
	 
	public void setDudaoxingming(String dudaoxingming) {
		this.dudaoxingming = dudaoxingming;
	}
	
	/**
	 * 获取：督导姓名
	 */
	public String getDudaoxingming() {
		return dudaoxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：督导电话
	 */
	 
	public void setDudaodianhua(String dudaodianhua) {
		this.dudaodianhua = dudaodianhua;
	}
	
	/**
	 * 获取：督导电话
	 */
	public String getDudaodianhua() {
		return dudaodianhua;
	}
				
	
	/**
	 * 设置：督导邮箱
	 */
	 
	public void setDudaoyouxiang(String dudaoyouxiang) {
		this.dudaoyouxiang = dudaoyouxiang;
	}
	
	/**
	 * 获取：督导邮箱
	 */
	public String getDudaoyouxiang() {
		return dudaoyouxiang;
	}
			
}
