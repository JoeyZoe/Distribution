package typings.formik.withFormikMod

import typings.formik.typesMod.FormikErrors
import typings.formik.typesMod.FormikState
import typings.formik.typesMod.FormikTouched
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  props  :P} & formik.formik/dist/types.FormikHelpers<V> */
@js.native
trait FormikBag[P, V] extends js.Object {
  var props: P = js.native
  /** Reset form */
  def resetForm(): Unit = js.native
  def resetForm(nextState: Partial[FormikState[V]]): Unit = js.native
  /** Manually set errors object */
  def setErrors(errors: FormikErrors[V]): Unit = js.native
  /** Set error message of a form field directly */
  def setFieldError(field: String, message: String): Unit = js.native
  /** Set whether field has been touched directly */
  def setFieldTouched(field: String): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean): Unit = js.native
  def setFieldTouched(field: String, isTouched: Boolean, shouldValidate: Boolean): Unit = js.native
  /** Set value of form field directly */
  def setFieldValue(field: String, value: js.Any): Unit = js.native
  def setFieldValue(field: String, value: js.Any, shouldValidate: Boolean): Unit = js.native
  def setFormikState(f: js.Function1[/* prevState */ FormikState[V], FormikState[V]]): Unit = js.native
  def setFormikState(f: js.Function1[/* prevState */ FormikState[V], FormikState[V]], cb: js.Function0[Unit]): Unit = js.native
  /** Set Formik state, careful! */
  def setFormikState(f: FormikState[V]): Unit = js.native
  def setFormikState(f: FormikState[V], cb: js.Function0[Unit]): Unit = js.native
  /** Manually set top level status. */
  def setStatus(): Unit = js.native
  def setStatus(status: js.Any): Unit = js.native
  /** Manually set isSubmitting */
  def setSubmitting(isSubmitting: Boolean): Unit = js.native
  /** Manually set touched object */
  def setTouched(touched: FormikTouched[V]): Unit = js.native
  def setTouched(touched: FormikTouched[V], shouldValidate: Boolean): Unit = js.native
  /** Manually set values object  */
  def setValues(values: V): Unit = js.native
  def setValues(values: V, shouldValidate: Boolean): Unit = js.native
  /** Submit the form imperatively */
  def submitForm(): js.Promise[Unit] = js.native
  /** Validate field value */
  def validateField(field: String): Unit = js.native
  /** Validate form values */
  def validateForm(): js.Promise[FormikErrors[V]] = js.native
  def validateForm(values: js.Any): js.Promise[FormikErrors[V]] = js.native
}

