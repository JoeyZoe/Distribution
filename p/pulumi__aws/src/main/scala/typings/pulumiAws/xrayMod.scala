package typings.pulumiAws

import typings.pulumiAws.samplingRuleMod.SamplingRuleArgs
import typings.pulumiAws.samplingRuleMod.SamplingRuleState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/xray", JSImport.Namespace)
@js.native
object xrayMod extends js.Object {
  @js.native
  class SamplingRule protected ()
    extends typings.pulumiAws.samplingRuleMod.SamplingRule {
    /**
      * Create a SamplingRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SamplingRuleArgs) = this()
    def this(name: String, args: SamplingRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object SamplingRule extends js.Object {
    /**
      * Get an existing SamplingRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.samplingRuleMod.SamplingRule = js.native
    def get(name: String, id: Input[ID], state: SamplingRuleState): typings.pulumiAws.samplingRuleMod.SamplingRule = js.native
    def get(name: String, id: Input[ID], state: SamplingRuleState, opts: CustomResourceOptions): typings.pulumiAws.samplingRuleMod.SamplingRule = js.native
    /**
      * Returns true if the given object is an instance of SamplingRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/samplingRule.SamplingRule */ Boolean = js.native
  }
  
}

