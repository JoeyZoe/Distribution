package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the styles.
  *
  * [Api set: ExcelApi 1.7]
  */
trait StyleCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if text is automatically indented when the text alignment in a cell is set to equal distribution.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A Border collection of four Border objects that represent the style of the four borders.
    *
    * [Api set: ExcelApi 1.7]
    */
  var borders: js.UndefOr[RangeBorderCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the style is a built-in style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var builtIn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var fill: js.UndefOr[RangeFillLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[RangeFontLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the formula will be hidden when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the style includes the FormulaHidden and Locked protection properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeProtection: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: An integer from 0 to 250 that indicates the indent level for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var indentLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The name of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.7]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The text orientation for the style.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates if Microsoft Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object StyleCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    borders: RangeBorderCollectionLoadOptions = null,
    builtIn: js.UndefOr[Boolean] = js.undefined,
    fill: RangeFillLoadOptions = null,
    font: RangeFontLoadOptions = null,
    formulaHidden: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    includeAlignment: js.UndefOr[Boolean] = js.undefined,
    includeBorder: js.UndefOr[Boolean] = js.undefined,
    includeFont: js.UndefOr[Boolean] = js.undefined,
    includeNumber: js.UndefOr[Boolean] = js.undefined,
    includePatterns: js.UndefOr[Boolean] = js.undefined,
    includeProtection: js.UndefOr[Boolean] = js.undefined,
    indentLevel: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormatLocal: js.UndefOr[Boolean] = js.undefined,
    readingOrder: js.UndefOr[Boolean] = js.undefined,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): StyleCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (!js.isUndefined(builtIn)) __obj.updateDynamic("builtIn")(builtIn.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAlignment)) __obj.updateDynamic("includeAlignment")(includeAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBorder)) __obj.updateDynamic("includeBorder")(includeBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFont)) __obj.updateDynamic("includeFont")(includeFont.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNumber)) __obj.updateDynamic("includeNumber")(includeNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(includePatterns)) __obj.updateDynamic("includePatterns")(includePatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(includeProtection)) __obj.updateDynamic("includeProtection")(includeProtection.asInstanceOf[js.Any])
    if (!js.isUndefined(indentLevel)) __obj.updateDynamic("indentLevel")(indentLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(numberFormatLocal)) __obj.updateDynamic("numberFormatLocal")(numberFormatLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(readingOrder)) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit.asInstanceOf[js.Any])
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCollectionLoadOptions]
  }
}

