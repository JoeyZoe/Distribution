package typings.formstate

import org.scalablytyped.runtime.StringDictionary
import typings.formstate.formstateStrings.`object`
import typings.formstate.formstateStrings.array
import typings.formstate.formstateStrings.map
import typings.formstate.typesMod.ComposibleValidatable
import typings.formstate.typesMod.Validator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formstate/lib/core/formState", JSImport.Namespace)
@js.native
object formStateMod extends js.Object {
  @js.native
  class FormState[TValue /* <: ValidatableMapOrArray */] protected () extends ComposibleValidatable[TValue] {
    def this(/**
      * SubItems can be any Validatable
      */
    $: TValue) = this()
    /* CompleteClass */
    @JSName("$")
    override var $: TValue = js.native
    var _error: js.UndefOr[String | Null] = js.native
    var _validators: js.Array[Validator[TValue]] = js.native
    /**
      * Auto validation
      */
    var autoValidationEnabled: Boolean = js.native
    /**
      * The first error from any sub (if any) or form error
      */
    @JSName("error")
    val error_FormState: js.UndefOr[String | Null] = js.native
    /**
      * Error from some sub field if any
      */
    val fieldError: js.UndefOr[String | Null] = js.native
    /**
      * Error from form if any
      */
    val formError: js.UndefOr[String | Null] = js.native
    /* CompleteClass */
    override var hasError: Boolean = js.native
    /**
      * Does any field have an error
      */
    val hasFieldError: Boolean = js.native
    /**
      * Does form level validation have an error
      */
    val hasFormError: Boolean = js.native
    var mode: `object` | array | map = js.native
    /**
      * You should only show the form error if there are no field errors
      */
    val showFormError: Boolean = js.native
    /**
      * Composible field validation tracking
      */
    var validatedSubFields: js.Array[ComposibleValidatable[_]] = js.native
    /* CompleteClass */
    override var validating: Boolean = js.native
    /* CompleteClass */
    @JSName("_on$Reinit")
    override def _on$Reinit(): Unit = js.native
    /** Used to tell the parent about validation */
    /* CompleteClass */
    @JSName("_on$ValidationPass")
    override def _on$ValidationPass(): Unit = js.native
    /** Used by the parent to register listeners */
    /* CompleteClass */
    override def _setCompositionParent(config: AnonOnReinit): Unit = js.native
    /**
      * Call it when you are `reinit`ing child fields
      */
    def clearFormError(): Unit = js.native
    /**
      * Composible fields (fields that work in conjuction with FormState)
      */
    def compose(): this.type = js.native
    /* CompleteClass */
    override def disableAutoValidation(): Unit = js.native
    /* CompleteClass */
    override def enableAutoValidation(): Unit = js.native
    def enableAutoValidationAndValidate(): js.Promise[AnonHasError | AnonHasErrorValue[TValue]] = js.native
    /** Get validatable objects from $ */
    /* protected */ def getValues(): js.Array[ComposibleValidatable[_]] = js.native
    /** Allows a convinient reset for all fields */
    /* CompleteClass */
    override def reset(): Unit = js.native
    /* CompleteClass */
    override def validate(): js.Promise[AnonHasError | AnonValue[TValue]] = js.native
    def validators(validators: Validator[TValue]*): this.type = js.native
  }
  
  type ValidatableMapOrArray = StringDictionary[ComposibleValidatable[js.Any]] | js.Array[ComposibleValidatable[js.Any]] | (Map[js.Any, ComposibleValidatable[js.Any]])
}

