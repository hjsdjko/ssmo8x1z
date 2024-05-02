package com.dao;

import com.entity.DudaoliuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DudaoliuyanVO;
import com.entity.view.DudaoliuyanView;


/**
 * 督导留言
 * 
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface DudaoliuyanDao extends BaseMapper<DudaoliuyanEntity> {
	
	List<DudaoliuyanVO> selectListVO(@Param("ew") Wrapper<DudaoliuyanEntity> wrapper);
	
	DudaoliuyanVO selectVO(@Param("ew") Wrapper<DudaoliuyanEntity> wrapper);
	
	List<DudaoliuyanView> selectListView(@Param("ew") Wrapper<DudaoliuyanEntity> wrapper);

	List<DudaoliuyanView> selectListView(Pagination page,@Param("ew") Wrapper<DudaoliuyanEntity> wrapper);
	
	DudaoliuyanView selectView(@Param("ew") Wrapper<DudaoliuyanEntity> wrapper);
	
}
