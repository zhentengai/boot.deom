package boot.doem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.hxf.app.Application;
import com.hxf.entity.UserInfo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class },webEnvironment=WebEnvironment.RANDOM_PORT)
public class AppTest {

	@Autowired
	StringRedisTemplate stringRedisTemplate;
	
//	@Autowired
	RestTemplate restTemplate;
	
//	@Test
//	public void test() {
//		
//		try {
//			stringRedisTemplate.opsForValue().set("t1", "t1");
//			
//			stringRedisTemplate.opsForSet().add("top", "1");
//			
//			
//			System.out.println("  ----------------------"+stringRedisTemplate.opsForSet().getOperations().getExpire("top"));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("111111111");
//	}
//	
	@Test
	public void urlTest() {
		restTemplate = new RestTemplate();
		UserInfo u = restTemplate.getForObject("http://127.0.0.1:8080/user/info", UserInfo.class);
		System.out.println("name    :  "+u.getName());
		System.out.println("userName:  "+u.getUsername());
		System.out.println("password:  "+u.getPassword());
	}
	
	
}
