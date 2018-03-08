package com.example.springdatainterfaceprojection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataInterfaceProjectionApplicationTests {

	@Autowired
	MyEntityRepository repository;

	@Test
	public void contextLoads()
	{
	    // select myentity0_.name as col_0_0_ from my_entity myentity0_ where myentity0_.id=?
		repository.findById(1L);
	}

}
