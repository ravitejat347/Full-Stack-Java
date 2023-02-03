package com.ravi.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ravi.learnspringframework.game.GameRunner;
import com.ravi.learnspringframework.game.GamingConsole;
import com.ravi.learnspringframework.game.MarioGame;
import com.ravi.learnspringframework.game.PacManGame;
import com.ravi.learnspringframework.game.SuperContraGame;

@Configuration 
public class GamingConfiguration {
	
	@Bean
	@Qualifier("game1")
	public GamingConsole game1() {
		var game1 = new MarioGame();
		return game1;
	}
	
	@Bean
	@Qualifier("game2")
	public GamingConsole game2() {
		var game2 = new SuperContraGame();
		return game2;
	}
	
	@Bean
	@Primary
	@Qualifier("game3")
	public GamingConsole game3() {
		var game3 = new PacManGame();
		return game3;
	}
	
	@Bean
	public GameRunner gameRunner(@Qualifier("game1")GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	

}
