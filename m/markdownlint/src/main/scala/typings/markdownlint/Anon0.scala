package typings.markdownlint

import typings.markdownlint.markdownlintStrings.asterisk
import typings.markdownlint.markdownlintStrings.consistent
import typings.markdownlint.markdownlintStrings.dash
import typings.markdownlint.markdownlintStrings.plus
import typings.markdownlint.markdownlintStrings.sublist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var style: js.UndefOr[consistent | asterisk | plus | dash | sublist] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(style: consistent | asterisk | plus | dash | sublist = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

