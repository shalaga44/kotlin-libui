//[.](../../index.md)/[libui.ktx](../index.md)/[Container](index.md)



# Container  
 [linux, macosx, windows64, windows] 

Container for child controls.

  
  
interface [Container](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [add](add.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>abstract fun <[T](add.md) : [Control](../-control/index.md)<*>> [add](add.md)(widget: [T](add.md)): [T](add.md)  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| [Group](../-group/index.md)
| [Box](../-box/index.md)
| [Form](../-form/index.md)
| [TabPane](../-tab-pane/-page/index.md)
| [GridPane](../-grid-pane/index.md)
| [Window](../-window/index.md)


## Extensions  
  
|  Name|  Summary| 
|---|---|
| [button](../button.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a simple button.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[button](../button.md)(text: String, init: [Button](../-button/index.md).() -> Unit): [Button](../-button/index.md)  <br><br><br>
| [checkbox](../checkbox.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a checkbox widget.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[checkbox](../checkbox.md)(label: String, init: [Checkbox](../-checkbox/index.md).() -> Unit): [Checkbox](../-checkbox/index.md)  <br><br><br>
| [colorbutton](../colorbutton.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a button that opens a color palette popup.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[colorbutton](../colorbutton.md)(init: [ColorButton](../-color-button/index.md).() -> Unit): [ColorButton](../-color-button/index.md)  <br><br><br>
| [combobox](../combobox.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a drop down combo box that allow list selection only.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[combobox](../combobox.md)(init: [Combobox](../-combobox/index.md).() -> Unit): [Combobox](../-combobox/index.md)  <br><br><br>
| [datepicker](../datepicker.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a widget to edit date.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[datepicker](../datepicker.md)(init: [DatePicker](../-date-picker/index.md).() -> Unit): [DatePicker](../-date-picker/index.md)  <br><br><br>
| [datetimepicker](../datetimepicker.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a widget to edit date and time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[datetimepicker](../datetimepicker.md)(init: [DateTimePicker](../-date-time-picker/index.md).() -> Unit): [DateTimePicker](../-date-time-picker/index.md)  <br><br><br>
| [drawarea](../drawarea.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a canvas you can draw on. It also receives keyboard and mouse events, is DPI aware, and has several other useful features.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [Container](index.md).[drawarea](../drawarea.md)(init: [DrawArea](../-draw-area/index.md).() -> Unit): [DrawArea](../-draw-area/index.md)  <br><br><br>
| [editablecombobox](../editablecombobox.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a drop down combo box that allow selection from list or free text entry.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[editablecombobox](../editablecombobox.md)(init: [EditableCombobox](../-editable-combobox/index.md).() -> Unit): [EditableCombobox](../-editable-combobox/index.md)  <br><br><br>
| [fontbutton](../fontbutton.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a button that allows users to choose a font when they click on it.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[fontbutton](../fontbutton.md)(init: [FontButton](../-font-button/index.md).() -> Unit): [FontButton](../-font-button/index.md)  <br><br><br>
| [form](../form.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a container that organize children as labeled fields.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[form](../form.md)(padded: Boolean, init: [Form](../-form/index.md).() -> Unit): [Form](../-form/index.md)  <br><br><br>
| [gridpane](../gridpane.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a powerful container that allow to specify size and position of each children.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[gridpane](../gridpane.md)(padded: Boolean, init: [GridPane](../-grid-pane/index.md).() -> Unit): [GridPane](../-grid-pane/index.md)  <br><br><br>
| [group](../group.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a container for a single widget that provide a caption and visually group it's children.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [Container](index.md).[group](../group.md)(title: String, margined: Boolean, init: [Group](../-group/index.md).() -> Unit): [Group](../-group/index.md)  <br><br><br>
| [hbox](../index.md#libui.ktx//hbox/libui.ktx.Container#/PointingToDeclaration/)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a container that stack its children horizontally.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>val [Container](index.md).[hbox](../index.md#libui.ktx//hbox/libui.ktx.Container#/PointingToDeclaration/): [HBox](../-h-box/index.md)  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[hbox](../hbox.md)(padded: Boolean, init: [HBox](../-h-box/index.md).() -> Unit): [HBox](../-h-box/index.md)  <br><br><br>
| [label](../label.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a static text label.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[label](../label.md)(text: String, init: [Label](../-label/index.md).() -> Unit): [Label](../-label/index.md)  <br><br><br>
| [passwordfield](../passwordfield.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a text entry widget that mask the input, useful to edit passwords or other sensible data.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[passwordfield](../passwordfield.md)(readonly: Boolean, init: [PasswordField](../-password-field/index.md).() -> Unit): [PasswordField](../-password-field/index.md)  <br><br><br>
| [progressbar](../progressbar.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a progress bar widget.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[progressbar](../progressbar.md)(init: [ProgressBar](../-progress-bar/index.md).() -> Unit): [ProgressBar](../-progress-bar/index.md)  <br><br><br>
| [radiobuttons](../radiobuttons.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a widget that represent a group of radio options.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[radiobuttons](../radiobuttons.md)(init: [RadioButtons](../-radio-buttons/index.md).() -> Unit): [RadioButtons](../-radio-buttons/index.md)  <br><br><br>
| [scrollingarea](../scrollingarea.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a canvas with horziontal and vertical scrollbars.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [Container](index.md).[scrollingarea](../scrollingarea.md)(width: Int, height: Int, init: [ScrollingArea](../-scrolling-area/index.md).() -> Unit): [ScrollingArea](../-scrolling-area/index.md)  <br><br><br>
| [searchfield](../searchfield.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a text entry widget to search text.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[searchfield](../searchfield.md)(readonly: Boolean, init: [SearchField](../-search-field/index.md).() -> Unit): [SearchField](../-search-field/index.md)  <br><br><br>
| [slider](../slider.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for an horizontal slide to set numerical values.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[slider](../slider.md)(min: Int, max: Int, init: [Slider](../-slider/index.md).() -> Unit): [Slider](../-slider/index.md)  <br><br><br>
| [spinbox](../spinbox.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for an entry widget for numerical values.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[spinbox](../spinbox.md)(min: Int, max: Int, init: [Spinbox](../-spinbox/index.md).() -> Unit): [Spinbox](../-spinbox/index.md)  <br><br><br>
| [tableview](../tableview.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder to visualize data in a tabular form.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun <[T](../tableview.md)> [Container](index.md).[tableview](../tableview.md)(data: List<[T](../tableview.md)>, init: [Table](../-table/index.md)<[T](../tableview.md)>.() -> Unit): [TableView](../-table-view/index.md)  <br><br><br>
| [tabpane](../tabpane.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a container that show each children in a separate tab.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[tabpane](../tabpane.md)(init: [TabPane](../-tab-pane/index.md).() -> Unit): [TabPane](../-tab-pane/index.md)  <br><br><br>
| [textarea](../textarea.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a multiline plain text editing widget.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[textarea](../textarea.md)(wrap: Boolean, init: [TextArea](../-text-area/index.md).() -> Unit): [TextArea](../-text-area/index.md)  <br><br><br>
| [textfield](../textfield.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a simple single line text entry widget.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[textfield](../textfield.md)(readonly: Boolean, init: [TextField](../-text-field/index.md).() -> Unit): [TextField](../-text-field/index.md)  <br><br><br>
| [timepicker](../timepicker.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a widget to edit time.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[timepicker](../timepicker.md)(init: [TimePicker](../-time-picker/index.md).() -> Unit): [TimePicker](../-time-picker/index.md)  <br><br><br>
| [vbox](../index.md#libui.ktx//vbox/libui.ktx.Container#/PointingToDeclaration/)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>DSL builder for a container that stack its children vertically.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>val [Container](index.md).[vbox](../index.md#libui.ktx//vbox/libui.ktx.Container#/PointingToDeclaration/): [VBox](../-v-box/index.md)  <br>[linux, macosx, windows64, windows]  <br>inline fun [Container](index.md).[vbox](../vbox.md)(padded: Boolean, init: [VBox](../-v-box/index.md).() -> Unit): [VBox](../-v-box/index.md)  <br><br><br>

