//[.](../../index.md)/[libui.ktx.draw](../index.md)/[Path](index.md)



# Path  
 [linux, macosx, windows64, windows] 

Represent a path that could be drawed on a DrawContext

  
  
class [Path](index.md) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Path](-path.md)|  [linux, windows64, windows] fun [Path](-path.md)(mode: UInt)   <br>
| [Path](-path.md)|  [macosx] fun [Path](-path.md)(mode: <ERROR CLASS>)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [arcTo](arc-to.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds an arc to the path which is centered at (xCenter, yCenter) position with radius radius starting at startAngle and with sweep angle sweep going in the given direction by anticlockwise (defaulting to clockwise) as specified by negative.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [arcTo](arc-to.md)(xCenter: Double, yCenter: Double, radius: Double, startAngle: Double, sweep: Double, negative: Boolean)  <br><br><br>
| [bezierTo](bezier-to.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds a cubic Bézier curve to the path. It requires three points. The first two points are control points and the third one is the end point. The starting point is the last point in the current path.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [bezierTo](bezier-to.md)(c1x: Double, c1y: Double, c2x: Double, c2y: Double, endX: Double, endY: Double)  <br><br><br>
| [closeFigure](close-figure.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Causes the point of the pen to move back to the start of the current sub-path. It tries to draw a straight line from the current point to the start. If the shape has already been closed or has only one point, this function does nothing. It end the path.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [closeFigure](close-figure.md)()  <br><br><br>
| [dispose](../../libui.ktx/-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../../libui.ktx/-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [figure](figure.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Starts a new figure at the specified point. Call this method when you want to create a new path.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [figure](figure.md)(x: Double, y: Double)  <br><br><br>
| [figureWithArc](figure-with-arc.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Starts a new figure and adds an arc to the path which is centered at (xCenter, yCenter) position with radius radius starting at startAngle and with sweep angle sweep going in the given direction by anticlockwise (defaulting to clockwise) as specified by negative.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [figureWithArc](figure-with-arc.md)(xCenter: Double, yCenter: Double, radius: Double, startAngle: Double, sweep: Double, negative: Boolean)  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [lineTo](line-to.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Connects the last point in the subpath to the x, y coordinates with a straight line.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [lineTo](line-to.md)(x: Double, y: Double)  <br><br><br>
| [rectangle](rectangle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Creates a path for a rectangle at position (x, y) with a size that is determined by width and height.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [rectangle](rectangle.md)(x: Double, y: Double, width: Double, height: Double)  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx.draw/Path/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/Path/disposed/#/PointingToDeclaration/): Boolean   <br>

