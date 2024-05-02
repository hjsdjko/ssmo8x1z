package com.entity.vo;

import com.entity.TingketongzhiyoujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 听课通知邮件
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public class TingketongzhiyoujianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 课程封面
	 */
	
	private String kechengfengmian;
		
	/**
	 * 听课日期
	 */
	
	private String tingkeriqi;
		
	/**
	 * 通知时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongzhishijian;
		
	/**
	 * 督导工号
	 */
	
	private String dudaogonghao;
		
	/**
	 * 督导姓名
	 */
	
	private String dudaoxingming;
		
	/**
	 * 督导邮箱
	 */
	
	private String dudaoyouxiang;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
				
	
	/**
	 * 设置：课程封面
	 */
	 
	public void setKechengfengmian(String kechengfengmian) {
		this.kechengfengmian = kechengfengmian;
	}
	
	/**
	 * 获取：课程封面
	 */
	public String getKechengfengmian() {
		return kechengfengmian;
	}
				
	
	/**
	 * 设置：听课日期
	 */
	 
	public void setTingkeriqi(String tingkeriqi) {
		this.tingkeriqi = tingkeriqi;
	}
	
	/**
	 * 获取：听课日期
	 */
	public String getTingkeriqi() {
		return tingkeriqi;
	}
				
	
	/**
	 * 设置：通知时间
	 */
	 
	public void setTongzhishijian(Date tongzhishijian) {
		this.tongzhishijian = tongzhishijian;
	}
	
	/**
	 * 获取：通知时间
	 */
	public Date getTongzhishijian() {
		return tongzhishijian;
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
