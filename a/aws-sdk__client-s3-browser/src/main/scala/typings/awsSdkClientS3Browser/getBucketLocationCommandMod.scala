package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput
import typings.awsSdkClientS3Browser.typesGetBucketLocationOutputMod.GetBucketLocationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLocationCommand", JSImport.Namespace)
@js.native
object getBucketLocationCommandMod extends js.Object {
  @js.native
  class GetBucketLocationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLocationInput, 
          OutputTypesUnion, 
          GetBucketLocationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketLocationInput) = this()
    /* CompleteClass */
    override val input: GetBucketLocationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketLocationInput, GetBucketLocationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
  }
  
}

