package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//initialize the configuration of spring and junit

@RunWith(SpringJUnit4ClassRunner.class)
//tell junit the location of spring configuration file
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {
	
}
