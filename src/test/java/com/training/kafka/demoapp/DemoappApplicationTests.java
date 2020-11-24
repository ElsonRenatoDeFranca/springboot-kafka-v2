package com.training.kafka.demoapp;

import com.training.kafka.demoapp.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


@SpringBootTest
class DemoappApplicationTests {


	@Autowired
	private UserController controller;

	@Test
	public void contextLoads()  throws Exception{
		assertThat(controller, is(notNullValue()));
	}


}
