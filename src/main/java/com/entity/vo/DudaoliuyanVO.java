package com.entity.vo;

import com.entity.DudaoliuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 督导留言
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public class DudaoliuyanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 改进内容
	 */
	
	private String gaijinneirong;
		
	/**
	 * 督导留言
	 */
	
	private String dudaoliuyan;
		
	/**
	 * 督导工号
	 */
	
	private String dudaogonghao;
		
	/**
	 * 督导姓名
	 */
	
	private String dudaoxingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：改进内容
	 */
	 
	public void setGaijinneirong(String gaijinneirong) {
		this.gaijinneirong = gaijinneirong;
	}
	
	/**
	 * 获取：改进内容
	 */
	public String getGaijinneirong() {
		return gaijinneirong;
	}
				
	
	/**
	 * 设置：督导留言
	 */
	 
	public void setDudaoliuyan(String dudaoliuyan) {
		this.dudaoliuyan = dudaoliuyan;
	}
	
	/**
	 * 获取：督导留言
	 */
	public String getDudaoliuyan() {
		return dudaoliuyan;
	}
				
	
	/**
	 * 设置：督导工号
	 */
	 
	public void setDudaogonghao(String dudaogonghao) {
		this.dudaogonghao = dudaogonghao;
	}
	
	/**
	 * 获取：督导工号
	 */
	public String getDudaogonghao() {
		return dudaogonghao;
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
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
