//[.](../../index.md)/[libui.ktx](../index.md)/[Window](index.md)



# Window  
 [linux, macosx, windows64, windows] 

Represents a top-level window. Contains one child control that occupies the entirety of the window.

  
  
class [Window](index.md)(**title**: String,**width**: Int,**height**: Int,**hasMenubar**: Boolean) : [Control](../-control/index.md)<<ERROR CLASS>> , [Container](../-container/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Window](-window.md)|  [linux, macosx, windows64, windows] fun [Window](-window.md)(title: String, width: Int, height: Int, hasMenubar: Boolean)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [add](add.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Specify the control to show in content area. Window can contain only one control, if you need more use layouts like Box or GridPane<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun <[T](add.md) : [Control](../-control/index.md)<*>> [add](add.md)(widget: [T](add.md)): [T](add.md)  <br><br><br>
| [disable](../-control/disable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Disables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [disable](../-control/disable.md)()  <br><br><br>
| [dispose](../-control/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../-control/dispose.md)()  <br><br><br>
| [enable](../-control/enable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Enables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [enable](../-control/enable.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [getHandle](../-control/get-handle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Returns the OS-level handle associated with this Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [getHandle](../-control/get-handle.md)(): ULong  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [hide](../-control/hide.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [hide](../-control/hide.md)()  <br><br><br>
| [isEnabled](../-control/is-enabled.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabled](../-control/is-enabled.md)(): Boolean  <br><br><br>
| [isEnabledToUser](../-control/is-enabled-to-user.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control and all parents are enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabledToUser](../-control/is-enabled-to-user.md)(): Boolean  <br><br><br>
| [isVisible](../-control/is-visible.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is visible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isVisible](../-control/is-visible.md)(): Boolean  <br><br><br>
| [onClose](on-close.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Function to be run when the user clicks the Window's close button. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [onClose](on-close.md)(block: [Window](index.md).() -> Boolean)  <br><br><br>
| [onResize](on-resize.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Function to be run when window content size change.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [onResize](on-resize.md)(block: [Window](index.md).() -> Unit)  <br><br><br>
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [borderless](index.md#libui.ktx/Window/borderless/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Allow to specify that the window is a frameless one, without borders, title bar and OS window control widgets.<br><br>var [borderless](index.md#libui.ktx/Window/borderless/#/PointingToDeclaration/): Boolean   <br>
| [contentSize](index.md#libui.ktx/Window/contentSize/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Size in pixel of the content area of the window. Window decoration size are excluded. This mean that if you set window size to 0,0 you still see title bar and OS window buttons.<br><br>var [contentSize](index.md#libui.ktx/Window/contentSize/#/PointingToDeclaration/): [SizeInt](../../libui.ktx.draw/-size-int/index.md)   <br>
| [disposed](index.md#libui.ktx/Window/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/Window/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/Window/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/Window/enabled/#/PointingToDeclaration/): Boolean   <br>
| [fullscreen](index.md#libui.ktx/Window/fullscreen/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the window should show in fullscreen or not.<br><br>var [fullscreen](index.md#libui.ktx/Window/fullscreen/#/PointingToDeclaration/): Boolean   <br>
| [margined](index.md#libui.ktx/Window/margined/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Specify if the Window content should have a margin or not.<br><br>var [margined](index.md#libui.ktx/Window/margined/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/Window/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/Window/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [title](index.md#libui.ktx/Window/title/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Set or return the text to show in window title bar.<br><br>var [title](index.md#libui.ktx/Window/title/#/PointingToDeclaration/): String   <br>
| [toplevel](index.md#libui.ktx/Window/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/Window/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [visible](index.md#libui.ktx/Window/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/Window/visible/#/PointingToDeclaration/): Boolean   <br>

