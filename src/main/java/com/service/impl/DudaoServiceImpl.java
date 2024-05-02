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


import com.dao.DudaoDao;
import com.entity.DudaoEntity;
import com.service.DudaoService;
import com.entity.vo.DudaoVO;
import com.entity.view.DudaoView;

@Service("dudaoService")
public class DudaoServiceImpl extends ServiceImpl<DudaoDao, DudaoEntity> implements DudaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DudaoEntity> page = this.selectPage(
                new Query<DudaoEntity>(params).getPage(),
                new EntityWrapper<DudaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DudaoEntity> wrapper) {
		  Page<DudaoView> page =new Query<DudaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DudaoVO> selectListVO(Wrapper<DudaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DudaoVO selectVO(Wrapper<DudaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DudaoView> selectListView(Wrapper<DudaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DudaoView selectView(Wrapper<DudaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
