package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackHTMLAttributes[T] extends HTMLAttributes[T] {
  var default: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcLang: js.UndefOr[String] = js.undefined
}

object TrackHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    default: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    label: String = null,
    src: String = null,
    srcLang: String = null
  ): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcLang != null) __obj.updateDynamic("srcLang")(srcLang.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
}

