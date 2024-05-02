package com.dao;

import com.entity.TingkejieguotongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingkejieguotongzhiVO;
import com.entity.view.TingkejieguotongzhiView;


/**
 * 听课结果通知
 * 
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface TingkejieguotongzhiDao extends BaseMapper<TingkejieguotongzhiEntity> {
	
	List<TingkejieguotongzhiVO> selectListVO(@Param("ew") Wrapper<TingkejieguotongzhiEntity> wrapper);
	
	TingkejieguotongzhiVO selectVO(@Param("ew") Wrapper<TingkejieguotongzhiEntity> wrapper);
	
	List<TingkejieguotongzhiView> selectListView(@Param("ew") Wrapper<TingkejieguotongzhiEntity> wrapper);

	List<TingkejieguotongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<TingkejieguotongzhiEntity> wrapper);
	
	TingkejieguotongzhiView selectView(@Param("ew") Wrapper<TingkejieguotongzhiEntity> wrapper);
	
}
