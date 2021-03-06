package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows a script to open an existing Form or create a new one.
  *
  *     // Open a form by ID.
  *     var existingForm = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *
  *     // Create and open a form.
  *     var newForm = FormApp.create('Form Name');
  */
trait FormApp extends js.Object {
  var Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any
  var DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any
  var FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any
  var ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any
  var PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any
  def create(title: String): Form
  def createCheckboxGridValidation(): CheckboxGridValidationBuilder
  def createCheckboxValidation(): CheckboxValidationBuilder
  def createFeedback(): QuizFeedbackBuilder
  def createGridValidation(): GridValidationBuilder
  def createParagraphTextValidation(): ParagraphTextValidationBuilder
  def createTextValidation(): TextValidationBuilder
  def getActiveForm(): Form
  def getUi(): Ui
  def openById(id: String): Form
  def openByUrl(url: String): Form
}

object FormApp {
  @scala.inline
  def apply(
    Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any,
    DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any,
    FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any,
    ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any,
    PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any,
    create: String => Form,
    createCheckboxGridValidation: () => CheckboxGridValidationBuilder,
    createCheckboxValidation: () => CheckboxValidationBuilder,
    createFeedback: () => QuizFeedbackBuilder,
    createGridValidation: () => GridValidationBuilder,
    createParagraphTextValidation: () => ParagraphTextValidationBuilder,
    createTextValidation: () => TextValidationBuilder,
    getActiveForm: () => Form,
    getUi: () => Ui,
    openById: String => Form,
    openByUrl: String => Form
  ): FormApp = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], FeedbackType = FeedbackType.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], PageNavigationType = PageNavigationType.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), createCheckboxGridValidation = js.Any.fromFunction0(createCheckboxGridValidation), createCheckboxValidation = js.Any.fromFunction0(createCheckboxValidation), createFeedback = js.Any.fromFunction0(createFeedback), createGridValidation = js.Any.fromFunction0(createGridValidation), createParagraphTextValidation = js.Any.fromFunction0(createParagraphTextValidation), createTextValidation = js.Any.fromFunction0(createTextValidation), getActiveForm = js.Any.fromFunction0(getActiveForm), getUi = js.Any.fromFunction0(getUi), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
  
    __obj.asInstanceOf[FormApp]
  }
}

