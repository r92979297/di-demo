package com.fafik.config;

import com.fafik.examplebeans.FakeDataSource;
import com.fafik.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${fafik.username}")
    String user;

    @Value("${fafik.password}")
    String password;

    @Value("${fafik.dburl}")
    String url;

    @Value("${fafik.jms.username}")
    String jmsUsername;

    @Value("${fafik.jms.password}")
    String jmsPassword;

    @Value("${fafik.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

}
