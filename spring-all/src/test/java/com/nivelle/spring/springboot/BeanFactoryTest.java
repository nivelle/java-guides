package com.nivelle.spring.springboot;

import com.nivelle.spring.springcore.beanFactory.Component;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 自动装配测试
 *
 * @author fuxinzhong
 * @date 2020/12/03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanFactoryTest {

    /**
     * 按类型装配因为有两个实现类，导致装配失败
     */
    @Autowired
    private Component component;

    @Test
    public void test(){

    }


}
