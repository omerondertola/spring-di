package tr.com.tolaas.springdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BeanLifeCycleDemo implements
        ApplicationContextAware,
        BeanFactoryAware,
        InitializingBean,
        DisposableBean,
        BeanNameAware,
        ApplicationEventPublisherAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### Application Context Set: " + applicationContext);
        System.out.println("### Application Context Parent Bean Factory: " + applicationContext.getParentBeanFactory());
        ;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### Bean Factory Set: " + beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### After properties set.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### Disposable bean destroy() called.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### My name is " + s);
    }

    @PostConstruct
    private void postCreate() {
        System.out.println("### POST CONSTRUCT");
    }

    @PostConstruct
    private void postCreate2() {
        System.out.println("### POST CONSTRUCT2");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("### PRE DESTROY");
    }

    @PreDestroy
    private void preDestroy2() {
        System.out.println("### PRE DESTROY 2");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("### applicationEventPublisher set: "+applicationEventPublisher);
    }
}
