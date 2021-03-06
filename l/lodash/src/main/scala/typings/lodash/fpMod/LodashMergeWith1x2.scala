package typings.lodash.fpMod

import typings.lodash.mod.MergeWithCustomizer
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMergeWith1x2[TObject] extends js.Object {
  def apply(customizer: MergeWithCustomizer): LodashMergeWith1x3[TObject] = js.native
  def apply[TSource](customizer: MergeWithCustomizer, source: TSource): TObject with TSource = js.native
  def apply[TSource](customizer: __, source: TSource): LodashMergeWith1x6[TObject, TSource] = js.native
}

