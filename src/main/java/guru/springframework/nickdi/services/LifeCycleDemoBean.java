package guru.springframework.nickdi.services;

import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, 
	BeanFactoryAware, ApplicationContextAware {
	
	public LifeCycleDemoBean() {
		
		System.out.println("## I'm in the LifeCycleBean Constructor");
	}
	
	@Override
	public void setBeanName(String name) {
		
		System.out.println("## BeanNameAware.setBeanName - My Bean Name is: " + name);
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("## BeanFactoryAware.setBeanFactory - Bean Factory has been set");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println("## ApplicationContextAware.setApplicationContext - Application Context has been set");		
	}

	public void beforeInit() {
		
		System.out.println("## - Before Init - Called by Bean Post Processor");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("## InitializingBean.afterPropertiesSet - The Life Cycle has its properties set");
	}
	
	public void afterInit() {
		
		System.out.println("## - After Init - Called by Bean Post Processor");
	}
	
	@PreDestroy
	public void preDestroy() {
		
		System.out.println("## The PreDestroy annotated method has been called");
	}
	
	@Override
	public void destroy() throws Exception {
		
		System.out.println("## DisposableBean.destroy has been set - The Lifecycle Bean has been terminated");
	}
	
}
