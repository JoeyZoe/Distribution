package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsComputed
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.init
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBuilder extends js.Object {
  def apply(kind: get, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: PatternKind): Property = js.native
  def from(params: AnonCommentsComputed): Property = js.native
}

