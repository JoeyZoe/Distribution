package typings.forkTsCheckerWebpackPlugin.issueIssueMod

import typings.forkTsCheckerWebpackPlugin.issueOriginMod.IssueOrigin
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var character: js.UndefOr[Double] = js.undefined
  var code: String
  var file: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var message: String
  var origin: IssueOrigin
  var severity: IssueSeverity
  var stack: js.UndefOr[String] = js.undefined
}

object Issue {
  @scala.inline
  def apply(
    code: String,
    message: String,
    origin: IssueOrigin,
    severity: IssueSeverity,
    character: Int | Double = null,
    file: String = null,
    line: Int | Double = null,
    stack: String = null
  ): Issue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}

