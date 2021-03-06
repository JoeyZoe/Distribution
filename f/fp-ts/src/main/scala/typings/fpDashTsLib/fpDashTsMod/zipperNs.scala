package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "zipper")
@js.native
object zipperNs extends js.Object {
  @js.native
  class Zipper[A] protected ()
    extends fpDashTsLib.libZipperMod.Zipper[A] {
    def this(lefts: fpDashTsLib.libArrayMod.Global.Array[A], focus: A, rights: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Zipper = js.native
  val zipper: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.libZipperMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libZipperMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libZipperMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libZipperMod.URI] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libZipperMod.Zipper[A]] = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A], focusIndex: scala.Double): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libZipperMod.Zipper[A]] = js.native
  def fromNonEmptyArray[A](nea: fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]): fpDashTsLib.libZipperMod.Zipper[A] = js.native
  def fromNonEmptyArray2v[A](nea: fpDashTsLib.libNonEmptyArray2vMod.NonEmptyArray[A]): fpDashTsLib.libZipperMod.Zipper[A] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libZipperMod.Zipper[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libZipperMod.Zipper[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libZipperMod.Zipper[A]] = js.native
}

