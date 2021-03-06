package typings.swaggerSchemaOfficial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseFormatContrainedParameter = typings.swaggerSchemaOfficial.mod.BaseParameter with typings.swaggerSchemaOfficial.mod.SchemaFormatConstraints
  type FormDataParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typings.swaggerSchemaOfficial.mod.BaseSchema with typings.swaggerSchemaOfficial.AnonCollectionFormat
  type HeaderParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typings.swaggerSchemaOfficial.mod.BaseSchema with typings.swaggerSchemaOfficial.Anon0
  type OAuthScope = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Parameter = typings.swaggerSchemaOfficial.mod.BodyParameter | typings.swaggerSchemaOfficial.mod.FormDataParameter | typings.swaggerSchemaOfficial.mod.QueryParameter | typings.swaggerSchemaOfficial.mod.PathParameter | typings.swaggerSchemaOfficial.mod.HeaderParameter
  type PathParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typings.swaggerSchemaOfficial.mod.BaseSchema with typings.swaggerSchemaOfficial.AnonIn
  type QueryParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter with typings.swaggerSchemaOfficial.mod.BaseSchema with typings.swaggerSchemaOfficial.AnonAllowEmptyValue
}
