//  A pure Kotlin JavaFX 8 template
//
//  Note: JavaFX 11 is a different beast (uses modules), so you need to find a
//  maven/gradle project template.  Kotlin runs well with JavaFX 8 and there
//  are 8.0.201 Oracle JDKs floating around the internet for all the platforms :)

package sample

import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.scene.text.Text
import javafx.stage.Stage

// App's entry point.  Passes control the the JavaFX framework
fun main(args: Array<String>) = Application.launch(Main::class.java, *args)

class Main : Application() {
	override fun start(primaryStage: Stage) {
		primaryStage
			.apply {
				title = "Where's my beer"
				scene = Scene(createContent())
			}
			.show()
	}

	private fun createContent(): Pane = VBox(10.0).apply {
		alignment = Pos.CENTER
		prefWidth = 640.0
		prefHeight = 480.0
		val beer = Text("More for me...")
		val lol = Button("Ha Ha").apply {
			onAction = EventHandler { println("Tastes good, thanks") }
		}
		children.addAll(beer, lol)
	}
}
