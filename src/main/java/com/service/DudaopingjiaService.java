package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DudaopingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DudaopingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DudaopingjiaView;


/**
 * 督导评价
 *
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface DudaopingjiaService extends IService<DudaopingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DudaopingjiaVO> selectListVO(Wrapper<DudaopingjiaEntity> wrapper);
   	
   	DudaopingjiaVO selectVO(@Param("ew") Wrapper<DudaopingjiaEntity> wrapper);
   	
   	List<DudaopingjiaView> selectListView(Wrapper<DudaopingjiaEntity> wrapper);
   	
   	DudaopingjiaView selectView(@Param("ew") Wrapper<DudaopingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DudaopingjiaEntity> wrapper);
   	
}

