//[.](../../index.md)/[libui.ktx.draw](../index.md)/[TextLayout](index.md)



# TextLayout  
 [linux, macosx, windows64, windows] 

Representation of a [AttributedString](../-attributed-string/index.md) that can be displayed in a DrawContext.

  
  
class [TextLayout](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [TextLayout](-text-layout.md)|  [linux, windows64, windows] fun [TextLayout](-text-layout.md)(string: [AttributedString](../-attributed-string/index.md), defaultFont: [Font](../-font/index.md), width: Double, align: UInt)   <br>
| [TextLayout](-text-layout.md)|  [macosx] fun [TextLayout](-text-layout.md)(string: [AttributedString](../-attributed-string/index.md), defaultFont: [Font](../-font/index.md), width: Double, align: <ERROR CLASS>)   <br>


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
| [disposed](index.md#libui.ktx.draw/TextLayout/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/TextLayout/disposed/#/PointingToDeclaration/): Boolean   <br>
| [size](index.md#libui.ktx.draw/TextLayout/size/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the size of TextLayout.<br><br>val [size](index.md#libui.ktx.draw/TextLayout/size/#/PointingToDeclaration/): [Size](../-size/index.md)   <br>

