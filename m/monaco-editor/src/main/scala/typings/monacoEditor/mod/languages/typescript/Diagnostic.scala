package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.monacoEditorNumbers.`0`
import typings.monacoEditor.monacoEditorNumbers.`1`
import typings.monacoEditor.monacoEditorNumbers.`2`
import typings.monacoEditor.monacoEditorNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends DiagnosticRelatedInformation {
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.undefined
  /** May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic. */
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object Diagnostic {
  @scala.inline
  def apply(
    category: `0` | `1` | `2` | `3`,
    code: Double,
    messageText: String | DiagnosticMessageChain,
    file: js.UndefOr[scala.Nothing] = js.undefined,
    length: Int | Double = null,
    relatedInformation: js.Array[DiagnosticRelatedInformation] = null,
    reportsUnnecessary: js.Object = null,
    source: String = null,
    start: Int | Double = null
  ): Diagnostic = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (relatedInformation != null) __obj.updateDynamic("relatedInformation")(relatedInformation.asInstanceOf[js.Any])
    if (reportsUnnecessary != null) __obj.updateDynamic("reportsUnnecessary")(reportsUnnecessary.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
}

