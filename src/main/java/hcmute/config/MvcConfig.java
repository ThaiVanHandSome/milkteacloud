package hcmute.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	//Đây là một cấu hình Spring MVC (Model-View-Controller)
	//Được sử dụng để cấu hình các điều hướng và khai báo các view mặc định.
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/security/login").setViewName("security/login");
		registry.addViewController("/").setViewName("security/login");
	}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/user/css/**")
                .addResourceLocations("classpath:/static/user/css/");
    }

}
