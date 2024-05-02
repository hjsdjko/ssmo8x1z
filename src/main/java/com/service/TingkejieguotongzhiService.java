package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingkejieguotongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingkejieguotongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingkejieguotongzhiView;


/**
 * 听课结果通知
 *
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface TingkejieguotongzhiService extends IService<TingkejieguotongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingkejieguotongzhiVO> selectListVO(Wrapper<TingkejieguotongzhiEntity> wrapper);
   	
   	TingkejieguotongzhiVO selectVO(@Param("ew") Wrapper<TingkejieguotongzhiEntity> wrapper);
   	
   	List<TingkejieguotongzhiView> selectListView(Wrapper<TingkejieguotongzhiEntity> wrapper);
   	
   	TingkejieguotongzhiView selectView(@Param("ew") Wrapper<TingkejieguotongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingkejieguotongzhiEntity> wrapper);
   	
}

