//[.](../../index.md)/[libui.ktx](../index.md)/[Disposable](index.md)



# Disposable  
 [linux, macosx, windows64, windows] 



Base class for all objects that have a holder reference to the native C resource(s).

<ul><li>Allocates one resource during construction,     and may allocate some additional resources during operation.</li><li>Must free all its resource once [dispose](dispose.md) is invoked.</li><li>[disposed](index.md#libui.ktx/Disposable/disposed/#/PointingToDeclaration/) is a final state of the class, it is not supposed     to be used after being disposed.</li></ul>

  
  
abstract class [Disposable](index.md)<[T](index.md) : CPointed>(**alloc**: CPointer<[T](index.md)>?)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Disposable](-disposable.md)|  [linux, macosx, windows64, windows] fun <[T](index.md) : CPointed> [Disposable](-disposable.md)(alloc: CPointer<[T](index.md)>?)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [dispose](dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open fun [dispose](dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/Disposable/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case [dispose](dispose.md) will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>val [disposed](index.md#libui.ktx/Disposable/disposed/#/PointingToDeclaration/): Boolean   <br>


## Inheritors  
  
|  Name| 
|---|
| [Control](../-control/index.md)
| [Table](../-table/index.md)
| [Image](../../libui.ktx.draw/-image/index.md)
| [Brush](../../libui.ktx.draw/-brush/index.md)
| [Stroke](../../libui.ktx.draw/-stroke/index.md)
| [Path](../../libui.ktx.draw/-path/index.md)
| [Matrix](../../libui.ktx.draw/-matrix/index.md)
| [TextLayout](../../libui.ktx.draw/-text-layout/index.md)
| [Font](../../libui.ktx.draw/-font/index.md)
| [Attribute](../../libui.ktx.draw/-attribute/index.md)
| [OpenTypeFeatures](../../libui.ktx.draw/-open-type-features/index.md)
| [AttributedString](../../libui.ktx.draw/-attributed-string/index.md)

