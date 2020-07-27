//[.](../../index.md)/[libui.ktx](../index.md)/[EditableCombobox](index.md)



# EditableCombobox  
 [linux, macosx, windows64, windows] 

Wrapper class for uiEditableCombobox - a drop down combo box that allow selection from list or free text entry.

  
  
class [EditableCombobox](index.md) : [Control](../-control/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [EditableCombobox](-editable-combobox.md)|  [linux, macosx, windows64, windows] fun [EditableCombobox](-editable-combobox.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [action](action.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Function to be run when the user makes a change to the EditableCombobox. Only one function can be registered at a time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [action](action.md)(block: [EditableCombobox](index.md).() -> Unit)  <br><br><br>
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
| [item](item.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the named entry to the end of the editable combobox. If it is the first entry, it is automatically selected.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [item](item.md)(text: String)  <br><br><br>
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/EditableCombobox/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/EditableCombobox/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/EditableCombobox/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/EditableCombobox/enabled/#/PointingToDeclaration/): Boolean   <br>
| [parent](index.md#libui.ktx/EditableCombobox/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/EditableCombobox/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [toplevel](index.md#libui.ktx/EditableCombobox/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/EditableCombobox/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [value](index.md#libui.ktx/EditableCombobox/value/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Return or set the current selected text or the text value of the selected item in the list.<br><br>var [value](index.md#libui.ktx/EditableCombobox/value/#/PointingToDeclaration/): String   <br>
| [visible](index.md#libui.ktx/EditableCombobox/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/EditableCombobox/visible/#/PointingToDeclaration/): Boolean   <br>

