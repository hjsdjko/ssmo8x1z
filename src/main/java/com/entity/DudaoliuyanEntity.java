package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 督导留言
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
@TableName("dudaoliuyan")
public class DudaoliuyanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DudaoliuyanEntity() {
		
	}
	
	public DudaoliuyanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
