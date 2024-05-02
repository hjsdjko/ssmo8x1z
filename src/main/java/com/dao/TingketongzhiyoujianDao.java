package com.dao;

import com.entity.TingketongzhiyoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingketongzhiyoujianVO;
import com.entity.view.TingketongzhiyoujianView;


/**
 * 听课通知邮件
 * 
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface TingketongzhiyoujianDao extends BaseMapper<TingketongzhiyoujianEntity> {
	
	List<TingketongzhiyoujianVO> selectListVO(@Param("ew") Wrapper<TingketongzhiyoujianEntity> wrapper);
	
	TingketongzhiyoujianVO selectVO(@Param("ew") Wrapper<TingketongzhiyoujianEntity> wrapper);
	
	List<TingketongzhiyoujianView> selectListView(@Param("ew") Wrapper<TingketongzhiyoujianEntity> wrapper);

	List<TingketongzhiyoujianView> selectListView(Pagination page,@Param("ew") Wrapper<TingketongzhiyoujianEntity> wrapper);
	
	TingketongzhiyoujianView selectView(@Param("ew") Wrapper<TingketongzhiyoujianEntity> wrapper);
	
}
