package typings.pulumiAws.mod.lambda

import typings.pulumiAws.getFunctionMod.GetFunctionArgs
import typings.pulumiAws.getFunctionMod.GetFunctionResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.getFunction")
@js.native
object getFunction extends js.Object {
  def apply(args: GetFunctionArgs): js.Promise[GetFunctionResult] with GetFunctionResult = js.native
  def apply(args: GetFunctionArgs, opts: InvokeOptions): js.Promise[GetFunctionResult] with GetFunctionResult = js.native
}

