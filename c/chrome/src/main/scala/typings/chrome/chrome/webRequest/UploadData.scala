package typings.chrome.chrome.webRequest

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadData extends js.Object {
  /** Optional. An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[ArrayBuffer] = js.undefined
  /** Optional. A string with the file's path and name. */
  var file: js.UndefOr[String] = js.undefined
}

object UploadData {
  @scala.inline
  def apply(bytes: ArrayBuffer = null, file: String = null): UploadData = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
}

