package com.entity.view;

import com.entity.ZaixiangoutongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线沟通
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 16:01:10
 */
@TableName("zaixiangoutong")
public class ZaixiangoutongView  extends ZaixiangoutongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixiangoutongView(){
	}
 
 	public ZaixiangoutongView(ZaixiangoutongEntity zaixiangoutongEntity){
 	try {
			BeanUtils.copyProperties(this, zaixiangoutongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
