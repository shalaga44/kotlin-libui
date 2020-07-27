//[.](../../index.md)/[libui.ktx](../index.md)/[HBox](index.md)



# HBox  
 [linux, macosx, windows64, windows] 

Wrapper class for uiBox - a container that stack its children horizontally.

  
  
class [HBox](index.md) : [Box](../-box/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [HBox](-h-box.md)|  [linux, macosx, windows64, windows] fun [HBox](-h-box.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [add](../-box/add.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the given widget to the end of the Box.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun <T : [Control](../-control/index.md)<*>> [add](../-box/add.md)(widget: T): T  <br><br><br>
| [delete](../-box/delete.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Deletes the nth control of the Box.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [delete](../-box/delete.md)(index: Int)  <br><br><br>
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
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/HBox/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/HBox/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/HBox/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/HBox/enabled/#/PointingToDeclaration/): Boolean   <br>
| [padded](index.md#libui.ktx/HBox/padded/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>If true, the container insert some space between children.<br><br>override var [padded](index.md#libui.ktx/HBox/padded/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/HBox/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/HBox/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [stretchy](index.md#libui.ktx/HBox/stretchy/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Next added child should expand to use all available size.<br><br>override var [stretchy](index.md#libui.ktx/HBox/stretchy/#/PointingToDeclaration/): Boolean   <br>
| [toplevel](index.md#libui.ktx/HBox/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/HBox/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [visible](index.md#libui.ktx/HBox/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/HBox/visible/#/PointingToDeclaration/): Boolean   <br>


## Extensions  
  
|  Name|  Summary| 
|---|---|
| [separator](../separator.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a vertical line to visually separate widgets.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [HBox](index.md).[separator](../separator.md)(init: [VerticalSeparator](../-vertical-separator/index.md).() -> Unit): [VerticalSeparator](../-vertical-separator/index.md)  <br><br><br>

