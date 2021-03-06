package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alternative hypotheses (a.k.a. n-best list).
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative extends js.Object {
  /**
    * The confidence estimate between 0.0 and 1.0. A higher number indicates an
    * estimated greater likelihood that the recognized words are correct. This
    * field is typically provided only for the top hypothesis, and only for
    * `is_final=true` results. Clients should not rely on the `confidence`
    * field as it is not guaranteed to be accurate or consistent. The default
    * of 0.0 is a sentinel value indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Transcript text representing the words that the user spoke.
    */
  var transcript: js.UndefOr[String] = js.native
  /**
    * A list of word-specific information for each recognized word.
    */
  var words: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2WordInfo]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    transcript: String = null,
    words: js.Array[SchemaGoogleCloudVideointelligenceV1beta2WordInfo] = null
  ): SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (transcript != null) __obj.updateDynamic("transcript")(transcript.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative]
  }
}

