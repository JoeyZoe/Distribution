package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.makeClientMod.ServiceDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "makeGenericClientConstructor")
@js.native
object makeGenericClientConstructor extends js.Object {
  def apply(methods: ServiceDefinition, serviceName: String): ServiceClientConstructor = js.native
  def apply(methods: ServiceDefinition, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
}

