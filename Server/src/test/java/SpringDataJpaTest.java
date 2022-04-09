import com.mychat.config.ApplicationConfig;
import com.mychat.model.User;
import com.mychat.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

//@ContextConfiguration("/spring.xml")
@ContextConfiguration(classes = ApplicationConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringDataJpaTest {


    @Autowired
    UserRepository userRepository;


    @Test
    public void testUpdate() {
        Optional<User> user = userRepository.findById(1L);
        System.out.println(user);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("HJF");
        user.setAge(28);
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

    @Test
    public void testPage() {

    }
}
