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


import com.dao.TingkejieguotongzhiDao;
import com.entity.TingkejieguotongzhiEntity;
import com.service.TingkejieguotongzhiService;
import com.entity.vo.TingkejieguotongzhiVO;
import com.entity.view.TingkejieguotongzhiView;

@Service("tingkejieguotongzhiService")
public class TingkejieguotongzhiServiceImpl extends ServiceImpl<TingkejieguotongzhiDao, TingkejieguotongzhiEntity> implements TingkejieguotongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingkejieguotongzhiEntity> page = this.selectPage(
                new Query<TingkejieguotongzhiEntity>(params).getPage(),
                new EntityWrapper<TingkejieguotongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingkejieguotongzhiEntity> wrapper) {
		  Page<TingkejieguotongzhiView> page =new Query<TingkejieguotongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingkejieguotongzhiVO> selectListVO(Wrapper<TingkejieguotongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingkejieguotongzhiVO selectVO(Wrapper<TingkejieguotongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingkejieguotongzhiView> selectListView(Wrapper<TingkejieguotongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingkejieguotongzhiView selectView(Wrapper<TingkejieguotongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
