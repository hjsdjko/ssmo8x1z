package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshishoukeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshishoukeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshishoukeView;


/**
 * 教师授课
 *
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface JiaoshishoukeService extends IService<JiaoshishoukeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshishoukeVO> selectListVO(Wrapper<JiaoshishoukeEntity> wrapper);
   	
   	JiaoshishoukeVO selectVO(@Param("ew") Wrapper<JiaoshishoukeEntity> wrapper);
   	
   	List<JiaoshishoukeView> selectListView(Wrapper<JiaoshishoukeEntity> wrapper);
   	
   	JiaoshishoukeView selectView(@Param("ew") Wrapper<JiaoshishoukeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshishoukeEntity> wrapper);
   	
}

