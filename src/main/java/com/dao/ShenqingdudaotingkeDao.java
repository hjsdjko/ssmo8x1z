package com.dao;

import com.entity.ShenqingdudaotingkeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingdudaotingkeVO;
import com.entity.view.ShenqingdudaotingkeView;


/**
 * 申请督导听课
 * 
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface ShenqingdudaotingkeDao extends BaseMapper<ShenqingdudaotingkeEntity> {
	
	List<ShenqingdudaotingkeVO> selectListVO(@Param("ew") Wrapper<ShenqingdudaotingkeEntity> wrapper);
	
	ShenqingdudaotingkeVO selectVO(@Param("ew") Wrapper<ShenqingdudaotingkeEntity> wrapper);
	
	List<ShenqingdudaotingkeView> selectListView(@Param("ew") Wrapper<ShenqingdudaotingkeEntity> wrapper);

	List<ShenqingdudaotingkeView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingdudaotingkeEntity> wrapper);
	
	ShenqingdudaotingkeView selectView(@Param("ew") Wrapper<ShenqingdudaotingkeEntity> wrapper);
	
}
