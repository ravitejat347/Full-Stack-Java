package com.ravi.learnspringframework;

import com.ravi.learnspringframework.game.GameRunner;
import com.ravi.learnspringframework.game.MarioGame;
import com.ravi.learnspringframework.game.PacManGame;
import com.ravi.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
