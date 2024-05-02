package com.dao;

import com.entity.JiaoshishoukeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshishoukeVO;
import com.entity.view.JiaoshishoukeView;


/**
 * 教师授课
 * 
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface JiaoshishoukeDao extends BaseMapper<JiaoshishoukeEntity> {
	
	List<JiaoshishoukeVO> selectListVO(@Param("ew") Wrapper<JiaoshishoukeEntity> wrapper);
	
	JiaoshishoukeVO selectVO(@Param("ew") Wrapper<JiaoshishoukeEntity> wrapper);
	
	List<JiaoshishoukeView> selectListView(@Param("ew") Wrapper<JiaoshishoukeEntity> wrapper);

	List<JiaoshishoukeView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshishoukeEntity> wrapper);
	
	JiaoshishoukeView selectView(@Param("ew") Wrapper<JiaoshishoukeEntity> wrapper);
	
}
