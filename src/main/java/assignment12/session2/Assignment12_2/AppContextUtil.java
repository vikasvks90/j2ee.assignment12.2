package assignment12.session2.Assignment12_2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller
public class AppContextUtil implements ApplicationContextAware {

	private static ApplicationContext context;

	public void setApplicationContext(ApplicationContext appContext) throws BeansException {
		context = appContext;
		
	}
	
	public static ApplicationContext getApplicationContext() {
		return context;
	}
}
