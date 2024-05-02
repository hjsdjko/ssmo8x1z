package com.entity.view;

import com.entity.DudaoliuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 督导留言
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
@TableName("dudaoliuyan")
public class DudaoliuyanView  extends DudaoliuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DudaoliuyanView(){
	}
 
 	public DudaoliuyanView(DudaoliuyanEntity dudaoliuyanEntity){
 	try {
			BeanUtils.copyProperties(this, dudaoliuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
