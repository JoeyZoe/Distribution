package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocTypeParameters
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTypeAnnotationBuilder extends js.Object {
  def apply(id: IdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def from(params: AnonCommentsIdLocTypeParameters): GenericTypeAnnotation = js.native
}

