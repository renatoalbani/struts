package org.superbiz.struts;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

//    @Bean
//    public SiteMeshFilter siteMeshFilter(){
//        SiteMeshFilter siteMeshFilter = new SiteMeshFilter();
//        siteMeshFilter.init();
//        return siteMeshFilter;
//    }

}
