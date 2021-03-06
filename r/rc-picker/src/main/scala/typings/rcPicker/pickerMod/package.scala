package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pickerMod {
  type OmitPanelProps[Props] = typings.std.Omit[
    Props, 
    typings.rcPicker.rcPickerStrings.onChange | typings.rcPicker.rcPickerStrings.hideHeader | typings.rcPicker.rcPickerStrings.pickerValue | typings.rcPicker.rcPickerStrings.onPickerValueChange
  ]
}
