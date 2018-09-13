package com.xw.alice;

import com.xw.alice.model.User;
import com.xw.alice.provider.UserProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xuw-e on 2018/9/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserProvider userProvider;

    private User user;

    @Before
    public void before() {
        user = new User();
        user.setName("huangrong");
        user.setAge(78);
        user.setGender(1);
        user.setPhoneNumber(15195910029L);
    }

    @Test
    @Transactional
    @Rollback
    public void test() {
        Boolean isSucceed = userProvider.insert(user);
        Assert.assertEquals(Boolean.TRUE, isSucceed);
    }
}
