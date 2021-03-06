package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDetectionResult extends js.Object {
  /**
    * Details about text detected in a video.
    */
  var TextDetection: js.UndefOr[typings.awsSdk.rekognitionMod.TextDetection] = js.native
  /**
    * The time, in milliseconds from the start of the video, that the text was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.rekognitionMod.Timestamp] = js.native
}

object TextDetectionResult {
  @scala.inline
  def apply(TextDetection: TextDetection = null, Timestamp: Int | Double = null): TextDetectionResult = {
    val __obj = js.Dynamic.literal()
    if (TextDetection != null) __obj.updateDynamic("TextDetection")(TextDetection.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDetectionResult]
  }
}

