package typings.sqsProducer.mod

import typings.node.Buffer
import typings.sqsProducer.sqsProducerStrings.Binary
import typings.sqsProducer.sqsProducerStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessageAttribute extends js.Object {
  var BinaryValue: js.UndefOr[Buffer] = js.undefined
  var DataType: String | Binary
  var StringValue: js.UndefOr[java.lang.String] = js.undefined
}

object ProducerMessageAttribute {
  @scala.inline
  def apply(DataType: String | Binary, BinaryValue: Buffer = null, StringValue: java.lang.String = null): ProducerMessageAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessageAttribute]
  }
}

