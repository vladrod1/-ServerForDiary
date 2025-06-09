package org.example.diaryserverspringboot.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Класс для настрйки веб-конфигурации
public class WebConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses(){
        return null; //ничего, так как нет root config class
    }
    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class[]{Configuration.class}; //Соединяем конфиг-класс
    }
    @Override
    protected String[] getServletMappings(){
        return new String[]{"/"}; //Указываем стартовый путь
    }
}
