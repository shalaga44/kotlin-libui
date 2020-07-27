//[.](../../index.md)/[libui.ktx.draw](../index.md)/[Matrix](index.md)



# Matrix  
 [linux, windows64, windows] 

Defines a transformation (e.g. rotation, translation)

  
  
class [Matrix](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<uiDrawMatrix>    
 [macosx] 

Defines a transformation (e.g. rotation, translation)

  
  
class [Matrix](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Matrix](-matrix.md)|  [linux, macosx, windows64, windows] fun [Matrix](-matrix.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../../libui.ktx/-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [invert](invert.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Inverts the matrix.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [invert](invert.md)(): Int  <br><br><br>
| [multiply](multiply.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Sets the matrix to the product of itself with other matrix.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [multiply](multiply.md)(other: [Matrix](index.md))  <br><br><br>
| [rotate](rotate.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Rotates paths by amount**radians** around (x, y).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [rotate](rotate.md)(x: Double, y: Double, amount: Double)  <br><br><br>
| [scale](scale.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Scales pathes by a factor of x and y with (xCenter, yCenter) as the scale center.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [scale](scale.md)(xCenter: Double, yCenter: Double, x: Double, y: Double)  <br><br><br>
| [skew](skew.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Skews path by xamount**radians** horizontally and by yamount**radians** vertically around (x, y)<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [skew](skew.md)(x: Double, y: Double, xamount: Double, yamount: Double)  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>
| [translate](translate.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Moves paths over by x to the right and y down.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [translate](translate.md)(x: Double, y: Double)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx.draw/Matrix/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/Matrix/disposed/#/PointingToDeclaration/): Boolean   <br>
| [invertible](index.md#libui.ktx.draw/Matrix/invertible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if the matrix is invertible.<br><br>val [invertible](index.md#libui.ktx.draw/Matrix/invertible/#/PointingToDeclaration/): Boolean   <br>
| [point](index.md#libui.ktx.draw/Matrix/point/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the transformed point.<br><br>val [point](index.md#libui.ktx.draw/Matrix/point/#/PointingToDeclaration/): [Point](../-point/index.md)   <br>
| [size](index.md#libui.ktx.draw/Matrix/size/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the transformed size.<br><br>val [size](index.md#libui.ktx.draw/Matrix/size/#/PointingToDeclaration/): [Size](../-size/index.md)   <br>

