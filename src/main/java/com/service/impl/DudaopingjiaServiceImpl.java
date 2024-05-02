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


import com.dao.DudaopingjiaDao;
import com.entity.DudaopingjiaEntity;
import com.service.DudaopingjiaService;
import com.entity.vo.DudaopingjiaVO;
import com.entity.view.DudaopingjiaView;

@Service("dudaopingjiaService")
public class DudaopingjiaServiceImpl extends ServiceImpl<DudaopingjiaDao, DudaopingjiaEntity> implements DudaopingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DudaopingjiaEntity> page = this.selectPage(
                new Query<DudaopingjiaEntity>(params).getPage(),
                new EntityWrapper<DudaopingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DudaopingjiaEntity> wrapper) {
		  Page<DudaopingjiaView> page =new Query<DudaopingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DudaopingjiaVO> selectListVO(Wrapper<DudaopingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DudaopingjiaVO selectVO(Wrapper<DudaopingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DudaopingjiaView> selectListView(Wrapper<DudaopingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DudaopingjiaView selectView(Wrapper<DudaopingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
