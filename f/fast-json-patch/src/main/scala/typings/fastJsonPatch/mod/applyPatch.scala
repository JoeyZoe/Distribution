package typings.fastJsonPatch.mod

import typings.fastJsonPatch.moduleCoreMod.Operation
import typings.fastJsonPatch.moduleCoreMod.PatchResult
import typings.fastJsonPatch.moduleCoreMod.Validator_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "applyPatch")
@js.native
object applyPatch extends js.Object {
  def apply[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = js.native
  def apply[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T]): PatchResult[T] = js.native
  def apply[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T], mutateDocument: Boolean): PatchResult[T] = js.native
  def apply[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
}

