package typings.ckeditor.CKEDITOR.ui.dialog

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.dialog.uiElement")
@js.native
class uiElement protected () extends js.Object {
  // Not sure that the htmlList array type is right.
  def this(
    dialog: typings.ckeditor.CKEDITOR.dialog,
    elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
    htmlList: js.Array[_]
  ) = this()
  def this(
    dialog: typings.ckeditor.CKEDITOR.dialog,
    elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
    htmlList: js.Array[_],
    nodeNameArg: js.Function0[String]
  ) = this()
  def this(
    dialog: typings.ckeditor.CKEDITOR.dialog,
    elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
    htmlList: js.Array[_],
    nodeNameArg: js.Function0[String],
    stylesArg: js.Function0[StringDictionary[_]]
  ) = this()
  def this(
    dialog: typings.ckeditor.CKEDITOR.dialog,
    elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
    htmlList: js.Array[_],
    nodeNameArg: js.Function0[String],
    stylesArg: js.Function0[StringDictionary[_]],
    attributesArg: js.Function0[StringDictionary[_]]
  ) = this()
  def this(
    dialog: typings.ckeditor.CKEDITOR.dialog,
    elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
    htmlList: js.Array[_],
    nodeNameArg: js.Function0[String],
    stylesArg: js.Function0[StringDictionary[_]],
    attributesArg: js.Function0[StringDictionary[_]],
    contentsArg: js.Function0[StringDictionary[_] | String]
  ) = this()
  var eventProcessors: js.Any = js.native
  def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
  def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def focus(): js.UndefOr[uiElement] = js.native
  def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
  def getElement(): element = js.native
  def getInputElement(): element = js.native
  def getValue(): js.Any = js.native
  def isChanged(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def isFocusable(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): uiElement = js.native
  def selectParentTab(): uiElement = js.native
  def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[uiElement] = js.native
}

