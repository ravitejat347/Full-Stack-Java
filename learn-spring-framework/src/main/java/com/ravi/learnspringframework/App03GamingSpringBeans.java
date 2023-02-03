package com.ravi.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ravi.learnspringframework.game.GameRunner;
import com.ravi.learnspringframework.game.GamingConsole;
import com.ravi.learnspringframework.game.MarioGame;
import com.ravi.learnspringframework.game.PacManGame;
import com.ravi.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {
	
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			//getting bean by bean name
			((GamingConsole) context.getBean("game1")).up();
			((GamingConsole) context.getBean("game2")).down();
			((GamingConsole) context.getBean("game3")).left();
			//getting bean by type (interface name)
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
