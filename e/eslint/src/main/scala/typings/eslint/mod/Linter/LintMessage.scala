package typings.eslint.mod.Linter

import typings.eslint.eslintBooleans.`true`
import typings.eslint.mod.Rule.Fix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintMessage extends js.Object {
  var column: Double
  var endColumn: js.UndefOr[Double] = js.undefined
  var endLine: js.UndefOr[Double] = js.undefined
  var fatal: js.UndefOr[`true`] = js.undefined
  var fix: js.UndefOr[Fix] = js.undefined
  var line: Double
  var message: String
  var messageId: js.UndefOr[String] = js.undefined
  var nodeType: String
  var ruleId: String | Null
  var severity: Severity
  var source: String | Null
  var suggestions: js.UndefOr[js.Array[LintSuggestion]] = js.undefined
}

object LintMessage {
  @scala.inline
  def apply(
    column: Double,
    line: Double,
    message: String,
    nodeType: String,
    severity: Severity,
    endColumn: Int | Double = null,
    endLine: Int | Double = null,
    fatal: `true` = null,
    fix: Fix = null,
    messageId: String = null,
    ruleId: String = null,
    source: String = null,
    suggestions: js.Array[LintSuggestion] = null
  ): LintMessage = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (fatal != null) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintMessage]
  }
}

