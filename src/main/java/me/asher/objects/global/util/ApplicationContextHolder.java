package me.asher.objects.global.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public final class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @NotNull
    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextHolder.applicationContext = applicationContext;
    }

}

