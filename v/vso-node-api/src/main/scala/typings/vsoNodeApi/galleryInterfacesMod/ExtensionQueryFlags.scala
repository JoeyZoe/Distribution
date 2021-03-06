package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionQueryFlags")
@js.native
object ExtensionQueryFlags extends js.Object {
  /**
    * AllAttributes is designed to be a mask that defines all sub-elements of the extension should be returned.  NOTE: This is not actually All flags. This is now locked to the set defined since changing this enum would be a breaking change and would change the behavior of anyone using it. Try not to use this value when making calls to the service, instead be explicit about the options required.
    */
  @js.native
  sealed trait AllAttributes extends ExtensionQueryFlags
  
  /**
    * Excluding non-validated extensions will remove any extension versions that either are in the process of being validated or have failed validation.
    */
  @js.native
  sealed trait ExcludeNonValidated extends ExtensionQueryFlags
  
  /**
    * Include the base uri for assets of this extension
    */
  @js.native
  sealed trait IncludeAssetUri extends ExtensionQueryFlags
  
  /**
    * Include the Categories and Tags that were added to the extension definition.
    */
  @js.native
  sealed trait IncludeCategoryAndTags extends ExtensionQueryFlags
  
  /**
    * IncludeFiles will return information about which files were found within the extension that were stored independant of the manifest. When asking for files, versions will be included as well since files are returned as a property of the versions.  These files can be retrieved using the path to the file without requiring the entire manifest be downloaded.
    */
  @js.native
  sealed trait IncludeFiles extends ExtensionQueryFlags
  
  /**
    * Include the set of installation targets the extension has requested.
    */
  @js.native
  sealed trait IncludeInstallationTargets extends ExtensionQueryFlags
  
  /**
    * When retrieving versions from a query, only include the latest version of the extensions that matched. This is useful when the caller doesn't need all the published versions. It will save a significant size in the returned payload.
    */
  @js.native
  sealed trait IncludeLatestVersionOnly extends ExtensionQueryFlags
  
  /**
    * This flag is used to get Lcid values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal
    */
  @js.native
  sealed trait IncludeLcids extends ExtensionQueryFlags
  
  /**
    * This flag is used to get all the metadata values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal.
    */
  @js.native
  sealed trait IncludeMetadata extends ExtensionQueryFlags
  
  /**
    * This flag is used to indicate to return very small data for extension reruired by VS IDE. This flag is only compatible when querying is done by VS IDE
    */
  @js.native
  sealed trait IncludeMinimalPayloadForVsIde extends ExtensionQueryFlags
  
  /**
    * Include the details about which accounts the extension has been shared with if the extesion is a private extension.
    */
  @js.native
  sealed trait IncludeSharedAccounts extends ExtensionQueryFlags
  
  /**
    * Include the statistics associated with this extension
    */
  @js.native
  sealed trait IncludeStatistics extends ExtensionQueryFlags
  
  /**
    * Include properties associated with versions of the extension
    */
  @js.native
  sealed trait IncludeVersionProperties extends ExtensionQueryFlags
  
  /**
    * IncludeVersions will return version information for extensions returned
    */
  @js.native
  sealed trait IncludeVersions extends ExtensionQueryFlags
  
  /**
    * None is used to retrieve only the basic extension details.
    */
  @js.native
  sealed trait None extends ExtensionQueryFlags
  
  /**
    * This flag switches the asset uri to use GetAssetByName instead of CDN When this is used, values of base asset uri and base asset uri fallback are switched When this is used, source of asset files are pointed to Gallery service always even if CDN is available
    */
  @js.native
  sealed trait UseFallbackAssetUri extends ExtensionQueryFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionQueryFlags with Double] = js.native
  /* 479 */ @js.native
  object AllAttributes extends TopLevel[AllAttributes with Double]
  
  /* 32 */ @js.native
  object ExcludeNonValidated extends TopLevel[ExcludeNonValidated with Double]
  
  /* 128 */ @js.native
  object IncludeAssetUri extends TopLevel[IncludeAssetUri with Double]
  
  /* 4 */ @js.native
  object IncludeCategoryAndTags extends TopLevel[IncludeCategoryAndTags with Double]
  
  /* 2 */ @js.native
  object IncludeFiles extends TopLevel[IncludeFiles with Double]
  
  /* 64 */ @js.native
  object IncludeInstallationTargets extends TopLevel[IncludeInstallationTargets with Double]
  
  /* 512 */ @js.native
  object IncludeLatestVersionOnly extends TopLevel[IncludeLatestVersionOnly with Double]
  
  /* 8192 */ @js.native
  object IncludeLcids extends TopLevel[IncludeLcids with Double]
  
  /* 2048 */ @js.native
  object IncludeMetadata extends TopLevel[IncludeMetadata with Double]
  
  /* 4096 */ @js.native
  object IncludeMinimalPayloadForVsIde extends TopLevel[IncludeMinimalPayloadForVsIde with Double]
  
  /* 8 */ @js.native
  object IncludeSharedAccounts extends TopLevel[IncludeSharedAccounts with Double]
  
  /* 256 */ @js.native
  object IncludeStatistics extends TopLevel[IncludeStatistics with Double]
  
  /* 16 */ @js.native
  object IncludeVersionProperties extends TopLevel[IncludeVersionProperties with Double]
  
  /* 1 */ @js.native
  object IncludeVersions extends TopLevel[IncludeVersions with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1024 */ @js.native
  object UseFallbackAssetUri extends TopLevel[UseFallbackAssetUri with Double]
  
}

