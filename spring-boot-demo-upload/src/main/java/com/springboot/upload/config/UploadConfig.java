//package com.springboot.upload.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.autoconfigure.web.servlet.MultipartProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.multipart.MultipartResolver;
//import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
//import org.springframework.web.multipart.support.StandardServletMultipartResolver;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.MultipartConfigElement;
//import javax.servlet.Servlet;
//
///**
// * <p>
// * 上传配置
// * </p>
// *
// * @package: com.xkcoding.upload.config
// * @description: 上传配置
// * @author: yangkai.shen
// * @date: Created in 2018/10/23 14:09
// * @copyright: Copyright (c) 2018
// * @version: V1.0
// * @modified: yangkai.shen
// */
//
//@Configuration
//@ConditionalOnClass({Servlet.class, StandardMultipartHttpServletRequest.class, MultipartConfigElement.class})
//@ConditionalOnProperty(prefix = "spring.http.multipart",name = "enabled",matchIfMissing = true)
//@EnableConfigurationProperties(MultipartProperties.class)
//public class UploadConfig {
//
//    private final MultipartProperties multipartProperties;
//
//    /**
//     * 上传配置
//     */
//    @Autowired
//    public UploadConfig(MultipartProperties multipartProperties){
//        this.multipartProperties = multipartProperties;
//    }
//
//    /**
//     * 注册解析器
//     */
//    @Bean(name = DispatcherServlet.MULTIPART_RESOLVER_BEAN_NAME)
//    @ConditionalOnMissingBean(MultipartResolver.class)
//    public StandardServletMultipartResolver multipartResolver(){
//        StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
//        multipartResolver.setResolveLazily(this.multipartProperties.isResolveLazily());
//        return multipartResolver;
//    }
//
//
//
//
//}
