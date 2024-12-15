package com.example.hahow_mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Arrays;
import java.util.Locale;

/**
 * @author: tcsow
 * @date: 2024/10/10
 */
@Configuration
public class WebConfig {

    @Bean
    public LocaleResolver localeResolver() {
        final AcceptHeaderLocaleResolver resolver = new AcceptHeaderLocaleResolver();
        resolver.setSupportedLocales(Arrays.asList(Locale.TAIWAN, Locale.ENGLISH));
        resolver.setDefaultLocale(Locale.ENGLISH);
        return resolver;
    }
}