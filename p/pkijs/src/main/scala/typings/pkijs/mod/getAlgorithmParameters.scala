package typings.pkijs.mod

import typings.pkijs.AnonAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "getAlgorithmParameters")
@js.native
object getAlgorithmParameters extends js.Object {
  /**
    * Get default algorithm parameters for each kind of operation
    *
    * @param {string} algorithmName Algorithm name to get common parameters for
    * @param {string} operation Kind of operation: "sign", "encrypt", "generatekey", "importkey", "exportkey", "verify"
    * @returns {{ algorithm: Algorithm; usages: KeyUsage[]; }}
    */
  def apply(algorithmName: String, operation: String): AnonAlgorithm = js.native
}

