package typings.validator.mod.validator

import typings.validator.validatorNumbers.`4`
import typings.validator.validatorStrings.`3`
import typings.validator.validatorStrings.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.validator.validatorNumbers.`3`
  - typings.validator.validatorNumbers.`4`
  - typings.validator.validatorNumbers.`5`
  - typings.validator.validatorStrings.`3`
  - typings.validator.validatorStrings.`4`
  - typings.validator.validatorStrings.`5`
  - typings.validator.validatorStrings.all
*/
trait UUIDVersion extends js.Object

object UUIDVersion {
  @scala.inline
  def `3`: typings.validator.validatorNumbers.`3` = this.cast(3)
  @JSName("3")
  @scala.inline
  def `3_3`: `3` = this.cast("3")
  @scala.inline
  def `4`: typings.validator.validatorStrings.`4` = this.cast("4")
  @JSName("4")
  @scala.inline
  def `4_4`: `4` = this.cast(4)
  @scala.inline
  def `5`: typings.validator.validatorNumbers.`5` = this.cast(5)
  @JSName("5")
  @scala.inline
  def `5_5`: `5` = this.cast("5")
  @scala.inline
  def all: typings.validator.validatorStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

