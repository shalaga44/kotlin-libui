//[.](../../index.md)/[libui.ktx](../index.md)/[Control](index.md)



# Control  
 [linux, macosx, windows64, windows] 

Base class for all GUI controls (widgets).

  
  
abstract class [Control](index.md)<[T](index.md) : CPointed>(**alloc**: CPointer<[T](index.md)>?) : [Disposable](../-disposable/index.md)<[T](index.md)>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Control](-control.md)|  [linux, macosx, windows64, windows] fun <[T](index.md) : CPointed> [Control](-control.md)(alloc: CPointer<[T](index.md)>?)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [disable](disable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Disables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [disable](disable.md)()  <br><br><br>
| [dispose](dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](dispose.md)()  <br><br><br>
| [enable](enable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Enables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [enable](enable.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [getHandle](get-handle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Returns the OS-level handle associated with this Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [getHandle](get-handle.md)(): ULong  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [hide](hide.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [hide](hide.md)()  <br><br><br>
| [isEnabled](is-enabled.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [isEnabled](is-enabled.md)(): Boolean  <br><br><br>
| [isEnabledToUser](is-enabled-to-user.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control and all parents are enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [isEnabledToUser](is-enabled-to-user.md)(): Boolean  <br><br><br>
| [isVisible](is-visible.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is visible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [isVisible](is-visible.md)(): Boolean  <br><br><br>
| [show](show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [show](show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/Control/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case [dispose](dispose.md) will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/Control/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/Control/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>var [enabled](index.md#libui.ktx/Control/enabled/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/Control/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>var [parent](index.md#libui.ktx/Control/parent/#/PointingToDeclaration/): [Control](index.md)<*>?   <br>
| [toplevel](index.md#libui.ktx/Control/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>val [toplevel](index.md#libui.ktx/Control/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [visible](index.md#libui.ktx/Control/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>var [visible](index.md#libui.ktx/Control/visible/#/PointingToDeclaration/): Boolean   <br>


## Inheritors  
  
|  Name| 
|---|
| [DrawArea](../-draw-area/index.md)
| [Group](../-group/index.md)
| [Box](../-box/index.md)
| [Form](../-form/index.md)
| [TabPane](../-tab-pane/index.md)
| [GridPane](../-grid-pane/index.md)
| [TableView](../-table-view/index.md)
| [TextField](../-text-field/index.md)
| [TextArea](../-text-area/index.md)
| [Checkbox](../-checkbox/index.md)
| [Combobox](../-combobox/index.md)
| [EditableCombobox](../-editable-combobox/index.md)
| [Spinbox](../-spinbox/index.md)
| [Slider](../-slider/index.md)
| [RadioButtons](../-radio-buttons/index.md)
| [DateTimePicker](../-date-time-picker/index.md)
| [Label](../-label/index.md)
| [Separator](../-separator/index.md)
| [ProgressBar](../-progress-bar/index.md)
| [Button](../-button/index.md)
| [ColorButton](../-color-button/index.md)
| [FontButton](../-font-button/index.md)
| [Window](../-window/index.md)

