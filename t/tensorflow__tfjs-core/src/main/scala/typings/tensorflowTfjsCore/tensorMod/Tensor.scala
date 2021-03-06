package typings.tensorflowTfjsCore.tensorMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.AnonIndices
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor", "Tensor")
@js.native
class Tensor[R /* <: Rank */] protected () extends js.Object {
  def this(
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    dataId: DataId,
    id: Double
  ) = this()
  /**
    * Id of the bucket holding the data for this tensor. Multiple arrays can
    * point to the same bucket (e.g. when calling array.reshape()).
    */
  var dataId: DataId = js.native
  /** The data type for the array. */
  val dtype: DataType = js.native
  /** Unique id of this tensor. */
  val id: Double = js.native
  val isDisposed: Boolean = js.native
  var isDisposedInternal: Boolean = js.native
  /** Whether this tensor has been globally kept. */
  var kept: Boolean = js.native
  val rank: Double = js.native
  /** The rank type for the array (see `Rank` enum). */
  val rankType: R = js.native
  /** The id of the scope this tensor is being tracked in. */
  var scopeId: Double = js.native
  /** The shape of the tensor. */
  val shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any = js.native
  /** Number of elements in the tensor. */
  val size: Double = js.native
  /**
    * Number of elements to skip in each dimension when indexing. See
    * https://docs.scipy.org/doc/numpy/reference/generated/\
    * numpy.ndarray.strides.html
    */
  val strides: js.Array[Double] = js.native
  var throwIfDisposed: js.Any = js.native
  def abs[T /* <: Tensor[Rank] */](): T = js.native
  def acos[T /* <: Tensor[Rank] */](): T = js.native
  def acosh[T /* <: Tensor[Rank] */](): T = js.native
  def add[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def add[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  def addStrict[T /* <: this.type */](x: T): T = js.native
  def addStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def all[T /* <: Tensor[Rank] */](): T = js.native
  def all[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def all[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def all[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def all[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def any[T /* <: Tensor[Rank] */](): T = js.native
  def any[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def any[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def any[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def any[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def argMax[T /* <: Tensor[Rank] */](): T = js.native
  def argMax[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def argMin[T /* <: Tensor[Rank] */](): T = js.native
  def argMin[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  /**
    * Returns the tensor data as a nested array. The transfer of data is done
    * asynchronously.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def array(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any
  ] = js.native
  /**
    * Returns the tensor data as a nested array. The transfer of data is done
    * synchronously.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def arraySync(): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any = js.native
  /** Converts a `tf.Tensor` to a `tf.Tensor1D`. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as1D(): Tensor1D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor2D`.
    *
    * @param rows Number of rows in `tf.Tensor2D`.
    * @param columns Number of columns in `tf.Tensor2D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as2D(rows: Double, columns: Double): Tensor2D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor3D`.
    *
    * @param rows Number of rows in `tf.Tensor3D`.
    * @param columns Number of columns in `tf.Tensor3D`.
    * @param depth Depth of `tf.Tensor3D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as3D(rows: Double, columns: Double, depth: Double): Tensor3D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor4D`.
    *
    * @param rows Number of rows in `tf.Tensor4D`.
    * @param columns Number of columns in `tf.Tensor4D`.
    * @param depth Depth of `tf.Tensor4D`.
    * @param depth2 4th dimension of `tf.Tensor4D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Tensor4D = js.native
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor5D`.
    *
    * @param rows Number of rows in `tf.Tensor5D`.
    * @param columns Number of columns in `tf.Tensor5D`.
    * @param depth Depth of `tf.Tensor5D`.
    * @param depth2 4th dimension of `tf.Tensor5D`.
    * @param depth3 5th dimension of 'tf.Tensor5D'
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as5D(rows: Double, columns: Double, depth: Double, depth2: Double, depth3: Double): Tensor5D = js.native
  /** Converts a size-1 `tf.Tensor` to a `tf.Scalar`. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def asScalar(): Scalar = js.native
  /**
    * Casts a `tf.Tensor` to a specified dtype.
    *
    * @param dtype Data-type to cast the tensor to.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def asType[T /* <: this.type */](dtype: DataType): T = js.native
  def asin[T /* <: Tensor[Rank] */](): T = js.native
  def asinh[T /* <: Tensor[Rank] */](): T = js.native
  def atan[T /* <: Tensor[Rank] */](): T = js.native
  def atan2[T /* <: this.type */](x: T): T = js.native
  def atan2[T /* <: this.type */](x: TensorLike): T = js.native
  def atanh[T /* <: Tensor[Rank] */](): T = js.native
  def avgPool(
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def avgPool(
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def batchNorm[T /* <: Tensor[Rank] */](mean: Tensor[R] | Tensor1D | TensorLike, variance: Tensor[R] | Tensor1D | TensorLike): Tensor[R] = js.native
  def batchNorm[T /* <: Tensor[Rank] */](
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def batchNorm[T /* <: Tensor[Rank] */](
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike,
    scale: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def batchNorm[T /* <: Tensor[Rank] */](
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike,
    scale: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): Tensor[R] = js.native
  /**
    * @deprecated Use `tf.batchNorm` instead, and note the positional argument
    *     change of scale, offset, and varianceEpsilon.
    */
  def batchNormalization(mean: Tensor[R] | Tensor1D | TensorLike, variance: Tensor[R] | Tensor1D | TensorLike): Tensor[R] = js.native
  def batchNormalization(
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): Tensor[R] = js.native
  def batchNormalization(
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def batchNormalization(
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double,
    scale: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def batchToSpaceND[T /* <: Tensor[Rank] */](blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  def broadcastTo[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  /**
    * Returns a promise of `tf.TensorBuffer` that holds the underlying data.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def buffer(): js.Promise[TensorBuffer[R, float32]] = js.native
  /** Returns a `tf.TensorBuffer` that holds the underlying data. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def bufferSync(): TensorBuffer[R, float32] = js.native
  /** Returns the underlying bytes of the tensor's data. */
  def bytes(): js.Promise[js.Array[Uint8Array] | Uint8Array] = js.native
  def cast[T /* <: this.type */](dtype: DataType): T = js.native
  def ceil[T /* <: Tensor[Rank] */](): T = js.native
  def clipByValue(min: Double, max: Double): Tensor[R] = js.native
  def concat[T /* <: Tensor[Rank] */](x: T): T = js.native
  def concat[T /* <: Tensor[Rank] */](x: T, axis: Double): T = js.native
  def concat[T /* <: Tensor[Rank] */](x: js.Array[T | TensorLike]): T = js.native
  def concat[T /* <: Tensor[Rank] */](x: js.Array[T | TensorLike], axis: Double): T = js.native
  def conv1d(filter: Tensor3D | TensorLike3D, stride: Double, pad: Double | same_ | valid_): Tensor[R2] = js.native
  def conv1d(
    filter: Tensor3D | TensorLike3D,
    stride: Double,
    pad: Double | same_ | valid_,
    dataFormat: NCW | NWC
  ): Tensor[R2] = js.native
  def conv1d(
    filter: Tensor3D | TensorLike3D,
    stride: Double,
    pad: Double | same_ | valid_,
    dataFormat: NCW | NWC,
    dilation: Double
  ): Tensor[R2] = js.native
  def conv1d(
    filter: Tensor3D | TensorLike3D,
    stride: Double,
    pad: Double | same_ | valid_,
    dataFormat: NCW | NWC,
    dilation: Double,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R2] = js.native
  def conv2d(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def conv2d(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = js.native
  def conv2d(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def conv2d(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double]),
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def conv2dTranspose(
    filter: Tensor4D | TensorLike4D,
    outputShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def conv2dTranspose(
    filter: Tensor4D | TensorLike4D,
    outputShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def cos[T /* <: Tensor[Rank] */](): T = js.native
  def cosh[T /* <: Tensor[Rank] */](): T = js.native
  /**
    * Returns the cumulative sum of the `tf.Tensor` along `axis`.
    *
    * @param axis The axis along which to sum. Optional. Defaults to 0.
    * @param exclusive Whether to perform exclusive cumulative sum. Defaults to
    *    false. If set to true then the sum of each tensor entry does not
    * include its own value, but only the values previous to it along the
    * specified axis.
    * @param reverse Whether to sum in the opposite direction. Defaults to
    *    false.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def cumsum[T /* <: Tensor[Rank] */](): T = js.native
  def cumsum[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def cumsum[T /* <: Tensor[Rank] */](axis: Double, exclusive: Boolean): T = js.native
  def cumsum[T /* <: Tensor[Rank] */](axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  /**
    * Asynchronously downloads the values from the `tf.Tensor`. Returns a
    * promise of `TypedArray` that resolves when the computation has finished.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def data(): js.Promise[Float32Array] = js.native
  def dataSync(): js.Array[String] = js.native
  /**
    * Synchronously downloads the values from the `tf.Tensor`. This blocks the
    * UI thread until the values are ready, which can cause performance issues.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  @JSName("dataSync")
  def dataSync_Float32Array(): Float32Array = js.native
  @JSName("dataSync")
  def dataSync_Int32Array(): Int32Array = js.native
  @JSName("dataSync")
  def dataSync_Uint8Array(): Uint8Array = js.native
  @JSName("depthToSpace")
  def depthToSpace_NCHW(blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
  def depthwiseConv2D(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def depthwiseConv2D(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC
  ): Tensor[R3] = js.native
  def depthwiseConv2D(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def depthwiseConv2D(
    filter: Tensor4D | TensorLike4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dataFormat: NCHW | NHWC,
    dilations: Double | (js.Tuple2[Double, Double]),
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  /**
    * Disposes `tf.Tensor` from memory.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def dispose(): Unit = js.native
  def div[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def div[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  def divNoNan[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def divNoNan[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  def divStrict[T /* <: this.type */](x: T): T = js.native
  def divStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def dot(b: TensorLike): Tensor[Rank] = js.native
  def dot(b: Tensor[Rank]): Tensor[Rank] = js.native
  def elu[T /* <: Tensor[Rank] */](): T = js.native
  def equal[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def equal[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def equalStrict[T /* <: this.type */](x: T): T = js.native
  def equalStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def erf[T /* <: Tensor[Rank] */](): T = js.native
  def exp[T /* <: Tensor[Rank] */](): T = js.native
  /**
    * Returns a `tf.Tensor` that has expanded rank, by inserting a dimension
    * into the tensor's shape. See `tf.expandDims` for details.
    *
    * @param axis The dimension index at which to insert shape of 1. Defaults to
    *     0 (the first dimension).
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def expandDims[R2 /* <: Rank */](): Tensor[R2] = js.native
  def expandDims[R2 /* <: Rank */](axis: Double): Tensor[R2] = js.native
  def expm1[T /* <: Tensor[Rank] */](): T = js.native
  def fft(): Tensor[Rank] = js.native
  /** Flatten a Tensor to a 1D array. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def flatten(): Tensor1D = js.native
  def floor[T /* <: Tensor[Rank] */](): T = js.native
  def floorDiv[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def floorDiv[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def gather[T /* <: this.type */](indices: TensorLike): T = js.native
  def gather[T /* <: this.type */](indices: TensorLike, axis: Double): T = js.native
  def gather[T /* <: this.type */](indices: Tensor[Rank]): T = js.native
  def gather[T /* <: this.type */](indices: Tensor[Rank], axis: Double): T = js.native
  def greater[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def greater[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def greaterEqual[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def greaterEqual[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def greaterEqualStrict[T /* <: this.type */](x: T): T = js.native
  def greaterEqualStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def greaterStrict[T /* <: this.type */](x: T): T = js.native
  def greaterStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def ifft(): Tensor[Rank] = js.native
  def irfft(): Tensor[Rank] = js.native
  def isFinite[T /* <: Tensor[Rank] */](): T = js.native
  def isInf[T /* <: Tensor[Rank] */](): T = js.native
  def isNaN[T /* <: Tensor[Rank] */](): T = js.native
  def leakyRelu(): Tensor[R] = js.native
  def leakyRelu(alpha: Double): Tensor[R] = js.native
  def less[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def less[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def lessEqual[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def lessEqual[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def lessEqualStrict[T /* <: this.type */](x: T): T = js.native
  def lessEqualStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def lessStrict[T /* <: this.type */](x: T): T = js.native
  def lessStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def localResponseNormalization(): Tensor[R3] = js.native
  def localResponseNormalization(radius: Double): Tensor[R3] = js.native
  def localResponseNormalization(radius: Double, bias: Double): Tensor[R3] = js.native
  def localResponseNormalization(radius: Double, bias: Double, alpha: Double): Tensor[R3] = js.native
  def localResponseNormalization(radius: Double, bias: Double, alpha: Double, beta: Double): Tensor[R3] = js.native
  def log[T /* <: Tensor[Rank] */](): T = js.native
  def log1p[T /* <: Tensor[Rank] */](): T = js.native
  def logSigmoid[T /* <: Tensor[Rank] */](): T = js.native
  def logSoftmax[T /* <: this.type */](): T = js.native
  def logSoftmax[T /* <: this.type */](axis: Double): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def logicalAnd(x: TensorLike): Tensor[Rank] = js.native
  def logicalAnd(x: Tensor[Rank]): Tensor[Rank] = js.native
  def logicalNot[T /* <: Tensor[Rank] */](): T = js.native
  def logicalOr(x: TensorLike): Tensor[Rank] = js.native
  def logicalOr(x: Tensor[Rank]): Tensor[Rank] = js.native
  def logicalXor(x: TensorLike): Tensor[Rank] = js.native
  def logicalXor(x: Tensor[Rank]): Tensor[Rank] = js.native
  def matMul[T /* <: Tensor[Rank] */](b: T): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: T, transposeA: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  def max[T /* <: Tensor[Rank] */](): T = js.native
  def max[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def max[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def max[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def max[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def maxPool(
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def maxPool(
    filterSize: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): Tensor[R3] = js.native
  def maximum[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def maximum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def maximumStrict[T /* <: this.type */](x: T): T = js.native
  def maximumStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def mean[T /* <: Tensor[Rank] */](): T = js.native
  def mean[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def mean[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def mean[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def mean[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def min[T /* <: Tensor[Rank] */](): T = js.native
  def min[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def min[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def min[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def min[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def minimum[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def minimum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def minimumStrict[T /* <: this.type */](x: T): T = js.native
  def minimumStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def mod[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def mod[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def modStrict[T /* <: this.type */](x: T): T = js.native
  def modStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def mul[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def mul[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def mulStrict[T /* <: this.type */](x: T): T = js.native
  def mulStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def neg[T /* <: Tensor[Rank] */](): T = js.native
  def norm(): Tensor[Rank] = js.native
  def norm(ord: Double): Tensor[Rank] = js.native
  def norm(ord: Double, axis: js.Array[Double]): Tensor[Rank] = js.native
  def norm(ord: Double, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  def norm(ord: Double, axis: Double): Tensor[Rank] = js.native
  def norm(ord: Double, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: js.Array[Double]): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: Double): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: js.Array[Double]): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: Double): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  def notEqual[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def notEqual[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def notEqualStrict[T /* <: this.type */](x: T): T = js.native
  def notEqualStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def oneHot(depth: Double, onValue: Double, offValue: Double): Tensor[Rank] = js.native
  def onesLike[T /* <: Tensor[Rank] */](): T = js.native
  def pad[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
  def pad[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  def pool(
    windowShape: Double | (js.Tuple2[Double, Double]),
    poolingType: avg | max,
    padding: Double | same_ | valid_
  ): Tensor[R3] = js.native
  def pool(
    windowShape: Double | (js.Tuple2[Double, Double]),
    poolingType: avg | max,
    padding: Double | same_ | valid_,
    dilationRate: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def pool(
    windowShape: Double | (js.Tuple2[Double, Double]),
    poolingType: avg | max,
    padding: Double | same_ | valid_,
    dilationRate: Double | (js.Tuple2[Double, Double]),
    strides: Double | (js.Tuple2[Double, Double])
  ): Tensor[R3] = js.native
  def pow[T /* <: Tensor[Rank] */](exp: TensorLike): T = js.native
  def pow[T /* <: Tensor[Rank] */](exp: Tensor[Rank]): T = js.native
  def powStrict(exp: TensorLike): Tensor[R] = js.native
  def powStrict(exp: Tensor[Rank]): Tensor[R] = js.native
  def prelu(alpha: TensorLike): Tensor[R] = js.native
  def prelu(alpha: Tensor[R]): Tensor[R] = js.native
  /**
    * Prints the `tf.Tensor`. See `tf.print` for details.
    *
    * @param verbose Whether to print verbose information about the tensor,
    *    including dtype and size.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def print(): Unit = js.native
  def print(verbose: Boolean): Unit = js.native
  def prod[T /* <: Tensor[Rank] */](): T = js.native
  def prod[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def prod[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def prod[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def prod[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def reciprocal[T /* <: Tensor[Rank] */](): T = js.native
  def relu[T /* <: Tensor[Rank] */](): T = js.native
  def relu6[T /* <: Tensor[Rank] */](): T = js.native
  /**
    * Reshapes the tensor into the provided shape.
    * See `tf.reshape` for more details.
    *
    * @param newShape An array of integers defining the output tensor shape.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def reshape[R2 /* <: Rank */](
    newShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): Tensor[R2] = js.native
  /**
    * Reshapes the tensor into the shape of the provided tensor.
    *
    * @param x The tensor of required shape.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def reshapeAs[T /* <: Tensor[Rank] */](x: T): T = js.native
  def resizeBilinear(newShape2D: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  def resizeBilinear(newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  def resizeNearestNeighbor(newShape2D: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  def resizeNearestNeighbor(newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  def reverse[T /* <: Tensor[Rank] */](): T = js.native
  def reverse[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def reverse[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def rfft(): Tensor[Rank] = js.native
  def round[T /* <: Tensor[Rank] */](): T = js.native
  def rsqrt[T /* <: Tensor[Rank] */](): T = js.native
  def selu[T /* <: Tensor[Rank] */](): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    depthwiseFilter: Tensor4D | TensorLike4D,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_
  ): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    depthwiseFilter: Tensor4D | TensorLike4D,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilation: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    depthwiseFilter: Tensor4D | TensorLike4D,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilation: (js.Tuple2[Double, Double]) | Double,
    dataFormat: NHWC | NCHW
  ): T = js.native
  def sigmoid[T /* <: Tensor[Rank] */](): T = js.native
  def sign[T /* <: Tensor[Rank] */](): T = js.native
  def sin[T /* <: Tensor[Rank] */](): T = js.native
  def sinh[T /* <: Tensor[Rank] */](): T = js.native
  def slice[T /* <: Tensor[R] */](begin: js.Array[Double]): T = js.native
  def slice[T /* <: Tensor[R] */](begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def slice[T /* <: Tensor[R] */](begin: js.Array[Double], size: Double): T = js.native
  def slice[T /* <: Tensor[R] */](begin: Double): T = js.native
  def slice[T /* <: Tensor[R] */](begin: Double, size: js.Array[Double]): T = js.native
  def slice[T /* <: Tensor[R] */](begin: Double, size: Double): T = js.native
  def softmax[T /* <: this.type */](): T = js.native
  def softmax[T /* <: this.type */](dim: Double): T = js.native
  def softplus[T /* <: Tensor[Rank] */](): T = js.native
  def spaceToBatchND[T /* <: Tensor[Rank] */](blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  def sqrt[T /* <: Tensor[Rank] */](): T = js.native
  def square[T /* <: Tensor[Rank] */](): T = js.native
  def squaredDifference[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def squaredDifference[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  def squaredDifferenceStrict[T /* <: this.type */](x: T): T = js.native
  def squaredDifferenceStrict[T /* <: this.type */](x: TensorLike): T = js.native
  /**
    * Returns a `tf.Tensor` with dimensions of size 1 removed from the shape.
    * See `tf.squeeze` for more details.
    *
    * @param axis A list of numbers. If specified, only squeezes the
    *    dimensions listed. The dimension index starts at 0. It is an error to
    *    squeeze a dimension that is not 1.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def squeeze[T /* <: Tensor[Rank] */](): T = js.native
  def squeeze[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def stack(x: Tensor[Rank]): Tensor[Rank] = js.native
  def stack(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  def step[T /* <: Tensor[Rank] */](): T = js.native
  def step[T /* <: Tensor[Rank] */](alpha: Double): T = js.native
  def stridedSlice(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): Tensor[Rank] = js.native
  def stridedSlice(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double], beginMask: Double): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def sub[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def sub[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def subStrict[T /* <: this.type */](x: T): T = js.native
  def subStrict[T /* <: this.type */](x: TensorLike): T = js.native
  def sum[T /* <: Tensor[Rank] */](): T = js.native
  def sum[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def sum[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def sum[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def sum[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  def tan[T /* <: Tensor[Rank] */](): T = js.native
  def tanh[T /* <: Tensor[Rank] */](): T = js.native
  def tile[T /* <: Tensor[Rank] */](b: js.Array[Double]): T = js.native
  /** Casts the array to type `bool` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toBool(): this.type = js.native
  /** Casts the array to type `float32` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toFloat[T /* <: this.type */](): T = js.native
  /** Casts the array to type `int32` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toInt(): this.type = js.native
  def toString(verbose: Boolean): String = js.native
  def topk[T /* <: Tensor[Rank] */](): AnonIndices[T] = js.native
  def topk[T /* <: Tensor[Rank] */](k: Double): AnonIndices[T] = js.native
  def topk[T /* <: Tensor[Rank] */](k: Double, sorted: Boolean): AnonIndices[T] = js.native
  def transpose[T /* <: Tensor[Rank] */](): T = js.native
  def transpose[T /* <: Tensor[Rank] */](perm: js.Array[Double]): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: TensorLike1D, numSegments: Double): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: Tensor1D, numSegments: Double): T = js.native
  def unstack(): js.Array[Tensor[Rank]] = js.native
  def unstack(axis: Double): js.Array[Tensor[Rank]] = js.native
  def variable(): Variable[R] = js.native
  def variable(trainable: Boolean): Variable[R] = js.native
  def variable(trainable: Boolean, name: String): Variable[R] = js.native
  def variable(trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
  def where(condition: TensorLike, x: TensorLike): Tensor[Rank] = js.native
  def where(condition: TensorLike, x: Tensor[Rank]): Tensor[Rank] = js.native
  def where(condition: Tensor[Rank], x: TensorLike): Tensor[Rank] = js.native
  def where(condition: Tensor[Rank], x: Tensor[Rank]): Tensor[Rank] = js.native
  def zerosLike[T /* <: Tensor[Rank] */](): T = js.native
}

