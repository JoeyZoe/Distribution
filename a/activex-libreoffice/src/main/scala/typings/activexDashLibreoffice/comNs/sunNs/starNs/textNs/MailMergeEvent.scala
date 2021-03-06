package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a mail merge event.
  *
  * This type of event is being send by the mail merge service right before the merging of the next document to be processed. This allows for example to
  * modify the document specifically before it gets merged.
  * @see com.sun.star.text.MailMerge
  * @since OOo 1.1.2
  */
trait MailMergeEvent extends EventObject {
  /** The model of the document to be processed next. */
  var Model: XModel
}

object MailMergeEvent {
  @scala.inline
  def apply(Model: XModel, Source: XInterface): MailMergeEvent = {
    val __obj = js.Dynamic.literal(Model = Model, Source = Source)
  
    __obj.asInstanceOf[MailMergeEvent]
  }
}

