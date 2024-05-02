package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DudaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DudaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DudaoView;


/**
 * 督导
 *
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface DudaoService extends IService<DudaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DudaoVO> selectListVO(Wrapper<DudaoEntity> wrapper);
   	
   	DudaoVO selectVO(@Param("ew") Wrapper<DudaoEntity> wrapper);
   	
   	List<DudaoView> selectListView(Wrapper<DudaoEntity> wrapper);
   	
   	DudaoView selectView(@Param("ew") Wrapper<DudaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DudaoEntity> wrapper);
   	
}

