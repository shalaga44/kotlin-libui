//[.](../../index.md)/[libui.ktx](../index.md)/[GridPane](index.md)



# GridPane  
 [linux, macosx, windows64, windows] 

Wrapper class for uiGrid - a powerful container that allow to specify size and position of each children.

  
  
class [GridPane](index.md) : [Control](../-control/index.md)<<ERROR CLASS>> , [Container](../-container/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [GridPane](-grid-pane.md)|  [linux, macosx, windows64, windows] fun [GridPane](-grid-pane.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [add](add.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the given widget to the end of the form.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun <[T](add.md) : [Control](../-control/index.md)<*>> [add](add.md)(widget: [T](add.md)): [T](add.md)  <br><br><br>
| [disable](../-control/disable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Disables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [disable](../-control/disable.md)()  <br><br><br>
| [dispose](../-control/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../-control/dispose.md)()  <br><br><br>
| [enable](../-control/enable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Enables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [enable](../-control/enable.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [getHandle](../-control/get-handle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Returns the OS-level handle associated with this Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [getHandle](../-control/get-handle.md)(): ULong  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [hide](../-control/hide.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [hide](../-control/hide.md)()  <br><br><br>
| [insert](insert.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Insert the given Control after existing Control.<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [insert](insert.md)(widget: [Control](../-control/index.md)<*>, existing: [Control](../-control/index.md)<*>, at: UInt)  <br>[macosx]  <br>fun [insert](insert.md)(widget: [Control](../-control/index.md)<*>, existing: [Control](../-control/index.md)<*>, at: <ERROR CLASS>)  <br><br><br>
| [isEnabled](../-control/is-enabled.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabled](../-control/is-enabled.md)(): Boolean  <br><br><br>
| [isEnabledToUser](../-control/is-enabled-to-user.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control and all parents are enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabledToUser](../-control/is-enabled-to-user.md)(): Boolean  <br><br><br>
| [isVisible](../-control/is-visible.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is visible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isVisible](../-control/is-visible.md)(): Boolean  <br><br><br>
| [row](row.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [row](row.md)()  <br><br><br>
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/GridPane/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/GridPane/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/GridPane/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/GridPane/enabled/#/PointingToDeclaration/): Boolean   <br>
| [halign](index.md#libui.ktx/GridPane/halign/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The horizontal alignment of Control.<br><br>var [halign](index.md#libui.ktx/GridPane/halign/#/PointingToDeclaration/): UInt   <br>
| [hexpand](index.md#libui.ktx/GridPane/hexpand/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The horizontal expand of Control.<br><br>var [hexpand](index.md#libui.ktx/GridPane/hexpand/#/PointingToDeclaration/): Boolean   <br>
| [padded](index.md#libui.ktx/GridPane/padded/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>If true, the container insert some space between children.<br><br>var [padded](index.md#libui.ktx/GridPane/padded/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/GridPane/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/GridPane/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [toplevel](index.md#libui.ktx/GridPane/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/GridPane/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [valign](index.md#libui.ktx/GridPane/valign/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The vertical alignment of Control.<br><br>var [valign](index.md#libui.ktx/GridPane/valign/#/PointingToDeclaration/): UInt   <br>
| [vexpand](index.md#libui.ktx/GridPane/vexpand/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The vertical expand of Control.<br><br>var [vexpand](index.md#libui.ktx/GridPane/vexpand/#/PointingToDeclaration/): Boolean   <br>
| [visible](index.md#libui.ktx/GridPane/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/GridPane/visible/#/PointingToDeclaration/): Boolean   <br>
| [x](index.md#libui.ktx/GridPane/x/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The x-coordinate of the Control's location.<br><br>var [x](index.md#libui.ktx/GridPane/x/#/PointingToDeclaration/): Int   <br>
| [xspan](index.md#libui.ktx/GridPane/xspan/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The width of the Control.<br><br>var [xspan](index.md#libui.ktx/GridPane/xspan/#/PointingToDeclaration/): Int   <br>
| [y](index.md#libui.ktx/GridPane/y/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The y-coordinate of the Control's location.<br><br>var [y](index.md#libui.ktx/GridPane/y/#/PointingToDeclaration/): Int   <br>
| [yspan](index.md#libui.ktx/GridPane/yspan/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The height of the Control.<br><br>var [yspan](index.md#libui.ktx/GridPane/yspan/#/PointingToDeclaration/): Int   <br>

