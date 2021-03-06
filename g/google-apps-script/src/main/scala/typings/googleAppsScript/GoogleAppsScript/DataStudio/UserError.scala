package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error that is shown to users of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newUserError()
  *       .setText("This is the debug error text.")
  *       .setDebugText("This text is only shown to admins.")
  *       .throwException();
  */
trait UserError extends js.Object {
  def printJson(): String
  def setDebugText(text: String): UserError
  def setText(text: String): UserError
  def throwException(): Unit
}

object UserError {
  @scala.inline
  def apply(
    printJson: () => String,
    setDebugText: String => UserError,
    setText: String => UserError,
    throwException: () => Unit
  ): UserError = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson), setDebugText = js.Any.fromFunction1(setDebugText), setText = js.Any.fromFunction1(setText), throwException = js.Any.fromFunction0(throwException))
  
    __obj.asInstanceOf[UserError]
  }
}

