//[.](../../index.md)/[libui.ktx](../index.md)/[DateTimePicker](index.md)



# DateTimePicker  
 [linux, macosx, windows64, windows] 

Wrapper class for uiDateTimePicker - a widget to edit date and time.

  
  
open class [DateTimePicker](index.md) : [Control](../-control/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [DateTimePicker](-date-time-picker.md)|  [linux, macosx, windows64, windows] fun [DateTimePicker](-date-time-picker.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [action](action.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Function to be run when the user makes a change to the Picker. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [action](action.md)(block: [DateTimePicker](index.md).() -> Unit)  <br><br><br>
| [disable](../-control/disable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Disables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [disable](../-control/disable.md)()  <br><br><br>
| [dispose](../-control/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../-control/dispose.md)()  <br><br><br>
| [enable](../-control/enable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Enables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [enable](../-control/enable.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [getHandle](../-control/get-handle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Returns the OS-level handle associated with this Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [getHandle](../-control/get-handle.md)(): ULong  <br><br><br>
| [getValue](get-value.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>The current value as posix struct tm<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [getValue](get-value.md)(value: CPointer<tm>)  <br>[macosx]  <br>fun [getValue](get-value.md)(value: CPointer<<ERROR CLASS>>): <ERROR CLASS>  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [hide](../-control/hide.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [hide](../-control/hide.md)()  <br><br><br>
| [isEnabled](../-control/is-enabled.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabled](../-control/is-enabled.md)(): Boolean  <br><br><br>
| [isEnabledToUser](../-control/is-enabled-to-user.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control and all parents are enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabledToUser](../-control/is-enabled-to-user.md)(): Boolean  <br><br><br>
| [isVisible](../-control/is-visible.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is visible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isVisible](../-control/is-visible.md)(): Boolean  <br><br><br>
| [setValue](set-value.md)| [linux, windows64, windows, macosx]  <br>Brief description  <br><br><br>Set current value from posix struct tm<br><br>  <br>Content  <br>[linux, windows64, windows]  <br>fun [setValue](set-value.md)(value: CPointer<tm>)  <br>[macosx]  <br>fun [setValue](set-value.md)(value: CPointer<<ERROR CLASS>>): <ERROR CLASS>  <br><br><br>
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| [textValue](text-value.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>The current value as String.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [textValue](text-value.md)(format: String): String  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/DateTimePicker/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/DateTimePicker/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/DateTimePicker/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/DateTimePicker/enabled/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/DateTimePicker/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/DateTimePicker/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [toplevel](index.md#libui.ktx/DateTimePicker/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/DateTimePicker/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [value](index.md#libui.ktx/DateTimePicker/value/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>The current value in Unix epoch<br><br>var [value](index.md#libui.ktx/DateTimePicker/value/#/PointingToDeclaration/): Long   <br>
| [visible](index.md#libui.ktx/DateTimePicker/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/DateTimePicker/visible/#/PointingToDeclaration/): Boolean   <br>


## Inheritors  
  
|  Name| 
|---|
| [DatePicker](../-date-picker/index.md)
| [TimePicker](../-time-picker/index.md)

