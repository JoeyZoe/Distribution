package typings.jose.mod.JWK

import typings.jose.mod.JWKECKey
import typings.jose.mod.JWKOKPKey
import typings.jose.mod.JWKOctKey
import typings.jose.mod.JWKRSAKey
import typings.jose.mod.KeyInput
import typings.jose.mod.KeyParameters
import typings.node.cryptoMod.KeyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.importKey")
@js.native
object importKey extends js.Object {
  def apply(jwk: JWKECKey): ECKey = js.native
  def apply(jwk: JWKOKPKey): OKPKey = js.native
  def apply(jwk: JWKOctKey): OctKey = js.native
  def apply(jwk: JWKRSAKey): RSAKey = js.native
  def apply(key: KeyInput): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyInput, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
  /*
    * @deprecated in favor of asKey
    */
  def apply(key: KeyObject): RSAKey | ECKey | OKPKey | OctKey = js.native
  def apply(key: KeyObject, parameters: KeyParameters): RSAKey | ECKey | OKPKey | OctKey = js.native
}

