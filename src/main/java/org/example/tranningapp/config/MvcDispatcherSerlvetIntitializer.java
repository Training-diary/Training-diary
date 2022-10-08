package org.example.tranningapp.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcDispatcherSerlvetIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
