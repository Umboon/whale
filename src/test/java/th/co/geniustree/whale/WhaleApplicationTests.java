package th.co.geniustree.whale;

import th.co.geniustree.whale.WhaleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WhaleApplication.class)
@WebAppConfiguration
public class WhaleApplicationTests {

	@Test
	public void contextLoads() {
	}

}
