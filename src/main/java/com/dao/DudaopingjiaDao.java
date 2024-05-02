package com.dao;

import com.entity.DudaopingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DudaopingjiaVO;
import com.entity.view.DudaopingjiaView;


/**
 * 督导评价
 * 
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface DudaopingjiaDao extends BaseMapper<DudaopingjiaEntity> {
	
	List<DudaopingjiaVO> selectListVO(@Param("ew") Wrapper<DudaopingjiaEntity> wrapper);
	
	DudaopingjiaVO selectVO(@Param("ew") Wrapper<DudaopingjiaEntity> wrapper);
	
	List<DudaopingjiaView> selectListView(@Param("ew") Wrapper<DudaopingjiaEntity> wrapper);

	List<DudaopingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<DudaopingjiaEntity> wrapper);
	
	DudaopingjiaView selectView(@Param("ew") Wrapper<DudaopingjiaEntity> wrapper);
	
}
