package typings.mangopay2NodejsSdk.mod.bankAccount

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHECKING
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAVINGS
*/
trait DepositAccountType extends js.Object

object DepositAccountType {
  @scala.inline
  def CHECKING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHECKING = this.cast("CHECKING")
  @scala.inline
  def SAVINGS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAVINGS = this.cast("SAVINGS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

