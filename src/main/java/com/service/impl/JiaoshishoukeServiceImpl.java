package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoshishoukeDao;
import com.entity.JiaoshishoukeEntity;
import com.service.JiaoshishoukeService;
import com.entity.vo.JiaoshishoukeVO;
import com.entity.view.JiaoshishoukeView;

@Service("jiaoshishoukeService")
public class JiaoshishoukeServiceImpl extends ServiceImpl<JiaoshishoukeDao, JiaoshishoukeEntity> implements JiaoshishoukeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshishoukeEntity> page = this.selectPage(
                new Query<JiaoshishoukeEntity>(params).getPage(),
                new EntityWrapper<JiaoshishoukeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshishoukeEntity> wrapper) {
		  Page<JiaoshishoukeView> page =new Query<JiaoshishoukeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshishoukeVO> selectListVO(Wrapper<JiaoshishoukeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshishoukeVO selectVO(Wrapper<JiaoshishoukeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshishoukeView> selectListView(Wrapper<JiaoshishoukeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshishoukeView selectView(Wrapper<JiaoshishoukeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
