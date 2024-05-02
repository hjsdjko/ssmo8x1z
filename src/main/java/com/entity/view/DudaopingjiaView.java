package com.entity.view;

import com.entity.DudaopingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 督导评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
@TableName("dudaopingjia")
public class DudaopingjiaView  extends DudaopingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DudaopingjiaView(){
	}
 
 	public DudaopingjiaView(DudaopingjiaEntity dudaopingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, dudaopingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
