package typings.graphqlExtensions

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.GraphQLSchemaConfigtypesA
import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchemaConfig
import typings.graphql.schemaMod.TypeMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLSchema & {  _extensionsEnabled ? :boolean | undefined} */
trait GraphQLSchemaextensionsEnAstNode extends js.Object {
  var _extensionsEnabled: js.UndefOr[Boolean] = js.undefined
  var astNode: Maybe[SchemaDefinitionNode]
  var extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  def getDirective(name: String): Maybe[GraphQLDirective]
  def getDirectives(): js.Array[GraphQLDirective]
  def getMutationType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getQueryType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getSubscriptionType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getType(name: String): Maybe[GraphQLNamedType]
  def getTypeMap(): TypeMap
  def isPossibleType(abstractType: GraphQLAbstractType, possibleType: GraphQLObjectType[_, _, StringDictionary[_]]): Boolean
  def toConfig(): GraphQLSchemaConfigtypesA
}

object GraphQLSchemaextensionsEnAstNode {
  @scala.inline
  def apply(
    getDirective: String => Maybe[GraphQLDirective],
    getDirectives: () => js.Array[GraphQLDirective],
    getMutationType: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]],
    getPossibleTypes: GraphQLAbstractType => js.Array[GraphQLObjectType[_, _, StringDictionary[_]]],
    getQueryType: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]],
    getSubscriptionType: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]],
    getType: String => Maybe[GraphQLNamedType],
    getTypeMap: () => TypeMap,
    isPossibleType: (GraphQLAbstractType, GraphQLObjectType[_, _, StringDictionary[_]]) => Boolean,
    toConfig: () => GraphQLSchemaConfigtypesA,
    _extensionsEnabled: js.UndefOr[Boolean] = js.undefined,
    astNode: Maybe[SchemaDefinitionNode] = null,
    extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLSchemaextensionsEnAstNode = {
    val __obj = js.Dynamic.literal(getDirective = js.Any.fromFunction1(getDirective), getDirectives = js.Any.fromFunction0(getDirectives), getMutationType = js.Any.fromFunction0(getMutationType), getPossibleTypes = js.Any.fromFunction1(getPossibleTypes), getQueryType = js.Any.fromFunction0(getQueryType), getSubscriptionType = js.Any.fromFunction0(getSubscriptionType), getType = js.Any.fromFunction1(getType), getTypeMap = js.Any.fromFunction0(getTypeMap), isPossibleType = js.Any.fromFunction2(isPossibleType), toConfig = js.Any.fromFunction0(toConfig))
    if (!js.isUndefined(_extensionsEnabled)) __obj.updateDynamic("_extensionsEnabled")(_extensionsEnabled.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaextensionsEnAstNode]
  }
}

