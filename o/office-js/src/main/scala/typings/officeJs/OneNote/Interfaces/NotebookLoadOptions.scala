package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a OneNote notebook. Notebooks contain section groups and sections.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait NotebookLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The url of the site that this notebook is located. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var baseUrl: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The client url of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the ID of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isVirtual: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the name of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The section groups in the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.undefined
  /**
    *
    * The the sections of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.undefined
}

object NotebookLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    baseUrl: js.UndefOr[Boolean] = js.undefined,
    clientUrl: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    isVirtual: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    sectionGroups: SectionGroupCollectionLoadOptions = null,
    sections: SectionCollectionLoadOptions = null
  ): NotebookLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(baseUrl)) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(clientUrl)) __obj.updateDynamic("clientUrl")(clientUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isVirtual)) __obj.updateDynamic("isVirtual")(isVirtual.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups.asInstanceOf[js.Any])
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookLoadOptions]
  }
}

