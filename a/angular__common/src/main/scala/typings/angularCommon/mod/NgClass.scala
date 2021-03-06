package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.DoCheck
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.IterableDiffers
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.Renderer2
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgClass")
@js.native
class NgClass protected () extends DoCheck {
  def this(
    _iterableDiffers: IterableDiffers,
    _keyValueDiffers: KeyValueDiffers,
    _ngEl: ElementRef[_],
    _renderer: Renderer2
  ) = this()
  /**
    * Applies a collection of CSS classes to the DOM element.
    *
    * For argument of type Set and Array CSS class names contained in those collections are always
    * added.
    * For argument of type Map CSS class name in the map's key is toggled based on the value (added
    * for truthy and removed for falsy).
    */
  var _applyClasses: js.Any = js.native
  var _applyIterableChanges: js.Any = js.native
  var _applyKeyValueChanges: js.Any = js.native
  var _initialClasses: js.Any = js.native
  var _iterableDiffer: js.Any = js.native
  var _iterableDiffers: js.Any = js.native
  var _keyValueDiffer: js.Any = js.native
  var _keyValueDiffers: js.Any = js.native
  var _ngEl: js.Any = js.native
  var _rawClass: js.Any = js.native
  /**
    * Removes a collection of CSS classes from the DOM element. This is mostly useful for cleanup
    * purposes.
    */
  var _removeClasses: js.Any = js.native
  var _renderer: js.Any = js.native
  var _toggleClass: js.Any = js.native
  def klass(value: String): js.Any = js.native
  def ngClass(value: String): js.Any = js.native
  def ngClass(value: js.Array[String]): js.Any = js.native
  def ngClass(value: StringDictionary[js.Any]): js.Any = js.native
  def ngClass(value: Set[String]): js.Any = js.native
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
}

