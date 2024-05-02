package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DudaoliuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DudaoliuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DudaoliuyanView;


/**
 * 督导留言
 *
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface DudaoliuyanService extends IService<DudaoliuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DudaoliuyanVO> selectListVO(Wrapper<DudaoliuyanEntity> wrapper);
   	
   	DudaoliuyanVO selectVO(@Param("ew") Wrapper<DudaoliuyanEntity> wrapper);
   	
   	List<DudaoliuyanView> selectListView(Wrapper<DudaoliuyanEntity> wrapper);
   	
   	DudaoliuyanView selectView(@Param("ew") Wrapper<DudaoliuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DudaoliuyanEntity> wrapper);
   	
}

