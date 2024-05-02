package com.entity.view;

import com.entity.ShenqingdudaotingkeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请督导听课
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
@TableName("shenqingdudaotingke")
public class ShenqingdudaotingkeView  extends ShenqingdudaotingkeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingdudaotingkeView(){
	}
 
 	public ShenqingdudaotingkeView(ShenqingdudaotingkeEntity shenqingdudaotingkeEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingdudaotingkeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
