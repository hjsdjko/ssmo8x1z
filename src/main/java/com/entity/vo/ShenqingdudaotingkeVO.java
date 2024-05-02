package com.entity.vo;

import com.entity.ShenqingdudaotingkeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 申请督导听课
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public class ShenqingdudaotingkeVO  implements Serializable {
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tingkeriqi;
		
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
	 * 申请理由
	 */
	
	private String shenqingliyou;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
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
	 
	public void setTingkeriqi(Date tingkeriqi) {
		this.tingkeriqi = tingkeriqi;
	}
	
	/**
	 * 获取：听课日期
	 */
	public Date getTingkeriqi() {
		return tingkeriqi;
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
	 * 设置：申请理由
	 */
	 
	public void setShenqingliyou(String shenqingliyou) {
		this.shenqingliyou = shenqingliyou;
	}
	
	/**
	 * 获取：申请理由
	 */
	public String getShenqingliyou() {
		return shenqingliyou;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
