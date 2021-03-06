package typings.formik.fastFieldMod

import typings.formik.fieldMod.FieldProps
import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldValidator
import typings.formik.typesMod.GenericFieldHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined formik.formik/dist/Field.FieldConfig<any> & {shouldUpdate ? (nextProps : T & formik.formik/dist/types.GenericFieldHTMLAttributes, props : {}): boolean} */
trait FastFieldConfig[T] extends js.Object {
  /**
    * Component to render. Can either be a string e.g. 'select', 'input', or 'textarea', or a component.
    */
  var as: js.UndefOr[
    (ComponentType[FieldInputProps[_] | js.Object]) | String | ForwardRefExoticComponent[_]
  ] = js.undefined
  /**
    * Children render function <Field name>{props => ...}</Field>)
    */
  var children: js.UndefOr[(js.Function1[/* props */ FieldProps[_, _], ReactNode]) | ReactNode] = js.undefined
  /**
    * Field component to render. Can either be a string like 'select' or a component.
    */
  var component: js.UndefOr[
    String | (ComponentType[(FieldProps[_, _]) | js.Object]) | ForwardRefExoticComponent[_]
  ] = js.undefined
  /** Inner ref */
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.undefined
  /**
    * Field name
    */
  var name: String
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    * @deprecated
    */
  var render: js.UndefOr[js.Function1[/* props */ FieldProps[_, _], ReactNode]] = js.undefined
  /** Override FastField's default shouldComponentUpdate */
  var shouldUpdate: js.UndefOr[
    js.Function2[/* nextProps */ T with GenericFieldHTMLAttributes, /* props */ js.Object, Boolean]
  ] = js.undefined
  /** HTML input type */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Validate a single field value independently
    */
  var validate: js.UndefOr[FieldValidator] = js.undefined
  /** Field value */
  var value: js.UndefOr[js.Any] = js.undefined
}

object FastFieldConfig {
  @scala.inline
  def apply[T](
    name: String,
    as: (ComponentType[FieldInputProps[_] | js.Object]) | String | ForwardRefExoticComponent[_] = null,
    children: (js.Function1[/* props */ FieldProps[_, _], ReactNode]) | ReactNode = null,
    component: String | (ComponentType[(FieldProps[_, _]) | js.Object]) | ForwardRefExoticComponent[_] = null,
    innerRef: /* instance */ js.Any => Unit = null,
    render: /* props */ FieldProps[_, _] => ReactNode = null,
    shouldUpdate: (/* nextProps */ T with GenericFieldHTMLAttributes, /* props */ js.Object) => Boolean = null,
    `type`: String = null,
    validate: /* value */ js.Any => String | Unit | (js.Promise[String | Unit]) = null,
    value: js.Any = null
  ): FastFieldConfig[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(js.Any.fromFunction2(shouldUpdate))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastFieldConfig[T]]
  }
}

