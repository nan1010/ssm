package testMybatis;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.dao.UserMapper;
import com.home.domain.User;

public class UserMapperTest {
	ApplicationContext ctx;
	@Before
	public void setUp() throws Exception{
		ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	}
	@Test
	public void testFindByUserName() {
		User user = ((UserMapper) ctx.getBean("userMapper")).findByUsername("zhao");
		System.out.println(user.getPassword());
	}

}
