package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClientDrive.AnonAperture
import typings.gapiClientDrive.AnonCanAddChildren
import typings.gapiClientDrive.AnonDurationMillis
import typings.gapiClientDrive.AnonIndexableText
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    * A collection of arbitrary key-value pairs which are private to the requesting app.
    * Entries with null values are cleared in update and copy requests.
    */
  var appProperties: js.UndefOr[Record[String, String]] = js.undefined
  /** Capabilities the current user has on this file. Each capability corresponds to a fine-grained action that a user may take. */
  var capabilities: js.UndefOr[AnonCanAddChildren] = js.undefined
  /** Additional information about the content of the file. These fields are never populated in responses. */
  var contentHints: js.UndefOr[AnonIndexableText] = js.undefined
  /** The time at which the file was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.undefined
  /** A short description of the file. */
  var description: js.UndefOr[String] = js.undefined
  /** Whether the file has been explicitly trashed, as opposed to recursively trashed from a parent folder. */
  var explicitlyTrashed: js.UndefOr[Boolean] = js.undefined
  /** The final component of fullFileExtension. This is only available for files with binary content in Drive. */
  var fileExtension: js.UndefOr[String] = js.undefined
  /**
    * The color for a folder as an RGB hex string. The supported colors are published in the folderColorPalette field of the About resource.
    * If an unsupported color is specified, the closest color in the palette will be used instead.
    */
  var folderColorRgb: js.UndefOr[String] = js.undefined
  /**
    * The full file extension extracted from the name field. May contain multiple concatenated extensions, such as "tar.gz". This is only available for files
    * with binary content in Drive.
    * This is automatically updated when the name field changes, however it is not cleared if the new name does not contain a valid extension.
    */
  var fullFileExtension: js.UndefOr[String] = js.undefined
  /** Whether any users are granted file access directly on this file. This field is only populated for Team Drive files. */
  var hasAugmentedPermissions: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this file has a thumbnail. This does not indicate whether the requesting app has access to the thumbnail. To check access, look for the
    * presence of the thumbnailLink field.
    */
  var hasThumbnail: js.UndefOr[Boolean] = js.undefined
  /** The ID of the file's head revision. This is currently only available for files with binary content in Drive. */
  var headRevisionId: js.UndefOr[String] = js.undefined
  /** A static, unauthenticated link to the file's icon. */
  var iconLink: js.UndefOr[String] = js.undefined
  /** The ID of the file. */
  var id: js.UndefOr[String] = js.undefined
  /** Additional metadata about image media, if available. */
  var imageMediaMetadata: js.UndefOr[AnonAperture] = js.undefined
  /** Whether the file was created or opened by the requesting app. */
  var isAppAuthorized: js.UndefOr[Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "drive#file". */
  var kind: js.UndefOr[String] = js.undefined
  /** The last user to modify the file. */
  var lastModifyingUser: js.UndefOr[User] = js.undefined
  /** The MD5 checksum for the content of the file. This is only applicable to files with binary content in Drive. */
  var md5Checksum: js.UndefOr[String] = js.undefined
  /**
    * The MIME type of the file.
    * Drive will attempt to automatically detect an appropriate value from uploaded content if no value is provided. The value cannot be changed unless a new
    * revision is uploaded.
    * If a file is created with a Google Doc MIME type, the uploaded content will be imported if possible. The supported import formats are published in the
    * About resource.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /** Whether the file has been modified by this user. */
  var modifiedByMe: js.UndefOr[Boolean] = js.undefined
  /** The last time the file was modified by the user (RFC 3339 date-time). */
  var modifiedByMeTime: js.UndefOr[String] = js.undefined
  /**
    * The last time the file was modified by anyone (RFC 3339 date-time).
    * Note that setting modifiedTime will also update modifiedByMeTime for the user.
    */
  var modifiedTime: js.UndefOr[String] = js.undefined
  /**
    * The name of the file. This is not necessarily unique within a folder. Note that for immutable items such as the top level folders of Team Drives, My
    * Drive root folder, and Application Data folder the name is constant.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The original filename of the uploaded content if available, or else the original value of the name field. This is only available for files with binary
    * content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.undefined
  /** Whether the user owns the file. Not populated for Team Drive files. */
  var ownedByMe: js.UndefOr[Boolean] = js.undefined
  /** The owners of the file. Currently, only certain legacy files may have more than one owner. Not populated for Team Drive files. */
  var owners: js.UndefOr[js.Array[User]] = js.undefined
  /**
    * The IDs of the parent folders which contain the file.
    * If not specified as part of a create request, the file will be placed directly in the user's My Drive folder. If not specified as part of a copy
    * request, the file will inherit any discoverable parents of the source file. Update requests must use the addParents and removeParents parameters to
    * modify the parents list.
    */
  var parents: js.UndefOr[js.Array[String]] = js.undefined
  /** List of permission IDs for users with access to this file. */
  var permissionIds: js.UndefOr[js.Array[String]] = js.undefined
  /** The full list of permissions for the file. This is only available if the requesting user can share the file. Not populated for Team Drive files. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
  /**
    * A collection of arbitrary key-value pairs which are visible to all apps.
    * Entries with null values are cleared in update and copy requests.
    */
  var properties: js.UndefOr[Record[String, String]] = js.undefined
  /** The number of storage quota bytes used by the file. This includes the head revision as well as previous revisions with keepForever enabled. */
  var quotaBytesUsed: js.UndefOr[String] = js.undefined
  /** Whether the file has been shared. Not populated for Team Drive files. */
  var shared: js.UndefOr[Boolean] = js.undefined
  /** The time at which the file was shared with the user, if applicable (RFC 3339 date-time). */
  var sharedWithMeTime: js.UndefOr[String] = js.undefined
  /** The user who shared the file with the requesting user, if applicable. */
  var sharingUser: js.UndefOr[User] = js.undefined
  /** The size of the file's content in bytes. This is only applicable to files with binary content in Drive. */
  var size: js.UndefOr[String] = js.undefined
  /** The list of spaces which contain the file. The currently supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether the user has starred the file. */
  var starred: js.UndefOr[Boolean] = js.undefined
  /** ID of the Team Drive the file resides in. */
  var teamDriveId: js.UndefOr[String] = js.undefined
  /**
    * A short-lived link to the file's thumbnail, if available. Typically lasts on the order of hours. Only populated when the requesting app can access the
    * file's content.
    */
  var thumbnailLink: js.UndefOr[String] = js.undefined
  /** The thumbnail version for use in thumbnail cache invalidation. */
  var thumbnailVersion: js.UndefOr[String] = js.undefined
  /**
    * Whether the file has been trashed, either explicitly or from a trashed parent folder. Only the owner may trash a file, and other users cannot see files
    * in the owner's trash.
    */
  var trashed: js.UndefOr[Boolean] = js.undefined
  /** The time that the item was trashed (RFC 3339 date-time). Only populated for Team Drive files. */
  var trashedTime: js.UndefOr[String] = js.undefined
  /** If the file has been explicitly trashed, the user who trashed it. Only populated for Team Drive files. */
  var trashingUser: js.UndefOr[User] = js.undefined
  /** A monotonically increasing version number for the file. This reflects every change made to the file on the server, even those not visible to the user. */
  var version: js.UndefOr[String] = js.undefined
  /** Additional metadata about video media. This may not be available immediately upon upload. */
  var videoMediaMetadata: js.UndefOr[AnonDurationMillis] = js.undefined
  /** Whether the file has been viewed by this user. */
  var viewedByMe: js.UndefOr[Boolean] = js.undefined
  /** The last time the file was viewed by the user (RFC 3339 date-time). */
  var viewedByMeTime: js.UndefOr[String] = js.undefined
  /** Whether users with only reader or commenter permission can copy the file's content. This affects copy, download, and print operations. */
  var viewersCanCopyContent: js.UndefOr[Boolean] = js.undefined
  /** A link for downloading the content of the file in a browser. This is only available for files with binary content in Drive. */
  var webContentLink: js.UndefOr[String] = js.undefined
  /** A link for opening the file in a relevant Google editor or viewer in a browser. */
  var webViewLink: js.UndefOr[String] = js.undefined
  /** Whether users with only writer permission can modify the file's permissions. Not populated for Team Drive files. */
  var writersCanShare: js.UndefOr[Boolean] = js.undefined
}

object File {
  @scala.inline
  def apply(
    appProperties: Record[String, String] = null,
    capabilities: AnonCanAddChildren = null,
    contentHints: AnonIndexableText = null,
    createdTime: String = null,
    description: String = null,
    explicitlyTrashed: js.UndefOr[Boolean] = js.undefined,
    fileExtension: String = null,
    folderColorRgb: String = null,
    fullFileExtension: String = null,
    hasAugmentedPermissions: js.UndefOr[Boolean] = js.undefined,
    hasThumbnail: js.UndefOr[Boolean] = js.undefined,
    headRevisionId: String = null,
    iconLink: String = null,
    id: String = null,
    imageMediaMetadata: AnonAperture = null,
    isAppAuthorized: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lastModifyingUser: User = null,
    md5Checksum: String = null,
    mimeType: String = null,
    modifiedByMe: js.UndefOr[Boolean] = js.undefined,
    modifiedByMeTime: String = null,
    modifiedTime: String = null,
    name: String = null,
    originalFilename: String = null,
    ownedByMe: js.UndefOr[Boolean] = js.undefined,
    owners: js.Array[User] = null,
    parents: js.Array[String] = null,
    permissionIds: js.Array[String] = null,
    permissions: js.Array[Permission] = null,
    properties: Record[String, String] = null,
    quotaBytesUsed: String = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    sharedWithMeTime: String = null,
    sharingUser: User = null,
    size: String = null,
    spaces: js.Array[String] = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    teamDriveId: String = null,
    thumbnailLink: String = null,
    thumbnailVersion: String = null,
    trashed: js.UndefOr[Boolean] = js.undefined,
    trashedTime: String = null,
    trashingUser: User = null,
    version: String = null,
    videoMediaMetadata: AnonDurationMillis = null,
    viewedByMe: js.UndefOr[Boolean] = js.undefined,
    viewedByMeTime: String = null,
    viewersCanCopyContent: js.UndefOr[Boolean] = js.undefined,
    webContentLink: String = null,
    webViewLink: String = null,
    writersCanShare: js.UndefOr[Boolean] = js.undefined
  ): File = {
    val __obj = js.Dynamic.literal()
    if (appProperties != null) __obj.updateDynamic("appProperties")(appProperties.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (contentHints != null) __obj.updateDynamic("contentHints")(contentHints.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitlyTrashed)) __obj.updateDynamic("explicitlyTrashed")(explicitlyTrashed.asInstanceOf[js.Any])
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (folderColorRgb != null) __obj.updateDynamic("folderColorRgb")(folderColorRgb.asInstanceOf[js.Any])
    if (fullFileExtension != null) __obj.updateDynamic("fullFileExtension")(fullFileExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAugmentedPermissions)) __obj.updateDynamic("hasAugmentedPermissions")(hasAugmentedPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(hasThumbnail)) __obj.updateDynamic("hasThumbnail")(hasThumbnail.asInstanceOf[js.Any])
    if (headRevisionId != null) __obj.updateDynamic("headRevisionId")(headRevisionId.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageMediaMetadata != null) __obj.updateDynamic("imageMediaMetadata")(imageMediaMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(isAppAuthorized)) __obj.updateDynamic("isAppAuthorized")(isAppAuthorized.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser.asInstanceOf[js.Any])
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(modifiedByMe)) __obj.updateDynamic("modifiedByMe")(modifiedByMe.asInstanceOf[js.Any])
    if (modifiedByMeTime != null) __obj.updateDynamic("modifiedByMeTime")(modifiedByMeTime.asInstanceOf[js.Any])
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(ownedByMe)) __obj.updateDynamic("ownedByMe")(ownedByMe.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (parents != null) __obj.updateDynamic("parents")(parents.asInstanceOf[js.Any])
    if (permissionIds != null) __obj.updateDynamic("permissionIds")(permissionIds.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (quotaBytesUsed != null) __obj.updateDynamic("quotaBytesUsed")(quotaBytesUsed.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (sharedWithMeTime != null) __obj.updateDynamic("sharedWithMeTime")(sharedWithMeTime.asInstanceOf[js.Any])
    if (sharingUser != null) __obj.updateDynamic("sharingUser")(sharingUser.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (teamDriveId != null) __obj.updateDynamic("teamDriveId")(teamDriveId.asInstanceOf[js.Any])
    if (thumbnailLink != null) __obj.updateDynamic("thumbnailLink")(thumbnailLink.asInstanceOf[js.Any])
    if (thumbnailVersion != null) __obj.updateDynamic("thumbnailVersion")(thumbnailVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(trashed)) __obj.updateDynamic("trashed")(trashed.asInstanceOf[js.Any])
    if (trashedTime != null) __obj.updateDynamic("trashedTime")(trashedTime.asInstanceOf[js.Any])
    if (trashingUser != null) __obj.updateDynamic("trashingUser")(trashingUser.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (videoMediaMetadata != null) __obj.updateDynamic("videoMediaMetadata")(videoMediaMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(viewedByMe)) __obj.updateDynamic("viewedByMe")(viewedByMe.asInstanceOf[js.Any])
    if (viewedByMeTime != null) __obj.updateDynamic("viewedByMeTime")(viewedByMeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(viewersCanCopyContent)) __obj.updateDynamic("viewersCanCopyContent")(viewersCanCopyContent.asInstanceOf[js.Any])
    if (webContentLink != null) __obj.updateDynamic("webContentLink")(webContentLink.asInstanceOf[js.Any])
    if (webViewLink != null) __obj.updateDynamic("webViewLink")(webViewLink.asInstanceOf[js.Any])
    if (!js.isUndefined(writersCanShare)) __obj.updateDynamic("writersCanShare")(writersCanShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

