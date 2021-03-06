package typings.apolloServerCore

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCacheControl.mod.CacheControlExtensionOptions
import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typings.apolloServerCaching.mod.InMemoryLRUCache
import typings.apolloServerCore.graphqlOptionsMod.DataSources
import typings.apolloServerCore.graphqlOptionsMod.PersistedQueryOptions
import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLExecutor
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.GraphQLResponse
import typings.apolloServerTypes.mod.Logger
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.ValidationContext
import typings.graphqlExtensions.mod.GraphQLExtension
import typings.graphqlTools.interfacesMod.GraphQLParseOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-server-core.apollo-server-core/dist/graphqlOptions.GraphQLServerOptions<any, any>> */
trait PartialGraphQLServerOptio extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.undefined
  var cacheControl: js.UndefOr[CacheControlExtensionOptions] = js.undefined
  var context: js.UndefOr[js.Any | js.Function0[scala.Nothing]] = js.undefined
  var dataSources: js.UndefOr[js.Function0[DataSources[_]]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var documentStore: js.UndefOr[InMemoryLRUCache[DocumentNode]] = js.undefined
  var executor: js.UndefOr[GraphQLExecutor[Record[String, _]]] = js.undefined
  var extensions: js.UndefOr[js.Array[js.Function0[GraphQLExtension[_]]]] = js.undefined
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]] = js.undefined
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var formatResponse: js.UndefOr[
    js.Function2[
      /* response */ GraphQLResponse | Null, 
      /* requestContext */ GraphQLRequestContext[_], 
      GraphQLResponse
    ]
  ] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var parseOptions: js.UndefOr[GraphQLParseOptions] = js.undefined
  var persistedQueries: js.UndefOr[PersistedQueryOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[ApolloServerPlugin[Record[String, _]]]] = js.undefined
  var reporting: js.UndefOr[Boolean] = js.undefined
  var rootValue: js.UndefOr[(js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  var tracing: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Function1[/* context */ ValidationContext, _]]] = js.undefined
}

object PartialGraphQLServerOptio {
  @scala.inline
  def apply(
    cache: KeyValueCache[String] = null,
    cacheControl: CacheControlExtensionOptions = null,
    context: js.Any | js.Function0[scala.Nothing] = null,
    dataSources: () => DataSources[_] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    documentStore: InMemoryLRUCache[DocumentNode] = null,
    executor: /* requestContext */ GraphQLRequestContextExecutionDidStart[Record[String, _]] => ValueOrPromise[GraphQLExecutionResult] = null,
    extensions: js.Array[js.Function0[GraphQLExtension[_]]] = null,
    fieldResolver: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any = null,
    formatError: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]] = null,
    formatResponse: (/* response */ GraphQLResponse | Null, /* requestContext */ GraphQLRequestContext[_]) => GraphQLResponse = null,
    logger: Logger = null,
    parseOptions: GraphQLParseOptions = null,
    persistedQueries: PersistedQueryOptions = null,
    plugins: js.Array[ApolloServerPlugin[Record[String, _]]] = null,
    reporting: js.UndefOr[Boolean] = js.undefined,
    rootValue: (js.Function1[/* parsedQuery */ DocumentNode, _]) | js.Any = null,
    schema: GraphQLSchema = null,
    tracing: js.UndefOr[Boolean] = js.undefined,
    validationRules: js.Array[js.Function1[/* context */ ValidationContext, _]] = null
  ): PartialGraphQLServerOptio = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataSources != null) __obj.updateDynamic("dataSources")(js.Any.fromFunction0(dataSources))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (documentStore != null) __obj.updateDynamic("documentStore")(documentStore.asInstanceOf[js.Any])
    if (executor != null) __obj.updateDynamic("executor")(js.Any.fromFunction1(executor))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4(fieldResolver))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(js.Any.fromFunction2(formatResponse))
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (parseOptions != null) __obj.updateDynamic("parseOptions")(parseOptions.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(reporting)) __obj.updateDynamic("reporting")(reporting.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(tracing)) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGraphQLServerOptio]
  }
}

