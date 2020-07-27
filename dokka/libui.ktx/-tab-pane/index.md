//[.](../../index.md)/[libui.ktx](../index.md)/[TabPane](index.md)



# TabPane  
 [linux, macosx, windows64, windows] 

Wrapper class for uiTab - a container that show each children in a separate tab.

  
  
class [TabPane](index.md) : [Control](../-control/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [TabPane](-tab-pane.md)|  [linux, macosx, windows64, windows] fun [TabPane](-tab-pane.md)()   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| [Page](-page/index.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>adapter for DSL builders<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inner class [Page](-page/index.md)(**label**: String) : [Container](../-container/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [add](add.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the given page to the end of the TabPane.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [add](add.md)(label: String, widget: [Control](../-control/index.md)<*>)  <br><br><br>
| [delete](delete.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Delete deletes the nth page of the TabPane.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [delete](delete.md)(page: Int)  <br><br><br>
| [disable](../-control/disable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Disables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [disable](../-control/disable.md)()  <br><br><br>
| [dispose](../-control/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../-control/dispose.md)()  <br><br><br>
| [enable](../-control/enable.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Enables the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [enable](../-control/enable.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [getHandle](../-control/get-handle.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Returns the OS-level handle associated with this Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [getHandle](../-control/get-handle.md)(): ULong  <br><br><br>
| [getMargined](get-margined.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether page n (starting at 0) of the Tab has margins around its child.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [getMargined](get-margined.md)(page: Int): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [hide](../-control/hide.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Hides the Control. Hidden controls do not participate in layout (that is, Box, GridPane, etc. does not reserve space for hidden controls).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [hide](../-control/hide.md)()  <br><br><br>
| [insert](insert.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the given page to the TabPane such that it is the nth page of the TabPane (starting at 0).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [insert](insert.md)(page: Int, name: String, widget: [Control](../-control/index.md)<*>)  <br><br><br>
| [isEnabled](../-control/is-enabled.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabled](../-control/is-enabled.md)(): Boolean  <br><br><br>
| [isEnabledToUser](../-control/is-enabled-to-user.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control and all parents are enabled.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isEnabledToUser](../-control/is-enabled-to-user.md)(): Boolean  <br><br><br>
| [isVisible](../-control/is-visible.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Whether the Control is visible.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [isVisible](../-control/is-visible.md)(): Boolean  <br><br><br>
| [setMargined](set-margined.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [setMargined](set-margined.md)(page: Int, margined: Boolean)  <br><br><br>
| [show](../-control/show.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Shows the Control.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>override fun [show](../-control/show.md)()  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx/TabPane/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/TabPane/disposed/#/PointingToDeclaration/): Boolean   <br>
| [enabled](index.md#libui.ktx/TabPane/enabled/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be enabled or disabled. Defaults to true.<br><br>override var [enabled](index.md#libui.ktx/TabPane/enabled/#/PointingToDeclaration/): Boolean   <br>
| [numPages](index.md#libui.ktx/TabPane/numPages/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Number of pages in the TabPane.<br><br>val [numPages](index.md#libui.ktx/TabPane/numPages/#/PointingToDeclaration/): Int   <br>
| [parent](index.md#libui.ktx/TabPane/parent/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns parent of the control or null for detached.<br><br>override var [parent](index.md#libui.ktx/TabPane/parent/#/PointingToDeclaration/): [Control](../-control/index.md)<*>?   <br>
| [toplevel](index.md#libui.ktx/TabPane/toplevel/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns whether the control is a top level one or not.<br><br>override val [toplevel](index.md#libui.ktx/TabPane/toplevel/#/PointingToDeclaration/): Boolean   <br>
| [visible](index.md#libui.ktx/TabPane/visible/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Whether the Control should be visible or hidden. Defaults to true.<br><br>override var [visible](index.md#libui.ktx/TabPane/visible/#/PointingToDeclaration/): Boolean   <br>


## Extensions  
  
|  Name|  Summary| 
|---|---|
| [page](../page.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inline fun [TabPane](index.md).[page](../page.md)(label: String, margined: Boolean, init: [TabPane.Page](-page/index.md).() -> Unit): [TabPane.Page](-page/index.md)  <br><br><br>

