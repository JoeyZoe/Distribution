package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateTextRequest extends js.Object {
  /**
    * The language code for the language of the source text. The language must be a language supported by Amazon Translate. For a list of language codes, see what-is-languages. To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
    */
  var SourceLanguageCode: LanguageCodeString = js.native
  /**
    * The language code requested for the language of the target text. The language must be a language supported by Amazon Translate.
    */
  var TargetLanguageCode: LanguageCodeString = js.native
  /**
    * The name of the terminology list file to be used in the TranslateText request. You can use 1 terminology list at most in a TranslateText request. Terminology lists can contain a maximum of 256 terms.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.native
  /**
    * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set, this may be fewer than 5,000 characters.
    */
  var Text: BoundedLengthString = js.native
}

object TranslateTextRequest {
  @scala.inline
  def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    Text: BoundedLengthString,
    TerminologyNames: ResourceNameList = null
  ): TranslateTextRequest = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCode = TargetLanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    if (TerminologyNames != null) __obj.updateDynamic("TerminologyNames")(TerminologyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateTextRequest]
  }
}

