package typings.semanticUiForm.SemanticUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery_.TriggeredEvent
import typings.semanticUiForm.JQuery
import typings.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typings.semanticUiForm.SemanticUI.Form.ErrorSettings
import typings.semanticUiForm.SemanticUI.Form.Field
import typings.semanticUiForm.SemanticUI.Form.Fields
import typings.semanticUiForm.SemanticUI.Form.MetadataSettings
import typings.semanticUiForm.SemanticUI.Form.PromptSettings
import typings.semanticUiForm.SemanticUI.Form.Rule
import typings.semanticUiForm.SemanticUI.Form.Rules
import typings.semanticUiForm.SemanticUI.Form.SelectorSettings
import typings.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typings.semanticUiForm.SemanticUI.Form.TextSettings
import typings.semanticUiForm.semanticUiFormStrings.`add errors`
import typings.semanticUiForm.semanticUiFormStrings.`add field`
import typings.semanticUiForm.semanticUiFormStrings.`add fields`
import typings.semanticUiForm.semanticUiFormStrings.`add prompt`
import typings.semanticUiForm.semanticUiFormStrings.`add rule`
import typings.semanticUiForm.semanticUiFormStrings.`get change event`
import typings.semanticUiForm.semanticUiFormStrings.`get field`
import typings.semanticUiForm.semanticUiFormStrings.`get validation`
import typings.semanticUiForm.semanticUiFormStrings.`get value`
import typings.semanticUiForm.semanticUiFormStrings.`get values`
import typings.semanticUiForm.semanticUiFormStrings.`has field`
import typings.semanticUiForm.semanticUiFormStrings.`inline`
import typings.semanticUiForm.semanticUiFormStrings.`is valid`
import typings.semanticUiForm.semanticUiFormStrings.`remove field`
import typings.semanticUiForm.semanticUiFormStrings.`remove fields`
import typings.semanticUiForm.semanticUiFormStrings.`remove rule`
import typings.semanticUiForm.semanticUiFormStrings.`remove rules`
import typings.semanticUiForm.semanticUiFormStrings.`set value`
import typings.semanticUiForm.semanticUiFormStrings.`set values`
import typings.semanticUiForm.semanticUiFormStrings.`validate form`
import typings.semanticUiForm.semanticUiFormStrings.blur
import typings.semanticUiForm.semanticUiFormStrings.change
import typings.semanticUiForm.semanticUiFormStrings.className
import typings.semanticUiForm.semanticUiFormStrings.debug
import typings.semanticUiForm.semanticUiFormStrings.defaults
import typings.semanticUiForm.semanticUiFormStrings.delay
import typings.semanticUiForm.semanticUiFormStrings.destroy
import typings.semanticUiForm.semanticUiFormStrings.duration
import typings.semanticUiForm.semanticUiFormStrings.error
import typings.semanticUiForm.semanticUiFormStrings.fields
import typings.semanticUiForm.semanticUiFormStrings.keyboardShortcuts
import typings.semanticUiForm.semanticUiFormStrings.metadata
import typings.semanticUiForm.semanticUiFormStrings.name
import typings.semanticUiForm.semanticUiFormStrings.namespace
import typings.semanticUiForm.semanticUiFormStrings.on
import typings.semanticUiForm.semanticUiFormStrings.onFailure
import typings.semanticUiForm.semanticUiFormStrings.onInvalid
import typings.semanticUiForm.semanticUiFormStrings.onSuccess
import typings.semanticUiForm.semanticUiFormStrings.onValid
import typings.semanticUiForm.semanticUiFormStrings.performance
import typings.semanticUiForm.semanticUiFormStrings.prompt
import typings.semanticUiForm.semanticUiFormStrings.revalidate
import typings.semanticUiForm.semanticUiFormStrings.rules
import typings.semanticUiForm.semanticUiFormStrings.selector
import typings.semanticUiForm.semanticUiFormStrings.setting
import typings.semanticUiForm.semanticUiFormStrings.silent
import typings.semanticUiForm.semanticUiFormStrings.submit
import typings.semanticUiForm.semanticUiFormStrings.templates
import typings.semanticUiForm.semanticUiFormStrings.text
import typings.semanticUiForm.semanticUiFormStrings.transition
import typings.semanticUiForm.semanticUiFormStrings.verbose
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form_ extends js.Object {
  var settings: FormSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds errors to form, given an array errors
    */
  def apply(behavior: `add errors`, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add field`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: Rules): JQuery = js.native
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  def apply(behavior: `add fields`, fields: Fields): JQuery = js.native
  /**
    * Adds error prompt to the field with the given identifier
    */
  def apply(behavior: `add prompt`, identifier: String, errors: String): JQuery = js.native
  def apply(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add rule`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: Rules): JQuery = js.native
  /**
    * gets browser property change event
    */
  def apply(behavior: `get change event`): String = js.native
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  def apply(behavior: `get field`, id: String): JQuery = js.native
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  def apply(behavior: `get validation`, element: JQuery): js.Any = js.native
  /**
    * Returns value of element with id
    */
  def apply(behavior: `get value`, id: String): js.Any = js.native
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  def apply(behavior: `get values`): js.Any = js.native
  def apply(behavior: `get values`, ids: js.Array[String]): js.Any = js.native
  /**
    * Returns whether a field exists
    */
  def apply(behavior: `has field`, identifier: String): Boolean = js.native
  /**
    * Returns true/false whether a form passes its validation rules
    */
  def apply(behavior: `is valid`): Boolean = js.native
  /**
    * Returns true/false whether a field passes its validation rules
    */
  def apply(behavior: `is valid`, field: String): Boolean = js.native
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  def apply(behavior: `remove field`, field: String): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove fields`, fields: js.Array[String]): JQuery = js.native
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  def apply(behavior: `remove rule`, field: String, rule: Rule): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery = js.native
  def apply(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery = js.native
  /**
    * Sets value of element with id
    */
  def apply(behavior: `set value`, id: String): JQuery = js.native
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  def apply(behavior: `set values`, values: js.Any): JQuery = js.native
  /**
    * Validates form and calls onSuccess or onFailure
    */
  def apply(behavior: `validate form`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: `inline`): Boolean = js.native
  def apply(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: defaults): StringDictionary[Field] = js.native
  def apply(behavior: setting, name: defaults, value: StringDictionary[Field]): JQuery = js.native
  def apply(behavior: setting, name: delay): Boolean = js.native
  def apply(behavior: setting, name: delay, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: fields): StringDictionary[String | js.Array[String] | Field] = js.native
  def apply(behavior: setting, name: fields, value: StringDictionary[String | js.Array[String] | Field]): JQuery = js.native
  def apply(behavior: setting, name: keyboardShortcuts): Boolean = js.native
  def apply(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: on): submit | blur | change = js.native
  def apply(behavior: setting, name: onFailure): js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit] = js.native
  def apply(
    behavior: setting,
    name: onFailure,
    value: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onInvalid): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onInvalid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onSuccess): js.ThisFunction2[
    /* this */ JQuery, 
    /* event */ TriggeredEvent[HTMLElement, _, _, _], 
    /* fields */ js.Any, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, _, _, _], 
      /* fields */ js.Any, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onValid): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onValid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: blur): JQuery = js.native
  def apply(behavior: setting, name: on, value: change): JQuery = js.native
  def apply(behavior: setting, name: on, value: submit): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: prompt): PromptSettings = js.native
  def apply(behavior: setting, name: prompt, value: PromptSettings): JQuery = js.native
  def apply(behavior: setting, name: revalidate): Boolean = js.native
  def apply(behavior: setting, name: revalidate, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: rules): StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]] = js.native
  def apply(
    behavior: setting,
    name: rules,
    value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  ): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: templates): TemplatesSettings = js.native
  def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def apply(behavior: setting, name: text): TextSettings = js.native
  def apply(behavior: setting, name: text, value: TextSettings): JQuery = js.native
  def apply(behavior: setting, name: transition): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: FormSettings): JQuery = js.native
  /**
    * Submits selected form
    */
  def apply(behavior: submit): JQuery = js.native
  def apply(settings: Fields): JQuery = js.native
  def apply(settings: FormSettings): JQuery = js.native
}

