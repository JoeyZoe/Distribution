package typings.colorConvert.routeMod

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cmyk extends js.Object {
  def ansi16(from: CMYK_): ANSI16_
  def ansi256(from: CMYK_): ANSI256_
  def apple(from: CMYK_): APPLE_
  def gray(from: CMYK_): GRAY_
  def hcg(from: CMYK_): HCG_
  def hex(from: CMYK_): HEX_
  def hsl(from: CMYK_): HSL_
  def hsv(from: CMYK_): HSV_
  def hwb(from: CMYK_): HWB_
  def keyword(from: CMYK_): KEYWORD_
  def lab(from: CMYK_): LAB_
  def lch(from: CMYK_): LCH_
  def rgb(from: CMYK_): RGB_
  def xyz(from: CMYK_): XYZ_
}

object cmyk {
  @scala.inline
  def apply(
    ansi16: CMYK_ => ANSI16_,
    ansi256: CMYK_ => ANSI256_,
    apple: CMYK_ => APPLE_,
    gray: CMYK_ => GRAY_,
    hcg: CMYK_ => HCG_,
    hex: CMYK_ => HEX_,
    hsl: CMYK_ => HSL_,
    hsv: CMYK_ => HSV_,
    hwb: CMYK_ => HWB_,
    keyword: CMYK_ => KEYWORD_,
    lab: CMYK_ => LAB_,
    lch: CMYK_ => LCH_,
    rgb: CMYK_ => RGB_,
    xyz: CMYK_ => XYZ_
  ): cmyk = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[cmyk]
  }
}

