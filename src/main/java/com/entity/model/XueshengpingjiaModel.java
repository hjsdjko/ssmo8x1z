package com.entity.model;

import com.entity.XueshengpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public class XueshengpingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 教学质量评分
	 */
	
	private String jiaoxuezhiliangpingfen;
		
	/**
	 * 教学态度评分
	 */
	
	private String jiaoxuetaidupingfen;
		
	/**
	 * 综合教学评分
	 */
	
	private String zonghejiaoxuepingfen;
		
	/**
	 * 平均分
	 */
	
	private Float pingjunfen;
		
	/**
	 * 评价留言
	 */
	
	private String pingjialiuyan;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
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
	 * 设置：教学质量评分
	 */
	 
	public void setJiaoxuezhiliangpingfen(String jiaoxuezhiliangpingfen) {
		this.jiaoxuezhiliangpingfen = jiaoxuezhiliangpingfen;
	}
	
	/**
	 * 获取：教学质量评分
	 */
	public String getJiaoxuezhiliangpingfen() {
		return jiaoxuezhiliangpingfen;
	}
				
	
	/**
	 * 设置：教学态度评分
	 */
	 
	public void setJiaoxuetaidupingfen(String jiaoxuetaidupingfen) {
		this.jiaoxuetaidupingfen = jiaoxuetaidupingfen;
	}
	
	/**
	 * 获取：教学态度评分
	 */
	public String getJiaoxuetaidupingfen() {
		return jiaoxuetaidupingfen;
	}
				
	
	/**
	 * 设置：综合教学评分
	 */
	 
	public void setZonghejiaoxuepingfen(String zonghejiaoxuepingfen) {
		this.zonghejiaoxuepingfen = zonghejiaoxuepingfen;
	}
	
	/**
	 * 获取：综合教学评分
	 */
	public String getZonghejiaoxuepingfen() {
		return zonghejiaoxuepingfen;
	}
				
	
	/**
	 * 设置：平均分
	 */
	 
	public void setPingjunfen(Float pingjunfen) {
		this.pingjunfen = pingjunfen;
	}
	
	/**
	 * 获取：平均分
	 */
	public Float getPingjunfen() {
		return pingjunfen;
	}
				
	
	/**
	 * 设置：评价留言
	 */
	 
	public void setPingjialiuyan(String pingjialiuyan) {
		this.pingjialiuyan = pingjialiuyan;
	}
	
	/**
	 * 获取：评价留言
	 */
	public String getPingjialiuyan() {
		return pingjialiuyan;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
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
