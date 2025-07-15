package com.abhi.setterinjection;

import com.abhi.components.Customer;
import com.abhi.components.Payment;
import com.abhi.configuration.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SetterInjectionApplication {

	public static void main(String[] args) {

		SpringApplication.run(SetterInjectionApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Payment payment = context.getBean(Payment.class);
		Customer customer = context.getBean(Customer.class);

		System.out.println(payment.getProviderName());
		System.out.println(customer.getName());
		System.out.println(customer.getPayment());

	}

}
