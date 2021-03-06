package typings.awsSdkClientCodecommitNode.typesDeleteFileInputMod

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileInput extends InputTypesUnion {
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
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The name of the branch where the commit will be made deleting the file.</p>
    */
  var branchName: String
  /**
    * <p>The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no message is specified, a default message will be used.</p>
    */
  var commitMessage: js.UndefOr[String] = js.undefined
  /**
    * <p>The email address for the commit that deletes the file. If no email address is specified, the email address will be left blank.</p>
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * <p>The fully-qualified path to the file that will be deleted, including the full name and extension of that file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.</p>
    */
  var filePath: String
  /**
    * <p>Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.</p>
    */
  var keepEmptyFolders: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used as the author name and committer name.</p>
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit ID.</p>
    */
  var parentCommitId: String
  /**
    * <p>The name of the repository that contains the file to delete.</p>
    */
  var repositoryName: String
}

object DeleteFileInput {
  @scala.inline
  def apply(
    branchName: String,
    filePath: String,
    parentCommitId: String,
    repositoryName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    commitMessage: String = null,
    email: String = null,
    keepEmptyFolders: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): DeleteFileInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], parentCommitId = parentCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(keepEmptyFolders)) __obj.updateDynamic("keepEmptyFolders")(keepEmptyFolders.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileInput]
  }
}

