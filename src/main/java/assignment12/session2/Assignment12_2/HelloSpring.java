package assignment12.session2.Assignment12_2;

import org.springframework.context.ApplicationContext;

public class HelloSpring {

	public String getValueFromContext(String beanName) {
		ApplicationContext appCtx = AppContextUtil.getApplicationContext();
		String strFromContext = (String) appCtx.getBean(beanName);
		return strFromContext;
	}
}