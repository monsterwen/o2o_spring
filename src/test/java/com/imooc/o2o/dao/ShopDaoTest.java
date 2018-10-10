package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest{
	@Autowired
	private ShopDao shopDao;
	@Test
	@Ignore
	public void testInsertShop() {
		Shop shop=new Shop();
		PersonInfo owner=new PersonInfo();
		Area area=new Area();
		ShopCategory shopCategory=new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("test shop name");
		shop.setShopDesc("this is a potential shop");
		shop.setShopAddr("test");
		shop.setPhone("3184971651");
		shop.setShopImg("no image");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("under review");
		
		int effectedNum= shopDao.insertShop(shop);
		assertEquals(1,effectedNum);
	}
	@Test
	public void testUpdateShop() {
		Shop shop=new Shop();
		shop.setShopId(2L);
		
		shop.setShopDesc("hi this is a potential shop new");
		shop.setShopAddr("hi test");
		shop.setEnableStatus(1);
		shop.setLastEditTime(new Date());
		int effectedNum= shopDao.updateShop(shop);
		assertEquals(1,effectedNum);
	}
	
}
