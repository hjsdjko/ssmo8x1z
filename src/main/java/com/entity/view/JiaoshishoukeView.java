package com.entity.view;

import com.entity.JiaoshishoukeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师授课
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
@TableName("jiaoshishouke")
public class JiaoshishoukeView  extends JiaoshishoukeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshishoukeView(){
	}
 
 	public JiaoshishoukeView(JiaoshishoukeEntity jiaoshishoukeEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshishoukeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
