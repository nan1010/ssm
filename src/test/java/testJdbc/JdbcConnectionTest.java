package testJdbc;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcConnectionTest {
	ApplicationContext ctx;
	@Before
	public void setUp() throws Exception{
		ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	}
	@Test
	public void testJdbcConnetion() throws Exception {
		DriverManagerDataSource dataSource =  (DriverManagerDataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}

}
