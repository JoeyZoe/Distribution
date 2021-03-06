package typings.jupyterlabObservables.observablestringMod

import typings.jupyterlabObservables.modeldbMod.IObservable
import typings.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableString_ extends IObservable {
  /**
    * A signal emitted when the string has changed.
    */
  val changed: ISignal[this.type, IChangedArgs]
  /**
    * The value of the string.
    */
  var text: String
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableString_ : typings.jupyterlabObservables.jupyterlabObservablesStrings.String
  /**
    * Set the ObservableString to an empty string.
    */
  def clear(): Unit
  /**
    * Insert a substring.
    *
    * @param index - The starting index.
    *
    * @param text - The substring to insert.
    */
  def insert(index: Double, text: String): Unit
  /**
    * Remove a substring.
    *
    * @param start - The starting index.
    *
    * @param end - The ending index.
    */
  def remove(start: Double, end: Double): Unit
}

object IObservableString_ {
  @scala.inline
  def apply(
    changed: ISignal[IObservableString_, IChangedArgs],
    clear: () => Unit,
    dispose: () => Unit,
    insert: (Double, String) => Unit,
    isDisposed: Boolean,
    remove: (Double, Double) => Unit,
    text: String,
    `type`: typings.jupyterlabObservables.jupyterlabObservablesStrings.String
  ): IObservableString_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), insert = js.Any.fromFunction2(insert), isDisposed = isDisposed.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableString_]
  }
}

