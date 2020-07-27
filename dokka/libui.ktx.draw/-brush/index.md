//[.](../../index.md)/[libui.ktx.draw](../index.md)/[Brush](index.md)



# Brush  
 [linux, windows64, windows] 

Defines the color(s) to draw a path with.

  
  
class [Brush](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<uiDrawBrush>    
 [macosx] 

Defines the color(s) to draw a path with.

  
  
class [Brush](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Brush](-brush.md)|  [linux, macosx, windows64, windows] fun [Brush](-brush.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../../libui.ktx/-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [linear](linear.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Helper to quickly create linear brush<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [linear](linear.md)(start: [Point](../-point/index.md), end: [Point](../-point/index.md), vararg stops: Array<Out Pair<Double, [Color](../-color/index.md)>>): [Brush](index.md)  <br><br><br>
| [radial](radial.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Helper to quickly create radial brush<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [radial](radial.md)(start: [Point](../-point/index.md), center: [Point](../-point/index.md), radius: Double, vararg stops: Array<Out Pair<Double, [Color](../-color/index.md)>>): [Brush](index.md)  <br><br><br>
| [solid](solid.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Helper to quickly set a brush color<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [solid](solid.md)(color: [Color](../-color/index.md), opacity: Double): [Brush](index.md)  <br>[linux, macosx, windows64, windows]  <br>fun [solid](solid.md)(rgb: Int, alpha: Double): [Brush](index.md)  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx.draw/Brush/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/Brush/disposed/#/PointingToDeclaration/): Boolean   <br>

