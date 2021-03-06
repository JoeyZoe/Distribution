package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.array
import typings.typedoc.typedocStrings.indexedAccess
import typings.typedoc.typedocStrings.intrinsic
import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.predicate
import typings.typedoc.typedocStrings.reference
import typings.typedoc.typedocStrings.reflection
import typings.typedoc.typedocStrings.stringLiteral
import typings.typedoc.typedocStrings.tuple
import typings.typedoc.typedocStrings.typeOperator
import typings.typedoc.typedocStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.schemaMod.ArrayType
  - typings.typedoc.schemaMod.ConditionalType
  - typings.typedoc.schemaMod.IndexedAccessType
  - typings.typedoc.schemaMod.InferredType
  - typings.typedoc.schemaMod.IntersectionType
  - typings.typedoc.schemaMod.IntrinsicType
  - typings.typedoc.schemaMod.PredicateType
  - typings.typedoc.schemaMod.ReferenceType
  - typings.typedoc.schemaMod.ReflectionType
  - typings.typedoc.schemaMod.StringLiteralType
  - typings.typedoc.schemaMod.TupleType
  - typings.typedoc.schemaMod.TypeOperatorType
  - typings.typedoc.schemaMod.TypeParameterType
  - typings.typedoc.schemaMod.UnionType
  - typings.typedoc.schemaMod.UnknownType
*/
trait SomeType
  extends __ModelToObject[js.Any]

object SomeType {
  @scala.inline
  def InferredType(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ArrayType(
    elementType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: ModelToObject[array] | array
  ): SomeType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def TupleType(
    `type`: ModelToObject[tuple] | tuple,
    elements: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] = null
  ): SomeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def IntersectionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): SomeType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ReferenceType(
    name: ModelToObject[String] | String,
    `type`: ModelToObject[reference] | reference,
    id: Int | Double = null,
    typeArguments: ModelToObject[js.UndefOr[js.Array[typings.typedoc.typesAbstractMod.Type]]] | js.Array[typings.typedoc.typesAbstractMod.Type] = null
  ): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def UnionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): SomeType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def TypeOperatorType(
    operator: ModelToObject[keyof] | keyof,
    target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[typeOperator] | typeOperator
  ): SomeType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def StringLiteralType(`type`: ModelToObject[stringLiteral] | stringLiteral, value: ModelToObject[String] | String): SomeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def IntrinsicType(name: ModelToObject[String] | String, `type`: ModelToObject[intrinsic] | intrinsic): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ConditionalType(
    checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): SomeType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ReflectionType(
    `type`: ModelToObject[reflection] | reflection,
    declaration: ModelToObject[typings.typedoc.reflectionsDeclarationMod.DeclarationReflection] = null
  ): SomeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def IndexedAccessType(
    indexType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    objectType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: ModelToObject[indexedAccess] | indexedAccess
  ): SomeType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def TypeParameterType(
    name: ModelToObject[String] | String,
    `type`: ModelToObject[String] | String,
    constraint: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type = null
  ): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def UnknownType(name: ModelToObject[String] | String, `type`: ModelToObject[unknown] | unknown): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def PredicateType(
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: ModelToObject[predicate] | predicate,
    targetType: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type = null
  ): SomeType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
}

