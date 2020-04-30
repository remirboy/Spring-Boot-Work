//package ru.kpfu.itis.semestrovka.configs;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("ru.kpfu.itis.semestrovka")
//public class WebConfig implements WebMvcConfigurer {
//        @Override
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                registry.addResourceHandler("../static/**")
//                        .addResourceLocations("/static/");
//        }
//        @Bean
//        public ViewResolver viewResolver() {
//                ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
//                templateResolver.setTemplateMode("XHTML");
//                templateResolver.setPrefix("views/");
//                templateResolver.setSuffix(".html");
//
//                SpringTemplateEngine engine = new SpringTemplateEngine();
//                engine.setTemplateResolver(templateResolver);
//
//                ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//                viewResolver.setTemplateEngine(engine);
//                return viewResolver;
//        }
//}