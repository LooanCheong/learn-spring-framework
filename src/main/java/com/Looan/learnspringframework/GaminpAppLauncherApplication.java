package com.Looan.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Looan.learnspringframework.game.GameRunner;
import com.Looan.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.Looan.learnspringframework.game")
public class GaminpAppLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GaminpAppLauncherApplication.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}
}
