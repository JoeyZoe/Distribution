package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EventState")
@js.native
class EventState protected () extends js.Object {
  /**
    * Create a new EventState
    * @param mask defines the mask associated with this state
    * @param skipNextObservers defines a flag which will instruct the observable to skip following observers when set to true
    * @param target defines the original target of the state
    * @param currentTarget defines the current target of the state
    */
  def this(mask: Double) = this()
  def this(mask: Double, skipNextObservers: Boolean) = this()
  def this(mask: Double, skipNextObservers: Boolean, target: js.Any) = this()
  def this(mask: Double, skipNextObservers: Boolean, target: js.Any, currentTarget: js.Any) = this()
  /**
    * The current object in the bubbling phase
    */
  var currentTarget: js.UndefOr[js.Any] = js.native
  /**
    * This will be populated with the return value of the last function that was executed.
    * If it is the first function in the callback chain it will be the event data.
    */
  var lastReturnValue: js.UndefOr[js.Any] = js.native
  /**
    * Get the mask value that were used to trigger the event corresponding to this EventState object
    */
  var mask: Double = js.native
  /**
    * An Observer can set this property to true to prevent subsequent observers of being notified
    */
  var skipNextObservers: Boolean = js.native
  /**
    * The object that originally notified the event
    */
  var target: js.UndefOr[js.Any] = js.native
  /**
    * Initialize the current event state
    * @param mask defines the mask associated with this state
    * @param skipNextObservers defines a flag which will instruct the observable to skip following observers when set to true
    * @param target defines the original target of the state
    * @param currentTarget defines the current target of the state
    * @returns the current event state
    */
  def initalize(mask: Double): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Boolean): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Boolean, target: js.Any): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Boolean, target: js.Any, currentTarget: js.Any): EventState = js.native
}

