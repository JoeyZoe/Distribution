package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codestarconnectionsMod {
  type AccountId = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codestarconnectionsMod.ClientApiVersions
  type ConnectionArn = java.lang.String
  type ConnectionList = js.Array[typings.awsSdk.codestarconnectionsMod.Connection]
  type ConnectionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ConnectionStatus = typings.awsSdk.codestarconnectionsMod._ConnectionStatus | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type ProviderType = typings.awsSdk.awsSdkStrings.Bitbucket_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codestarconnectionsMod._apiVersion | java.lang.String
}
