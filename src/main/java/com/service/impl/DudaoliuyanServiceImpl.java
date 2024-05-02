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


import com.dao.DudaoliuyanDao;
import com.entity.DudaoliuyanEntity;
import com.service.DudaoliuyanService;
import com.entity.vo.DudaoliuyanVO;
import com.entity.view.DudaoliuyanView;

@Service("dudaoliuyanService")
public class DudaoliuyanServiceImpl extends ServiceImpl<DudaoliuyanDao, DudaoliuyanEntity> implements DudaoliuyanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DudaoliuyanEntity> page = this.selectPage(
                new Query<DudaoliuyanEntity>(params).getPage(),
                new EntityWrapper<DudaoliuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DudaoliuyanEntity> wrapper) {
		  Page<DudaoliuyanView> page =new Query<DudaoliuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DudaoliuyanVO> selectListVO(Wrapper<DudaoliuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DudaoliuyanVO selectVO(Wrapper<DudaoliuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DudaoliuyanView> selectListView(Wrapper<DudaoliuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DudaoliuyanView selectView(Wrapper<DudaoliuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
