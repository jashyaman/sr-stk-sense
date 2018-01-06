package config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("sr.stksense.web")
@EnableWebMvc
public class DispatcherConfig extends WebMvcConfigurerAdapter{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	@Autowired
	public MappingJackson2HttpMessageConverter jsonConvertor() {
		return new MappingJackson2HttpMessageConverter();
		
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		converters.add(jsonConvertor());
		super.configureMessageConverters(converters);
	}
	
	

	
	
}
