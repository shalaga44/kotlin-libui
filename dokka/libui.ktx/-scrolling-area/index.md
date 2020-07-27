//[.](../../index.md)/[libui.ktx](../index.md)/[ScrollingArea](index.md)



# ScrollingArea  
 [linux, macosx, windows64, windows] 

Wrapper class for uiArea - a canvas with horziontal and vertical scrollbars.

  
  
class [ScrollingArea](index.md) : [DrawArea](../-draw-area/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [ScrollingArea](-scrolling-area.md)|  [linux, windows64, windows] fun [ScrollingArea](-scrolling-area.md)(width: Int, height: Int, handler: CPointer<ktAreaHandler>, alloc: CPointer<<ERROR CLASS>>?)   <br>
| [ScrollingArea](-scrolling-area.md)|  [macosx] fun [ScrollingArea](-scrolling-area.md)(width: Int, height: Int, handler: CPointer<<ERROR CLASS>>, alloc: CPointer<<ERROR CLASS>>?)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [disable](../-control/disable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Disables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [disable](../-control/disable.md)()  <br><br><br>
| [dispose](../-control/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../-control/dispose.md)()  <br><br><br>
| [dragBroken](../-draw-area/drag-broken.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Funcion to be run to indicate that a drag should be ended. Only implemented on Windows. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [dragBroken](../-draw-area/drag-broken.md)(block: [DrawArea](../-draw-area/index.md).() -> Unit)  <br><br><br>
| [draw](../-draw-area/draw.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Funcion to be run when the area was created or got resized with AreaDrawParams as parameter. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>override fun [draw](../-draw-area/draw.md)(block: <ERROR CLASS>.(uiAreaDrawParams) -> Unit)  <br>[macosx]  <br>override fun [draw](../-draw-area/draw.md)(block: <ERROR CLASS>.(<ERROR CLASS>) -> Unit)  <br><br><br>
| [enable](../-control/enable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Enables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [enable](../-control/enable.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [getHandle](../-control/get-handle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Returns the OS-level handle associated with this Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [getHandle](../-control/get-handle.md)(): ULong  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [hide](../-control/hide.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [hide](../-control/hide.md)()  <br><br><br>
| [isEnabled](../-control/is-enabled.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabled](../-control/is-enabled.md)(): Boolean  <br><br><br>
| [isEnabledToUser](../-control/is-enabled-to-user.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control and all parents are enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabledToUser](../-control/is-enabled-to-user.md)(): Boolean  <br><br><br>
| [isVisible](../-control/is-visible.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is visible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isVisible](../-control/is-visible.md)(): Boolean  <br><br><br>
| [keyEvent](../-draw-area/key-event.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Funcion to be run when a key was pressed. Return true to indicate that the key event was handled. (a menu item with that accelerator won't activate, no error sound on macOS). Event is an uiAreaKeyEvent Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>override fun [keyEvent](../-draw-area/key-event.md)(block: [DrawArea](../-draw-area/index.md).(uiAreaKeyEvent) -> Boolean)  <br>[macosx]  <br>override fun [keyEvent](../-draw-area/key-event.md)(block: [DrawArea](../-draw-area/index.md).(<ERROR CLASS>) -> Boolean)  <br><br><br>
| [mouseCrossed](../-draw-area/mouse-crossed.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Funcion to be run when the mouse entered (left == false) or left the area. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [mouseCrossed](../-draw-area/mouse-crossed.md)(block: [DrawArea](../-draw-area/index.md).(Boolean) -> Unit)  <br><br><br>
| [mouseEvent](../-draw-area/mouse-event.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Funcion to be run when the mouse was moved or clicked over the area with AreaMouseEvent as parameter. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>override fun [mouseEvent](../-draw-area/mouse-event.md)(block: [DrawArea](../-draw-area/index.md).(uiAreaMouseEvent) -> Unit)  <br>[macosx]  <br>override fun [mouseEvent](../-draw-area/mouse-event.md)(block: [DrawArea](../-draw-area/index.md).(<ERROR CLASS>) -> Unit)  <br><br><br>
| [redraw](../-draw-area/redraw.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Queues the entire DrawArea for redraw. The DrawArea is not redrawn before this function returns; it is redrawn when next possible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [redraw](../-draw-area/redraw.md)()  <br><br><br>
| [scrollTo](scroll-to.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Scrolls the ScrollingArea to show the given rectangle.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [scrollTo](scroll-to.md)(x: Double, y: Double, width: Double, height: Double)  <br><br><br>
| [setSize](set-size.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Sets the size of a ScrollingArea to the given size, in points.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [setSize](set-size.md)(width: Int, height: Int)  <br><br><br>
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/ScrollingArea/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/ScrollingArea/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/ScrollingArea/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/ScrollingArea/enabled/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/ScrollingArea/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/ScrollingArea/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [toplevel](index.md#libui.ktx/ScrollingArea/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/ScrollingArea/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [visible](index.md#libui.ktx/ScrollingArea/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/ScrollingArea/visible/#/PointingToDeclaration/): Boolean   <br>

