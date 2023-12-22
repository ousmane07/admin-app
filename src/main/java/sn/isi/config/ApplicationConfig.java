package sn.isi.config;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import sn.isi.mapping.AppRolesMapper;


@Configuration
public class ApplicationConfig {
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }


    public AppRolesMapper appRolesMapper;

    @Bean
    public AppRolesMapper appRolesMapper(){

        return appRolesMapper;
    }

}