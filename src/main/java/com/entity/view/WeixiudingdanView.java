package com.entity.view;

import com.entity.WeixiudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 16:01:10
 */
@TableName("weixiudingdan")
public class WeixiudingdanView  extends WeixiudingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiudingdanView(){
	}
 
 	public WeixiudingdanView(WeixiudingdanEntity weixiudingdanEntity){
 	try {
			BeanUtils.copyProperties(this, weixiudingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
