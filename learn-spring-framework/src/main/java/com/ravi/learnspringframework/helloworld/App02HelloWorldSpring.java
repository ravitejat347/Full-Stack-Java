 package com.ravi.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ravi.learnspringframework.game.GameRunner;
import com.ravi.learnspringframework.game.MarioGame;
import com.ravi.learnspringframework.game.PacManGame;
import com.ravi.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		 try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){ 
			 System.out.println(context.getBean("name"));
			 System.out.println(context.getBean("age"));
			 System.out.println(context.getBean("person"));
			 System.out.println(context.getBean("person2MethodCall"));
			 System.out.println(context.getBean("person3Parameters"));
			 System.out.println(context.getBean("address2"));
			 System.out.println(context.getBean(Address.class));
		 }
	}
}
