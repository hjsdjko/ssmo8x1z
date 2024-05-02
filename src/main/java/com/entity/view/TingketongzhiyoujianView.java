package com.entity.view;

import com.entity.TingketongzhiyoujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 听课通知邮件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
@TableName("tingketongzhiyoujian")
public class TingketongzhiyoujianView  extends TingketongzhiyoujianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingketongzhiyoujianView(){
	}
 
 	public TingketongzhiyoujianView(TingketongzhiyoujianEntity tingketongzhiyoujianEntity){
 	try {
			BeanUtils.copyProperties(this, tingketongzhiyoujianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
