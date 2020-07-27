//[.](../index.md)/[libui.ktx.draw](index.md)/[stroke](stroke.md)



# stroke  
[linux, windows64, windows, macosx]  
Brief description  


Draw a path in the context.

  
  
  
Content  
[linux, windows64, windows]  
fun <ERROR CLASS>.[stroke](stroke.md)(mode: UInt, brush: [Brush](-brush/index.md), stroke: [Stroke](-stroke/index.md), block: [Path](-path/index.md).() -> Unit)  
[linux, macosx, windows64, windows]  
fun <ERROR CLASS>.[stroke](stroke.md)(brush: [Brush](-brush/index.md), stroke: [Stroke](-stroke/index.md), block: [Path](-path/index.md).() -> Unit): <ERROR CLASS>  
[macosx]  
fun <ERROR CLASS>.[stroke](stroke.md)(mode: <ERROR CLASS>, brush: [Brush](-brush/index.md), stroke: [Stroke](-stroke/index.md), block: [Path](-path/index.md).() -> Unit)  


[linux, windows64, windows, macosx]  
Brief description  


Creates a new [Stroke](-stroke/index.md) with lifecycle delegated to [DrawArea](../libui.ktx/-draw-area/index.md).

  
  
  
Content  
[linux, windows64, windows]  
fun [DrawArea](../libui.ktx/-draw-area/index.md).[stroke](stroke.md)(block: uiDrawStrokeParams.() -> Unit): [Stroke](-stroke/index.md)  
[macosx]  
fun [DrawArea](../libui.ktx/-draw-area/index.md).[stroke](stroke.md)(block: <ERROR CLASS>.() -> Unit): [Stroke](-stroke/index.md)  



