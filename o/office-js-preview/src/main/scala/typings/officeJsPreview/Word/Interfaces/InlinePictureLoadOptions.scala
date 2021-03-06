package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an inline picture.
  *
  * [Api set: WordApi 1.1]
  */
trait InlinePictureLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a string that represents the alternative text associated with the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the format of the inline image. Read-only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var imageFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the parent paragraph that contains the inline image.
    *
    * [Api set: WordApi 1.2]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  /**
    *
    * Gets the content control that contains the inline image. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * Gets the content control that contains the inline image. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * Gets the table that contains the inline image. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * Gets the table cell that contains the inline image. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * Gets the table cell that contains the inline image. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * Gets the table that contains the inline image. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object InlinePictureLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    altTextDescription: js.UndefOr[Boolean] = js.undefined,
    altTextTitle: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Boolean] = js.undefined,
    hyperlink: js.UndefOr[Boolean] = js.undefined,
    imageFormat: js.UndefOr[Boolean] = js.undefined,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    paragraph: ParagraphLoadOptions = null,
    parentContentControl: ContentControlLoadOptions = null,
    parentContentControlOrNullObject: ContentControlLoadOptions = null,
    parentTable: TableLoadOptions = null,
    parentTableCell: TableCellLoadOptions = null,
    parentTableCellOrNullObject: TableCellLoadOptions = null,
    parentTableOrNullObject: TableLoadOptions = null,
    width: js.UndefOr[Boolean] = js.undefined
  ): InlinePictureLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(altTextDescription)) __obj.updateDynamic("altTextDescription")(altTextDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(altTextTitle)) __obj.updateDynamic("altTextTitle")(altTextTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hyperlink)) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(imageFormat)) __obj.updateDynamic("imageFormat")(imageFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl.asInstanceOf[js.Any])
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject.asInstanceOf[js.Any])
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable.asInstanceOf[js.Any])
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell.asInstanceOf[js.Any])
    if (parentTableCellOrNullObject != null) __obj.updateDynamic("parentTableCellOrNullObject")(parentTableCellOrNullObject.asInstanceOf[js.Any])
    if (parentTableOrNullObject != null) __obj.updateDynamic("parentTableOrNullObject")(parentTableOrNullObject.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinePictureLoadOptions]
  }
}

