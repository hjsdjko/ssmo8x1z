package com.dao;

import com.entity.DudaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DudaoVO;
import com.entity.view.DudaoView;


/**
 * 督导
 * 
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface DudaoDao extends BaseMapper<DudaoEntity> {
	
	List<DudaoVO> selectListVO(@Param("ew") Wrapper<DudaoEntity> wrapper);
	
	DudaoVO selectVO(@Param("ew") Wrapper<DudaoEntity> wrapper);
	
	List<DudaoView> selectListView(@Param("ew") Wrapper<DudaoEntity> wrapper);

	List<DudaoView> selectListView(Pagination page,@Param("ew") Wrapper<DudaoEntity> wrapper);
	
	DudaoView selectView(@Param("ew") Wrapper<DudaoEntity> wrapper);
	
}
