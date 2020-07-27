//[.](../../index.md)/[libui.ktx.draw](../index.md)/[UnderlineAttribute](index.md)



# UnderlineAttribute  
 [linux, macosx, windows64, windows] 

Changes the type of underline on the text it is applied to.

  
  
class [UnderlineAttribute](index.md) : [Attribute](../-attribute/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [UnderlineAttribute](-underline-attribute.md)|  [linux, windows64, windows] fun [UnderlineAttribute](-underline-attribute.md)(u: UInt)   <br>
| [UnderlineAttribute](-underline-attribute.md)|  [macosx] fun [UnderlineAttribute](-underline-attribute.md)(u: <ERROR CLASS>)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../../libui.ktx/-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx.draw/UnderlineAttribute/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/UnderlineAttribute/disposed/#/PointingToDeclaration/): Boolean   <br>
| [type](index.md#libui.ktx.draw/UnderlineAttribute/type/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the type of Attribute.<br><br>override val [type](index.md#libui.ktx.draw/UnderlineAttribute/type/#/PointingToDeclaration/): UInt   <br>
| [value](index.md#libui.ktx.draw/UnderlineAttribute/value/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the underline type stored in [Attribute](../-attribute/index.md).<br><br>val [value](index.md#libui.ktx.draw/UnderlineAttribute/value/#/PointingToDeclaration/): UInt   <br>

