//  A pure Kotlin Java FXML 8 template

package sample

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

// App's entry point.  Passes control the the JavaFX framework
fun main(args: Array<String>) = Application.launch(MainFxml::class.java, *args)

class MainFxml : Application() {
	override fun start(primaryStage: Stage) {
		primaryStage
			.apply {
				title = "Where's my beer"
				scene = Scene(FXMLLoader.load(MainFxml::class.java.getResource("Main.fxml")))
			}
			.show()
	}
}
