package org.chez_credit.banking_app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BankingAppApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        assertThat(applicationContext).isNotNull();
    }

    @Test
    void testBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("someBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testAnotherBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("anotherBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testServiceBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("serviceBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testRepositoryBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("repositoryBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testControllerBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("controllerBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testComponentBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("componentBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testConfigurationBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("configurationBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testUtilityBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("utilityBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testCustomBeanPresence() {
        boolean beanPresent = applicationContext.containsBeanDefinition("customBeanName");
        assertThat(beanPresent).isTrue();
    }

    @Test
    void testSpecificBeanType() {
        Object bean = applicationContext.getBean("specificBeanName");
        assertThat(bean).isInstanceOf(SpecificBeanClass.class);
    }

    @Test
    void testEnvironmentProperty() {
        String property = applicationContext.getEnvironment().getProperty("some.property");
        assertThat(property).isEqualTo("expectedValue");
    }

    @Test
    void testActiveProfiles() {
        String[] activeProfiles = applicationContext.getEnvironment().getActiveProfiles();
        assertThat(activeProfiles).contains("dev");
    }
}