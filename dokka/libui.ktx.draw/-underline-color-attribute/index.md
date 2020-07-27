//[.](../../index.md)/[libui.ktx.draw](../index.md)/[UnderlineColorAttribute](index.md)



# UnderlineColorAttribute  
 [linux, macosx, windows64, windows] 

Changes the color of the underline on the text it is applied to.

  
  
class [UnderlineColorAttribute](index.md) : [Attribute](../-attribute/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [UnderlineColorAttribute](-underline-color-attribute.md)|  [linux, windows64, windows] fun [UnderlineColorAttribute](-underline-color-attribute.md)(kind: UInt, color: [Color](../-color/index.md))   <br>
| [UnderlineColorAttribute](-underline-color-attribute.md)|  [macosx] fun [UnderlineColorAttribute](-underline-color-attribute.md)(kind: <ERROR CLASS>, color: [Color](../-color/index.md))   <br>


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
| [color](index.md#libui.ktx.draw/UnderlineColorAttribute/color/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the underline color stored.<br><br>val [color](index.md#libui.ktx.draw/UnderlineColorAttribute/color/#/PointingToDeclaration/): [Color](../-color/index.md)   <br>
| [disposed](index.md#libui.ktx.draw/UnderlineColorAttribute/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/UnderlineColorAttribute/disposed/#/PointingToDeclaration/): Boolean   <br>
| [kind](index.md#libui.ktx.draw/UnderlineColorAttribute/kind/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the underline color kind stored.<br><br>val [kind](index.md#libui.ktx.draw/UnderlineColorAttribute/kind/#/PointingToDeclaration/): UInt   <br>
| [type](index.md#libui.ktx.draw/UnderlineColorAttribute/type/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the type of Attribute.<br><br>override val [type](index.md#libui.ktx.draw/UnderlineColorAttribute/type/#/PointingToDeclaration/): UInt   <br>

