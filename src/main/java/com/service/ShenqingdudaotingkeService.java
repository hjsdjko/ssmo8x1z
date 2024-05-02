package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingdudaotingkeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingdudaotingkeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingdudaotingkeView;


/**
 * 申请督导听课
 *
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface ShenqingdudaotingkeService extends IService<ShenqingdudaotingkeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingdudaotingkeVO> selectListVO(Wrapper<ShenqingdudaotingkeEntity> wrapper);
   	
   	ShenqingdudaotingkeVO selectVO(@Param("ew") Wrapper<ShenqingdudaotingkeEntity> wrapper);
   	
   	List<ShenqingdudaotingkeView> selectListView(Wrapper<ShenqingdudaotingkeEntity> wrapper);
   	
   	ShenqingdudaotingkeView selectView(@Param("ew") Wrapper<ShenqingdudaotingkeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingdudaotingkeEntity> wrapper);
   	
}

