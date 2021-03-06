package typings.sxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class XML ()
    extends typings.sxml.moduleMod.XML {
    def this(str: String) = this()
    def this(xml: typings.sxml.xmlMod.XML) = this()
  }
  
  @js.native
  class XMLList ()
    extends typings.sxml.xmllistMod.XMLList
  
  /* static members */
  @js.native
  object XML extends js.Object {
    /**
      * @hidden
      */
    var _Compute_min_index: js.Any = js.native
    /**
      * @hidden
      */
    var _Repeat: js.Any = js.native
    @JSName("decode_property")
    def decodeProperty(str: String): String = js.native
    @JSName("decode_value")
    def decodeValue(str: String): String = js.native
    @JSName("encode_property")
    def encodeProperty(str: String): String = js.native
    @JSName("encode_value")
    def encodeValue(str: String): String = js.native
    def head(): String = js.native
    def head(encoding: String): String = js.native
  }
  
  @js.native
  object default extends js.Object {
    @js.native
    class XML ()
      extends typings.sxml.moduleMod.XML {
      def this(str: String) = this()
      def this(xml: typings.sxml.xmlMod.XML) = this()
    }
    
    @js.native
    class XMLList ()
      extends typings.sxml.xmllistMod.XMLList
    
    /* static members */
    @js.native
    object XML extends js.Object {
      /**
        * @hidden
        */
      var _Compute_min_index: js.Any = js.native
      /**
        * @hidden
        */
      var _Repeat: js.Any = js.native
      @JSName("decode_property")
      def decodeProperty(str: String): String = js.native
      @JSName("decode_value")
      def decodeValue(str: String): String = js.native
      @JSName("encode_property")
      def encodeProperty(str: String): String = js.native
      @JSName("encode_value")
      def encodeValue(str: String): String = js.native
      def head(): String = js.native
      def head(encoding: String): String = js.native
    }
    
  }
  
}

