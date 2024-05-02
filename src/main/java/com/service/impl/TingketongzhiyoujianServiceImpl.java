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


import com.dao.TingketongzhiyoujianDao;
import com.entity.TingketongzhiyoujianEntity;
import com.service.TingketongzhiyoujianService;
import com.entity.vo.TingketongzhiyoujianVO;
import com.entity.view.TingketongzhiyoujianView;

@Service("tingketongzhiyoujianService")
public class TingketongzhiyoujianServiceImpl extends ServiceImpl<TingketongzhiyoujianDao, TingketongzhiyoujianEntity> implements TingketongzhiyoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingketongzhiyoujianEntity> page = this.selectPage(
                new Query<TingketongzhiyoujianEntity>(params).getPage(),
                new EntityWrapper<TingketongzhiyoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingketongzhiyoujianEntity> wrapper) {
		  Page<TingketongzhiyoujianView> page =new Query<TingketongzhiyoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingketongzhiyoujianVO> selectListVO(Wrapper<TingketongzhiyoujianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingketongzhiyoujianVO selectVO(Wrapper<TingketongzhiyoujianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingketongzhiyoujianView> selectListView(Wrapper<TingketongzhiyoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingketongzhiyoujianView selectView(Wrapper<TingketongzhiyoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
