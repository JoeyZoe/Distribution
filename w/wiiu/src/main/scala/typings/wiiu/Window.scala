package typings.wiiu

import typings.std.CustomEvent
import typings.wiiu.wiiuStrings.wiiu_imageview_change_content
import typings.wiiu.wiiuStrings.wiiu_imageview_change_viewmode
import typings.wiiu.wiiuStrings.wiiu_imageview_end
import typings.wiiu.wiiuStrings.wiiu_imageview_error
import typings.wiiu.wiiuStrings.wiiu_imageview_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var wiiu: Typeofwiiu = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangecontent(`type`: wiiu_imageview_change_content, listener: js.Function1[/* ev */ CustomEvent[_], _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangecontent(
    `type`: wiiu_imageview_change_content,
    listener: js.Function1[/* ev */ CustomEvent[_], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangeviewmode(`type`: wiiu_imageview_change_viewmode, listener: js.Function1[/* ev */ CustomEvent[_], _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewchangeviewmode(
    `type`: wiiu_imageview_change_viewmode,
    listener: js.Function1[/* ev */ CustomEvent[_], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewend(`type`: wiiu_imageview_end, listener: js.Function1[/* ev */ CustomEvent[_], _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewend(
    `type`: wiiu_imageview_end,
    listener: js.Function1[/* ev */ CustomEvent[_], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewerror(`type`: wiiu_imageview_error, listener: js.Function1[/* ev */ CustomEvent[_], _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewerror(
    `type`: wiiu_imageview_error,
    listener: js.Function1[/* ev */ CustomEvent[_], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewstart(`type`: wiiu_imageview_start, listener: js.Function1[/* ev */ CustomEvent[_], _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuimageviewstart(
    `type`: wiiu_imageview_start,
    listener: js.Function1[/* ev */ CustomEvent[_], _],
    useCapture: Boolean
  ): Unit = js.native
}

