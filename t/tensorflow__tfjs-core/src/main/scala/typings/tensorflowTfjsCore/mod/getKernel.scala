package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "getKernel")
@js.native
object getKernel extends js.Object {
  def apply(kernelName: String, backendName: String): KernelConfig = js.native
}

