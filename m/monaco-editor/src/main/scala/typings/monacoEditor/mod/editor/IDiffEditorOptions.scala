package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.`block-outline`
import typings.monacoEditor.monacoEditorStrings.`inline`
import typings.monacoEditor.monacoEditorStrings.`line-thin`
import typings.monacoEditor.monacoEditorStrings.`underline-thin`
import typings.monacoEditor.monacoEditorStrings.advanced
import typings.monacoEditor.monacoEditorStrings.all
import typings.monacoEditor.monacoEditorStrings.alt
import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.blink
import typings.monacoEditor.monacoEditorStrings.block
import typings.monacoEditor.monacoEditorStrings.bottom
import typings.monacoEditor.monacoEditorStrings.boundary
import typings.monacoEditor.monacoEditorStrings.bounded
import typings.monacoEditor.monacoEditorStrings.brackets
import typings.monacoEditor.monacoEditorStrings.copy
import typings.monacoEditor.monacoEditorStrings.ctrlCmd
import typings.monacoEditor.monacoEditorStrings.deepIndent
import typings.monacoEditor.monacoEditorStrings.default
import typings.monacoEditor.monacoEditorStrings.editable
import typings.monacoEditor.monacoEditorStrings.expand
import typings.monacoEditor.monacoEditorStrings.first
import typings.monacoEditor.monacoEditorStrings.full
import typings.monacoEditor.monacoEditorStrings.gutter
import typings.monacoEditor.monacoEditorStrings.indent
import typings.monacoEditor.monacoEditorStrings.indentation
import typings.monacoEditor.monacoEditorStrings.keep
import typings.monacoEditor.monacoEditorStrings.line
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.near
import typings.monacoEditor.monacoEditorStrings.never
import typings.monacoEditor.monacoEditorStrings.none
import typings.monacoEditor.monacoEditorStrings.off
import typings.monacoEditor.monacoEditorStrings.on
import typings.monacoEditor.monacoEditorStrings.onlySnippets
import typings.monacoEditor.monacoEditorStrings.phase
import typings.monacoEditor.monacoEditorStrings.recentlyUsed
import typings.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typings.monacoEditor.monacoEditorStrings.same
import typings.monacoEditor.monacoEditorStrings.selection
import typings.monacoEditor.monacoEditorStrings.simple
import typings.monacoEditor.monacoEditorStrings.smart
import typings.monacoEditor.monacoEditorStrings.smooth
import typings.monacoEditor.monacoEditorStrings.solid
import typings.monacoEditor.monacoEditorStrings.spread
import typings.monacoEditor.monacoEditorStrings.text
import typings.monacoEditor.monacoEditorStrings.top
import typings.monacoEditor.monacoEditorStrings.tree
import typings.monacoEditor.monacoEditorStrings.underline
import typings.monacoEditor.monacoEditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffEditorOptions extends IEditorOptions {
  /**
    * Allow the user to resize the diff editor split view.
    * Defaults to true.
    */
  var enableSplitViewResizing: js.UndefOr[Boolean] = js.undefined
  /**
    * Compute the diff by ignoring leading/trailing whitespace
    * Defaults to true.
    */
  var ignoreTrimWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * Timeout in milliseconds after which diff computation is cancelled.
    * Defaults to 5000.
    */
  var maxComputationTime: js.UndefOr[Double] = js.undefined
  /**
    * Original model should be editable?
    * Defaults to false.
    */
  var originalEditable: js.UndefOr[Boolean] = js.undefined
  /**
    * Render +/- indicators for added/deleted changes.
    * Defaults to true.
    */
  var renderIndicators: js.UndefOr[Boolean] = js.undefined
  /**
    * Render the differences in two side-by-side editors.
    * Defaults to true.
    */
  var renderSideBySide: js.UndefOr[Boolean] = js.undefined
}

object IDiffEditorOptions {
  @scala.inline
  def apply(
    acceptSuggestionOnCommitCharacter: js.UndefOr[Boolean] = js.undefined,
    acceptSuggestionOnEnter: on | smart | off = null,
    accessibilityPageSize: Int | Double = null,
    accessibilitySupport: auto | off | on = null,
    ariaLabel: String = null,
    autoClosingBrackets: EditorAutoClosingStrategy = null,
    autoClosingOvertype: EditorAutoClosingOvertypeStrategy = null,
    autoClosingQuotes: EditorAutoClosingStrategy = null,
    autoIndent: none | keep | brackets | advanced | full = null,
    autoSurround: EditorAutoSurroundStrategy = null,
    automaticLayout: js.UndefOr[Boolean] = js.undefined,
    codeActionsOnSaveTimeout: Int | Double = null,
    codeLens: js.UndefOr[Boolean] = js.undefined,
    colorDecorators: js.UndefOr[Boolean] = js.undefined,
    comments: IEditorCommentsOptions = null,
    contextmenu: js.UndefOr[Boolean] = js.undefined,
    copyWithSyntaxHighlighting: js.UndefOr[Boolean] = js.undefined,
    cursorBlinking: blink | smooth | phase | expand | solid = null,
    cursorSmoothCaretAnimation: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: line | block | underline | `line-thin` | `block-outline` | `underline-thin` = null,
    cursorSurroundingLines: Int | Double = null,
    cursorSurroundingLinesStyle: default | all = null,
    cursorWidth: Int | Double = null,
    disableLayerHinting: js.UndefOr[Boolean] = js.undefined,
    disableMonospaceOptimizations: js.UndefOr[Boolean] = js.undefined,
    dragAndDrop: js.UndefOr[Boolean] = js.undefined,
    emptySelectionClipboard: js.UndefOr[Boolean] = js.undefined,
    enableSplitViewResizing: js.UndefOr[Boolean] = js.undefined,
    extraEditorClassName: String = null,
    fastScrollSensitivity: Int | Double = null,
    find: IEditorFindOptions = null,
    fixedOverflowWidgets: js.UndefOr[Boolean] = js.undefined,
    folding: js.UndefOr[Boolean] = js.undefined,
    foldingHighlight: js.UndefOr[Boolean] = js.undefined,
    foldingStrategy: auto | indentation = null,
    fontFamily: String = null,
    fontLigatures: Boolean | String = null,
    fontSize: Int | Double = null,
    fontWeight: String = null,
    formatOnPaste: js.UndefOr[Boolean] = js.undefined,
    formatOnType: js.UndefOr[Boolean] = js.undefined,
    glyphMargin: js.UndefOr[Boolean] = js.undefined,
    gotoLocation: IGotoLocationOptions = null,
    hideCursorInOverviewRuler: js.UndefOr[Boolean] = js.undefined,
    highlightActiveIndentGuide: js.UndefOr[Boolean] = js.undefined,
    hover: IEditorHoverOptions = null,
    ignoreTrimWhitespace: js.UndefOr[Boolean] = js.undefined,
    inDiffEditor: js.UndefOr[Boolean] = js.undefined,
    letterSpacing: Int | Double = null,
    lightbulb: IEditorLightbulbOptions = null,
    lineDecorationsWidth: Double | String = null,
    lineHeight: Int | Double = null,
    lineNumbers: LineNumbersType = null,
    lineNumbersMinChars: Int | Double = null,
    links: js.UndefOr[Boolean] = js.undefined,
    matchBrackets: never | near | always = null,
    maxComputationTime: Int | Double = null,
    minimap: IEditorMinimapOptions = null,
    mouseStyle: text | default | copy = null,
    mouseWheelScrollSensitivity: Int | Double = null,
    mouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    multiCursorMergeOverlapping: js.UndefOr[Boolean] = js.undefined,
    multiCursorModifier: ctrlCmd | alt = null,
    multiCursorPaste: spread | full = null,
    occurrencesHighlight: js.UndefOr[Boolean] = js.undefined,
    originalEditable: js.UndefOr[Boolean] = js.undefined,
    overviewRulerBorder: js.UndefOr[Boolean] = js.undefined,
    overviewRulerLanes: Int | Double = null,
    parameterHints: IEditorParameterHintOptions = null,
    peekWidgetDefaultFocus: tree | typings.monacoEditor.monacoEditorStrings.editor = null,
    quickSuggestions: Boolean | IQuickSuggestionsOptions = null,
    quickSuggestionsDelay: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderControlCharacters: js.UndefOr[Boolean] = js.undefined,
    renderFinalNewline: js.UndefOr[Boolean] = js.undefined,
    renderIndentGuides: js.UndefOr[Boolean] = js.undefined,
    renderIndicators: js.UndefOr[Boolean] = js.undefined,
    renderLineHighlight: none | gutter | line | all = null,
    renderSideBySide: js.UndefOr[Boolean] = js.undefined,
    renderValidationDecorations: editable | on | off = null,
    renderWhitespace: none | boundary | selection | all = null,
    revealHorizontalRightPadding: Int | Double = null,
    roundedSelection: js.UndefOr[Boolean] = js.undefined,
    rulers: js.Array[Double] = null,
    scrollBeyondLastColumn: Int | Double = null,
    scrollBeyondLastLine: js.UndefOr[Boolean] = js.undefined,
    scrollbar: IEditorScrollbarOptions = null,
    selectOnLineNumbers: js.UndefOr[Boolean] = js.undefined,
    selectionClipboard: js.UndefOr[Boolean] = js.undefined,
    selectionHighlight: js.UndefOr[Boolean] = js.undefined,
    showFoldingControls: always | mouseover = null,
    showUnused: js.UndefOr[Boolean] = js.undefined,
    smoothScrolling: js.UndefOr[Boolean] = js.undefined,
    snippetSuggestions: top | bottom | `inline` | none = null,
    stopRenderingLineAfter: Int | Double = null,
    suggest: ISuggestOptions = null,
    suggestFontSize: Int | Double = null,
    suggestLineHeight: Int | Double = null,
    suggestOnTriggerCharacters: js.UndefOr[Boolean] = js.undefined,
    suggestSelection: first | recentlyUsed | recentlyUsedByPrefix = null,
    tabCompletion: on | off | onlySnippets = null,
    useTabStops: js.UndefOr[Boolean] = js.undefined,
    wordSeparators: String = null,
    wordWrap: off | on | wordWrapColumn | bounded = null,
    wordWrapBreakAfterCharacters: String = null,
    wordWrapBreakBeforeCharacters: String = null,
    wordWrapColumn: Int | Double = null,
    wordWrapMinified: js.UndefOr[Boolean] = js.undefined,
    wrappingIndent: none | same | indent | deepIndent = null,
    wrappingStrategy: simple | advanced = null
  ): IDiffEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptSuggestionOnCommitCharacter)) __obj.updateDynamic("acceptSuggestionOnCommitCharacter")(acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any])
    if (acceptSuggestionOnEnter != null) __obj.updateDynamic("acceptSuggestionOnEnter")(acceptSuggestionOnEnter.asInstanceOf[js.Any])
    if (accessibilityPageSize != null) __obj.updateDynamic("accessibilityPageSize")(accessibilityPageSize.asInstanceOf[js.Any])
    if (accessibilitySupport != null) __obj.updateDynamic("accessibilitySupport")(accessibilitySupport.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (autoClosingBrackets != null) __obj.updateDynamic("autoClosingBrackets")(autoClosingBrackets.asInstanceOf[js.Any])
    if (autoClosingOvertype != null) __obj.updateDynamic("autoClosingOvertype")(autoClosingOvertype.asInstanceOf[js.Any])
    if (autoClosingQuotes != null) __obj.updateDynamic("autoClosingQuotes")(autoClosingQuotes.asInstanceOf[js.Any])
    if (autoIndent != null) __obj.updateDynamic("autoIndent")(autoIndent.asInstanceOf[js.Any])
    if (autoSurround != null) __obj.updateDynamic("autoSurround")(autoSurround.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticLayout)) __obj.updateDynamic("automaticLayout")(automaticLayout.asInstanceOf[js.Any])
    if (codeActionsOnSaveTimeout != null) __obj.updateDynamic("codeActionsOnSaveTimeout")(codeActionsOnSaveTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(codeLens)) __obj.updateDynamic("codeLens")(codeLens.asInstanceOf[js.Any])
    if (!js.isUndefined(colorDecorators)) __obj.updateDynamic("colorDecorators")(colorDecorators.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(contextmenu)) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (!js.isUndefined(copyWithSyntaxHighlighting)) __obj.updateDynamic("copyWithSyntaxHighlighting")(copyWithSyntaxHighlighting.asInstanceOf[js.Any])
    if (cursorBlinking != null) __obj.updateDynamic("cursorBlinking")(cursorBlinking.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorSmoothCaretAnimation)) __obj.updateDynamic("cursorSmoothCaretAnimation")(cursorSmoothCaretAnimation.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (cursorSurroundingLines != null) __obj.updateDynamic("cursorSurroundingLines")(cursorSurroundingLines.asInstanceOf[js.Any])
    if (cursorSurroundingLinesStyle != null) __obj.updateDynamic("cursorSurroundingLinesStyle")(cursorSurroundingLinesStyle.asInstanceOf[js.Any])
    if (cursorWidth != null) __obj.updateDynamic("cursorWidth")(cursorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLayerHinting)) __obj.updateDynamic("disableLayerHinting")(disableLayerHinting.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMonospaceOptimizations)) __obj.updateDynamic("disableMonospaceOptimizations")(disableMonospaceOptimizations.asInstanceOf[js.Any])
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(emptySelectionClipboard)) __obj.updateDynamic("emptySelectionClipboard")(emptySelectionClipboard.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSplitViewResizing)) __obj.updateDynamic("enableSplitViewResizing")(enableSplitViewResizing.asInstanceOf[js.Any])
    if (extraEditorClassName != null) __obj.updateDynamic("extraEditorClassName")(extraEditorClassName.asInstanceOf[js.Any])
    if (fastScrollSensitivity != null) __obj.updateDynamic("fastScrollSensitivity")(fastScrollSensitivity.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedOverflowWidgets)) __obj.updateDynamic("fixedOverflowWidgets")(fixedOverflowWidgets.asInstanceOf[js.Any])
    if (!js.isUndefined(folding)) __obj.updateDynamic("folding")(folding.asInstanceOf[js.Any])
    if (!js.isUndefined(foldingHighlight)) __obj.updateDynamic("foldingHighlight")(foldingHighlight.asInstanceOf[js.Any])
    if (foldingStrategy != null) __obj.updateDynamic("foldingStrategy")(foldingStrategy.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontLigatures != null) __obj.updateDynamic("fontLigatures")(fontLigatures.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnPaste)) __obj.updateDynamic("formatOnPaste")(formatOnPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnType)) __obj.updateDynamic("formatOnType")(formatOnType.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphMargin)) __obj.updateDynamic("glyphMargin")(glyphMargin.asInstanceOf[js.Any])
    if (gotoLocation != null) __obj.updateDynamic("gotoLocation")(gotoLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursorInOverviewRuler)) __obj.updateDynamic("hideCursorInOverviewRuler")(hideCursorInOverviewRuler.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveIndentGuide)) __obj.updateDynamic("highlightActiveIndentGuide")(highlightActiveIndentGuide.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTrimWhitespace)) __obj.updateDynamic("ignoreTrimWhitespace")(ignoreTrimWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(inDiffEditor)) __obj.updateDynamic("inDiffEditor")(inDiffEditor.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightbulb != null) __obj.updateDynamic("lightbulb")(lightbulb.asInstanceOf[js.Any])
    if (lineDecorationsWidth != null) __obj.updateDynamic("lineDecorationsWidth")(lineDecorationsWidth.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineNumbers != null) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (lineNumbersMinChars != null) __obj.updateDynamic("lineNumbersMinChars")(lineNumbersMinChars.asInstanceOf[js.Any])
    if (!js.isUndefined(links)) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (matchBrackets != null) __obj.updateDynamic("matchBrackets")(matchBrackets.asInstanceOf[js.Any])
    if (maxComputationTime != null) __obj.updateDynamic("maxComputationTime")(maxComputationTime.asInstanceOf[js.Any])
    if (minimap != null) __obj.updateDynamic("minimap")(minimap.asInstanceOf[js.Any])
    if (mouseStyle != null) __obj.updateDynamic("mouseStyle")(mouseStyle.asInstanceOf[js.Any])
    if (mouseWheelScrollSensitivity != null) __obj.updateDynamic("mouseWheelScrollSensitivity")(mouseWheelScrollSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(multiCursorMergeOverlapping)) __obj.updateDynamic("multiCursorMergeOverlapping")(multiCursorMergeOverlapping.asInstanceOf[js.Any])
    if (multiCursorModifier != null) __obj.updateDynamic("multiCursorModifier")(multiCursorModifier.asInstanceOf[js.Any])
    if (multiCursorPaste != null) __obj.updateDynamic("multiCursorPaste")(multiCursorPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(occurrencesHighlight)) __obj.updateDynamic("occurrencesHighlight")(occurrencesHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(originalEditable)) __obj.updateDynamic("originalEditable")(originalEditable.asInstanceOf[js.Any])
    if (!js.isUndefined(overviewRulerBorder)) __obj.updateDynamic("overviewRulerBorder")(overviewRulerBorder.asInstanceOf[js.Any])
    if (overviewRulerLanes != null) __obj.updateDynamic("overviewRulerLanes")(overviewRulerLanes.asInstanceOf[js.Any])
    if (parameterHints != null) __obj.updateDynamic("parameterHints")(parameterHints.asInstanceOf[js.Any])
    if (peekWidgetDefaultFocus != null) __obj.updateDynamic("peekWidgetDefaultFocus")(peekWidgetDefaultFocus.asInstanceOf[js.Any])
    if (quickSuggestions != null) __obj.updateDynamic("quickSuggestions")(quickSuggestions.asInstanceOf[js.Any])
    if (quickSuggestionsDelay != null) __obj.updateDynamic("quickSuggestionsDelay")(quickSuggestionsDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(renderControlCharacters)) __obj.updateDynamic("renderControlCharacters")(renderControlCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFinalNewline)) __obj.updateDynamic("renderFinalNewline")(renderFinalNewline.asInstanceOf[js.Any])
    if (!js.isUndefined(renderIndentGuides)) __obj.updateDynamic("renderIndentGuides")(renderIndentGuides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderIndicators)) __obj.updateDynamic("renderIndicators")(renderIndicators.asInstanceOf[js.Any])
    if (renderLineHighlight != null) __obj.updateDynamic("renderLineHighlight")(renderLineHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(renderSideBySide)) __obj.updateDynamic("renderSideBySide")(renderSideBySide.asInstanceOf[js.Any])
    if (renderValidationDecorations != null) __obj.updateDynamic("renderValidationDecorations")(renderValidationDecorations.asInstanceOf[js.Any])
    if (renderWhitespace != null) __obj.updateDynamic("renderWhitespace")(renderWhitespace.asInstanceOf[js.Any])
    if (revealHorizontalRightPadding != null) __obj.updateDynamic("revealHorizontalRightPadding")(revealHorizontalRightPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(roundedSelection)) __obj.updateDynamic("roundedSelection")(roundedSelection.asInstanceOf[js.Any])
    if (rulers != null) __obj.updateDynamic("rulers")(rulers.asInstanceOf[js.Any])
    if (scrollBeyondLastColumn != null) __obj.updateDynamic("scrollBeyondLastColumn")(scrollBeyondLastColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollBeyondLastLine)) __obj.updateDynamic("scrollBeyondLastLine")(scrollBeyondLastLine.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnLineNumbers)) __obj.updateDynamic("selectOnLineNumbers")(selectOnLineNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionClipboard)) __obj.updateDynamic("selectionClipboard")(selectionClipboard.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionHighlight)) __obj.updateDynamic("selectionHighlight")(selectionHighlight.asInstanceOf[js.Any])
    if (showFoldingControls != null) __obj.updateDynamic("showFoldingControls")(showFoldingControls.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnused)) __obj.updateDynamic("showUnused")(showUnused.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling.asInstanceOf[js.Any])
    if (snippetSuggestions != null) __obj.updateDynamic("snippetSuggestions")(snippetSuggestions.asInstanceOf[js.Any])
    if (stopRenderingLineAfter != null) __obj.updateDynamic("stopRenderingLineAfter")(stopRenderingLineAfter.asInstanceOf[js.Any])
    if (suggest != null) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    if (suggestFontSize != null) __obj.updateDynamic("suggestFontSize")(suggestFontSize.asInstanceOf[js.Any])
    if (suggestLineHeight != null) __obj.updateDynamic("suggestLineHeight")(suggestLineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestOnTriggerCharacters)) __obj.updateDynamic("suggestOnTriggerCharacters")(suggestOnTriggerCharacters.asInstanceOf[js.Any])
    if (suggestSelection != null) __obj.updateDynamic("suggestSelection")(suggestSelection.asInstanceOf[js.Any])
    if (tabCompletion != null) __obj.updateDynamic("tabCompletion")(tabCompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabStops)) __obj.updateDynamic("useTabStops")(useTabStops.asInstanceOf[js.Any])
    if (wordSeparators != null) __obj.updateDynamic("wordSeparators")(wordSeparators.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    if (wordWrapBreakAfterCharacters != null) __obj.updateDynamic("wordWrapBreakAfterCharacters")(wordWrapBreakAfterCharacters.asInstanceOf[js.Any])
    if (wordWrapBreakBeforeCharacters != null) __obj.updateDynamic("wordWrapBreakBeforeCharacters")(wordWrapBreakBeforeCharacters.asInstanceOf[js.Any])
    if (wordWrapColumn != null) __obj.updateDynamic("wordWrapColumn")(wordWrapColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapMinified)) __obj.updateDynamic("wordWrapMinified")(wordWrapMinified.asInstanceOf[js.Any])
    if (wrappingIndent != null) __obj.updateDynamic("wrappingIndent")(wrappingIndent.asInstanceOf[js.Any])
    if (wrappingStrategy != null) __obj.updateDynamic("wrappingStrategy")(wrappingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiffEditorOptions]
  }
}

