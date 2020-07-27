//[.](../../index.md)/[libui.ktx.draw](../index.md)/[Font](index.md)



# Font  
 [linux, windows64, windows] 

Provides a complete description of a font where one is needed.

  
  
open class [Font](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<uiFontDescriptor>    
 [macosx] 

Provides a complete description of a font where one is needed.

  
  
open class [Font](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Font](-font.md)|  [linux, windows64, windows] fun [Font](-font.md)(family: String?, size: Double, weight: UInt, italic: UInt, stretch: UInt)   <br>
| [Font](-font.md)|  [macosx] fun [Font](-font.md)(family: String?, size: Double, weight: <ERROR CLASS>, italic: <ERROR CLASS>, stretch: <ERROR CLASS>)   <br>


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
| [disposed](index.md#libui.ktx.draw/Font/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/Font/disposed/#/PointingToDeclaration/): Boolean   <br>

