package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Speaks a text._
  * @see https://docs.scriptable.app/speech
  */
@JSGlobal("Speech")
@js.native
object Speech extends js.Object {
  /**
    * Speaks a text.
    * @param text - Text to speak.
    * @see https://docs.scriptable.app/speech/#speak
    */
  def speak(text: String): Unit = js.native
}

