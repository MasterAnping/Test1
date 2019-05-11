package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring-*.xml" })
//@WebAppConfiguration
//@Transactional
//@Rollback(false)
public class MainTest { 
	
	
	

	@Test
	public void test1() {
		//courseMapper.insert(new Course(4,"体育","体育课"));
	}
	
}
