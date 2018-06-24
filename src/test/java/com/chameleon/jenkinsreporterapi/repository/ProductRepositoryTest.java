package com.chameleon.jenkinsreporterapi.repository;

import com.chameleon.jenkinsreporterapi.domain.Environment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    private static final String ENVIRONMENT_NAME = "Latest";

    @Autowired
    private EnvironmentRepository environmentRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        Environment environment = new Environment();
        environment.setEnvironmentName(ENVIRONMENT_NAME);
        //when
        environmentRepository.save(environment);

        //then
        Assert.assertNotNull(environment.getId());
        Environment newProduct = environmentRepository.findById(environment.getId()).orElse(null);
        Assert.assertEquals((Long) 1L, newProduct.getId());
        Assert.assertEquals(ENVIRONMENT_NAME, newProduct.getEnvironmentName());
    }
}