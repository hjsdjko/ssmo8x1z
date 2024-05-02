package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingketongzhiyoujianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingketongzhiyoujianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingketongzhiyoujianView;


/**
 * 听课通知邮件
 *
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
public interface TingketongzhiyoujianService extends IService<TingketongzhiyoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingketongzhiyoujianVO> selectListVO(Wrapper<TingketongzhiyoujianEntity> wrapper);
   	
   	TingketongzhiyoujianVO selectVO(@Param("ew") Wrapper<TingketongzhiyoujianEntity> wrapper);
   	
   	List<TingketongzhiyoujianView> selectListView(Wrapper<TingketongzhiyoujianEntity> wrapper);
   	
   	TingketongzhiyoujianView selectView(@Param("ew") Wrapper<TingketongzhiyoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingketongzhiyoujianEntity> wrapper);
   	
}

