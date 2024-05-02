package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DudaoliuyanEntity;
import com.entity.view.DudaoliuyanView;

import com.service.DudaoliuyanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 督导留言
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-27 20:19:43
 */
@RestController
@RequestMapping("/dudaoliuyan")
public class DudaoliuyanController {
    @Autowired
    private DudaoliuyanService dudaoliuyanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DudaoliuyanEntity dudaoliuyan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dudao")) {
			dudaoliuyan.setDudaogonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DudaoliuyanEntity> ew = new EntityWrapper<DudaoliuyanEntity>();
		PageUtils page = dudaoliuyanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dudaoliuyan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DudaoliuyanEntity dudaoliuyan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dudao")) {
			dudaoliuyan.setDudaogonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DudaoliuyanEntity> ew = new EntityWrapper<DudaoliuyanEntity>();
		PageUtils page = dudaoliuyanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dudaoliuyan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DudaoliuyanEntity dudaoliuyan){
       	EntityWrapper<DudaoliuyanEntity> ew = new EntityWrapper<DudaoliuyanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dudaoliuyan, "dudaoliuyan")); 
        return R.ok().put("data", dudaoliuyanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DudaoliuyanEntity dudaoliuyan){
        EntityWrapper< DudaoliuyanEntity> ew = new EntityWrapper< DudaoliuyanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dudaoliuyan, "dudaoliuyan")); 
		DudaoliuyanView dudaoliuyanView =  dudaoliuyanService.selectView(ew);
		return R.ok("查询督导留言成功").put("data", dudaoliuyanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DudaoliuyanEntity dudaoliuyan = dudaoliuyanService.selectById(id);
        return R.ok().put("data", dudaoliuyan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DudaoliuyanEntity dudaoliuyan = dudaoliuyanService.selectById(id);
        return R.ok().put("data", dudaoliuyan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DudaoliuyanEntity dudaoliuyan, HttpServletRequest request){
    	dudaoliuyan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dudaoliuyan);

        dudaoliuyanService.insert(dudaoliuyan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody DudaoliuyanEntity dudaoliuyan, HttpServletRequest request){
    	dudaoliuyan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dudaoliuyan);
    	dudaoliuyan.setUserid((Long)request.getSession().getAttribute("userId"));

        dudaoliuyanService.insert(dudaoliuyan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DudaoliuyanEntity dudaoliuyan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dudaoliuyan);
        dudaoliuyanService.updateById(dudaoliuyan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dudaoliuyanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DudaoliuyanEntity> wrapper = new EntityWrapper<DudaoliuyanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dudao")) {
			wrapper.eq("dudaogonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = dudaoliuyanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
