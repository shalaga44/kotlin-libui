//[.](../../index.md)/[libui.ktx.draw](../index.md)/[StretchAttribute](index.md)



# StretchAttribute  
 [linux, macosx, windows64, windows] 

Changes the stretch of the text it is applied to.

  
  
class [StretchAttribute](index.md) : [Attribute](../-attribute/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [StretchAttribute](-stretch-attribute.md)|  [linux, windows64, windows] fun [StretchAttribute](-stretch-attribute.md)(stretch: UInt)   <br>
| [StretchAttribute](-stretch-attribute.md)|  [macosx] fun [StretchAttribute](-stretch-attribute.md)(stretch: <ERROR CLASS>)   <br>


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
| [disposed](index.md#libui.ktx.draw/StretchAttribute/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/StretchAttribute/disposed/#/PointingToDeclaration/): Boolean   <br>
| [type](index.md#libui.ktx.draw/StretchAttribute/type/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the type of Attribute.<br><br>override val [type](index.md#libui.ktx.draw/StretchAttribute/type/#/PointingToDeclaration/): UInt   <br>
| [value](index.md#libui.ktx.draw/StretchAttribute/value/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the font stretch stored in [Attribute](../-attribute/index.md).<br><br>val [value](index.md#libui.ktx.draw/StretchAttribute/value/#/PointingToDeclaration/): UInt   <br>

