package com.xw.alice;

import com.xw.alice.model.User;
import com.xw.alice.provider.UserProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by xuw-e on 2018/9/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MakeDataTest {
    @Autowired
    private UserProvider userProvider;

    @Test
    public void insertData() {
        IntStream.range(257, 10_000).forEach(e -> {
            User user = new User();
            user.setName("haha" + e);
            user.setAge(1);
            user.setGender(new Random().nextInt() % 2);
            userProvider.insert(user);
        });

    }

}
