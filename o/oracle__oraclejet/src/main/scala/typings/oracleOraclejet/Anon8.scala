package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon8 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object Anon8 {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): Anon8 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon8]
  }
}

