package typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod

import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.CreateGrant
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Decrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DescribeKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Encrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKeyWithoutPlaintext
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptFrom
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptTo
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RetireGrant
import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGrantConstraintsMod.GrantConstraints
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGrantInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.undefined
  /**
    * <p>A list of grant tokens.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>The principal that is given permission to perform the operations that the grant permits.</p> <p>To specify the principal, use the <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, IAM roles, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and Access Management (IAM)</a> in the Example ARNs section of the <i>AWS General Reference</i>.</p>
    */
  var GranteePrincipal: String
  /**
    * <p>The unique identifier for the customer master key (CMK) that the grant applies to.</p> <p>Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: String
  /**
    * <p>A friendly name for identifying the grant. Use this value to prevent the unintended creation of duplicate grants when retrying this request.</p> <p>When this value is absent, all <code>CreateGrant</code> requests result in a new grant with a unique <code>GrantId</code> even if all the supplied parameters are identical. This can result in unintended duplicates when you retry the <code>CreateGrant</code> request.</p> <p>When this value is present, you can retry a <code>CreateGrant</code> request with identical parameters; if the grant already exists, the original <code>GrantId</code> is returned without creating a new grant. Note that the returned grant token is unique with every <code>CreateGrant</code> request, even when a duplicate <code>GrantId</code> is returned. All grant tokens obtained in this way can be used interchangeably.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of operations that the grant permits.</p>
    */
  var Operations: (js.Array[
    Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
  ]) | (Iterable[
    Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
  ])
  /**
    * <p>The principal that is given permission to retire the grant by using <a>RetireGrant</a> operation.</p> <p>To specify the principal, use the <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and Access Management (IAM)</a> in the Example ARNs section of the <i>AWS General Reference</i>.</p>
    */
  var RetiringPrincipal: js.UndefOr[String] = js.undefined
}

object CreateGrantInput {
  @scala.inline
  def apply(
    GranteePrincipal: String,
    KeyId: String,
    Operations: (js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]) | (Iterable[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]),
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    Constraints: GrantConstraints = null,
    GrantTokens: js.Array[String] | Iterable[String] = null,
    Name: String = null,
    RetiringPrincipal: String = null
  ): CreateGrantInput = {
    val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (Constraints != null) __obj.updateDynamic("Constraints")(Constraints.asInstanceOf[js.Any])
    if (GrantTokens != null) __obj.updateDynamic("GrantTokens")(GrantTokens.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RetiringPrincipal != null) __obj.updateDynamic("RetiringPrincipal")(RetiringPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrantInput]
  }
}

