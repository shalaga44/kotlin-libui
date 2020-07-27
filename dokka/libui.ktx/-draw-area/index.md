//[.](../../index.md)/[libui.ktx](../index.md)/[DrawArea](index.md)



# DrawArea  
 [linux, macosx, windows64, windows] 

Wrapper class for uiArea - a canvas you can draw on.

  
  
open class [DrawArea](index.md) : [Control](../-control/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [DrawArea](-draw-area.md)|  [linux, windows64, windows] fun [DrawArea](-draw-area.md)(handler: CPointer<ktAreaHandler>, alloc: CPointer<<ERROR CLASS>>?)   <br>
| [DrawArea](-draw-area.md)|  [macosx] fun [DrawArea](-draw-area.md)(handler: CPointer<<ERROR CLASS>>, alloc: CPointer<<ERROR CLASS>>?)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [disable](../-control/disable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Disables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [disable](../-control/disable.md)()  <br><br><br>
| [dispose](../-control/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../-control/dispose.md)()  <br><br><br>
| [dragBroken](drag-broken.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Funcion to be run to indicate that a drag should be ended. Only implemented on Windows. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [dragBroken](drag-broken.md)(block: [DrawArea](index.md).() -> Unit)  <br><br><br>
| [draw](draw.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Funcion to be run when the area was created or got resized with AreaDrawParams as parameter. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [draw](draw.md)(block: <ERROR CLASS>.(uiAreaDrawParams) -> Unit)  <br>[macosx]  <br>fun [draw](draw.md)(block: <ERROR CLASS>.(<ERROR CLASS>) -> Unit)  <br><br><br>
| [enable](../-control/enable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Enables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [enable](../-control/enable.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [getHandle](../-control/get-handle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Returns the OS-level handle associated with this Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [getHandle](../-control/get-handle.md)(): ULong  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [hide](../-control/hide.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [hide](../-control/hide.md)()  <br><br><br>
| [isEnabled](../-control/is-enabled.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabled](../-control/is-enabled.md)(): Boolean  <br><br><br>
| [isEnabledToUser](../-control/is-enabled-to-user.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control and all parents are enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabledToUser](../-control/is-enabled-to-user.md)(): Boolean  <br><br><br>
| [isVisible](../-control/is-visible.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is visible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isVisible](../-control/is-visible.md)(): Boolean  <br><br><br>
| [keyEvent](key-event.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Funcion to be run when a key was pressed. Return true to indicate that the key event was handled. (a menu item with that accelerator won't activate, no error sound on macOS). Event is an uiAreaKeyEvent Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [keyEvent](key-event.md)(block: [DrawArea](index.md).(uiAreaKeyEvent) -> Boolean)  <br>[macosx]  <br>fun [keyEvent](key-event.md)(block: [DrawArea](index.md).(<ERROR CLASS>) -> Boolean)  <br><br><br>
| [mouseCrossed](mouse-crossed.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Funcion to be run when the mouse entered (left == false) or left the area. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [mouseCrossed](mouse-crossed.md)(block: [DrawArea](index.md).(Boolean) -> Unit)  <br><br><br>
| [mouseEvent](mouse-event.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Funcion to be run when the mouse was moved or clicked over the area with AreaMouseEvent as parameter. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [mouseEvent](mouse-event.md)(block: [DrawArea](index.md).(uiAreaMouseEvent) -> Unit)  <br>[macosx]  <br>fun [mouseEvent](mouse-event.md)(block: [DrawArea](index.md).(<ERROR CLASS>) -> Unit)  <br><br><br>
| [redraw](redraw.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Queues the entire DrawArea for redraw. The DrawArea is not redrawn before this function returns; it is redrawn when next possible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [redraw](redraw.md)()  <br><br><br>
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/DrawArea/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/DrawArea/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/DrawArea/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/DrawArea/enabled/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/DrawArea/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/DrawArea/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [toplevel](index.md#libui.ktx/DrawArea/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/DrawArea/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [visible](index.md#libui.ktx/DrawArea/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/DrawArea/visible/#/PointingToDeclaration/): Boolean   <br>


## Inheritors  
  
|  Name| 
|---|
| [ScrollingArea](../-scrolling-area/index.md)


## Extensions  
  
|  Name|  Summary| 
|---|---|
| [brush](../../libui.ktx.draw/brush.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Creates a new [Brush](../../libui.ktx.draw/-brush/index.md) with lifecycle delegated to [DrawArea](index.md).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [DrawArea](index.md).[brush](../../libui.ktx.draw/brush.md)(): [Brush](../../libui.ktx.draw/-brush/index.md)  <br><br><br>
| [font](../../libui.ktx.draw/font.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Creates a new [Font](../../libui.ktx.draw/-font/index.md) with lifecycle delegated to [DrawArea](index.md).<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [DrawArea](index.md).[font](../../libui.ktx.draw/font.md)(family: String?, size: Double, weight: UInt, italic: UInt, stretch: UInt): [Font](../../libui.ktx.draw/-font/index.md)  <br>[macosx]  <br>fun [DrawArea](index.md).[font](../../libui.ktx.draw/font.md)(family: String?, size: Double, weight: <ERROR CLASS>, italic: <ERROR CLASS>, stretch: <ERROR CLASS>): [Font](../../libui.ktx.draw/-font/index.md)  <br><br><br>
| [string](../../libui.ktx.draw/string.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Creates a new [AttributedString](../../libui.ktx.draw/-attributed-string/index.md) from initial String. The string will be entirely unattributed.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [DrawArea](index.md).[string](../../libui.ktx.draw/string.md)(init: String): [AttributedString](../../libui.ktx.draw/-attributed-string/index.md)  <br><br><br>
| [stroke](../../libui.ktx.draw/stroke.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Creates a new [Stroke](../../libui.ktx.draw/-stroke/index.md) with lifecycle delegated to [DrawArea](index.md).<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [DrawArea](index.md).[stroke](../../libui.ktx.draw/stroke.md)(block: uiDrawStrokeParams.() -> Unit): [Stroke](../../libui.ktx.draw/-stroke/index.md)  <br>[macosx]  <br>fun [DrawArea](index.md).[stroke](../../libui.ktx.draw/stroke.md)(block: <ERROR CLASS>.() -> Unit): [Stroke](../../libui.ktx.draw/-stroke/index.md)  <br><br><br>

