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


import com.dao.ShenqingdudaotingkeDao;
import com.entity.ShenqingdudaotingkeEntity;
import com.service.ShenqingdudaotingkeService;
import com.entity.vo.ShenqingdudaotingkeVO;
import com.entity.view.ShenqingdudaotingkeView;

@Service("shenqingdudaotingkeService")
public class ShenqingdudaotingkeServiceImpl extends ServiceImpl<ShenqingdudaotingkeDao, ShenqingdudaotingkeEntity> implements ShenqingdudaotingkeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingdudaotingkeEntity> page = this.selectPage(
                new Query<ShenqingdudaotingkeEntity>(params).getPage(),
                new EntityWrapper<ShenqingdudaotingkeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingdudaotingkeEntity> wrapper) {
		  Page<ShenqingdudaotingkeView> page =new Query<ShenqingdudaotingkeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingdudaotingkeVO> selectListVO(Wrapper<ShenqingdudaotingkeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingdudaotingkeVO selectVO(Wrapper<ShenqingdudaotingkeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingdudaotingkeView> selectListView(Wrapper<ShenqingdudaotingkeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingdudaotingkeView selectView(Wrapper<ShenqingdudaotingkeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
