package com.sanhao.tech.data.service.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.sanhao.tech.data.service.serviceImpl.OrderServiceImpl;
import com.sanhao.tech.sevice.service.OrderService;
import com.sanhao.tech.data.service.config.DubboBaseConfig;

/**
 * ref: http://dubbo.io/User+Guide-zh.htm
 * @author sanhao
 *
 */

@Configuration
@Import({OrderServiceConfig.class,CouponServiceConfig.class})
public class AllServiceConfig {

}
