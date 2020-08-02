package com.xxl.job.executor.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.xxl.job.executor.Application;

/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@RunWith(SpringRunner.class)*/
@SpringBootTest(classes = Application.class ,webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class XxlJobExecutorExampleBootApplicationTests {

	@Test
	public void test() {

	}

}