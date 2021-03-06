package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is broadcast by a {@link Controller} whenever the state of the feature changes
  * @see XController
  * @see XStatusListener
  */
trait FeatureStateEvent extends EventObject {
  /** contains a descriptor of the feature for the user interface. */
  var FeatureDescriptor: String
  /** contains the URL of the feature. */
  var FeatureURL: URL
  /** specifies whether the feature is currently enabled or disabled. */
  var IsEnabled: Boolean
  /**
    * specifies whether the {@link XDispatch} has to be requeried.
    *
    * Interest code should listen for {@link FrameActionEvent} too, to update own feature states and dispatch listener on FrameAction::CONTEXT_CHANGED.
    */
  var Requery: Boolean
  /**
    * contains the state of the feature in this dispatch.
    *
    * This can be, for example, simply `TRUE` for a boolean feature like underline on/off. Some simple types like `string` or `boolean` are useful here for
    * generic UI elements, like a checkmark in a menu.
    */
  var State: js.Any
}

object FeatureStateEvent {
  @scala.inline
  def apply(
    FeatureDescriptor: String,
    FeatureURL: URL,
    IsEnabled: Boolean,
    Requery: Boolean,
    Source: XInterface,
    State: js.Any
  ): FeatureStateEvent = {
    val __obj = js.Dynamic.literal(FeatureDescriptor = FeatureDescriptor, FeatureURL = FeatureURL, IsEnabled = IsEnabled, Requery = Requery, Source = Source, State = State)
  
    __obj.asInstanceOf[FeatureStateEvent]
  }
}

