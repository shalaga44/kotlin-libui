//[.](../../index.md)/[libui.ktx](../index.md)/[SearchField](index.md)



# SearchField  
 [linux, macosx, windows64, windows] 

Wrapper class for uiEntry - a text entry widget to search text.

  
  
class [SearchField](index.md) : [TextField](../-text-field/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [SearchField](-search-field.md)|  [linux, macosx, windows64, windows] fun [SearchField](-search-field.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [action](../-text-field/action.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Function to be run when the user makes a change to the TextField. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [action](../-text-field/action.md)(block: [TextField](../-text-field/index.md).() -> Unit)  <br><br><br>
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
| [disposed](index.md#libui.ktx/SearchField/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/SearchField/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/SearchField/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/SearchField/enabled/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/SearchField/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/SearchField/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [readonly](index.md#libui.ktx/SearchField/readonly/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the text is read-only or not. Defaults to false.<br><br>override var [readonly](index.md#libui.ktx/SearchField/readonly/#/PointingToDeclaration/): Boolean   <br>
| [toplevel](index.md#libui.ktx/SearchField/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/SearchField/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [value](index.md#libui.ktx/SearchField/value/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The current text of the TextField.<br><br>override var [value](index.md#libui.ktx/SearchField/value/#/PointingToDeclaration/): String   <br>
| [visible](index.md#libui.ktx/SearchField/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/SearchField/visible/#/PointingToDeclaration/): Boolean   <br>

