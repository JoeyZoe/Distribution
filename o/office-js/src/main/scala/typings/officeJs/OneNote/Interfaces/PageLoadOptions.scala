package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a OneNote page.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait PageLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the ClassNotebookPageSource to the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var classNotebookPageSource: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The client url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The collection of PageContent objects on the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contents: js.UndefOr[PageContentCollectionLoadOptions] = js.undefined
  /**
    *
    * Gets the ID of the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the section that contains the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.undefined
}

object PageLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    classNotebookPageSource: js.UndefOr[Boolean] = js.undefined,
    clientUrl: js.UndefOr[Boolean] = js.undefined,
    contents: PageContentCollectionLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined,
    inkAnalysisOrNull: InkAnalysisLoadOptions = null,
    pageLevel: js.UndefOr[Boolean] = js.undefined,
    parentSection: SectionLoadOptions = null,
    title: js.UndefOr[Boolean] = js.undefined,
    webUrl: js.UndefOr[Boolean] = js.undefined
  ): PageLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(classNotebookPageSource)) __obj.updateDynamic("classNotebookPageSource")(classNotebookPageSource.asInstanceOf[js.Any])
    if (!js.isUndefined(clientUrl)) __obj.updateDynamic("clientUrl")(clientUrl.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inkAnalysisOrNull != null) __obj.updateDynamic("inkAnalysisOrNull")(inkAnalysisOrNull.asInstanceOf[js.Any])
    if (!js.isUndefined(pageLevel)) __obj.updateDynamic("pageLevel")(pageLevel.asInstanceOf[js.Any])
    if (parentSection != null) __obj.updateDynamic("parentSection")(parentSection.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(webUrl)) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLoadOptions]
  }
}

