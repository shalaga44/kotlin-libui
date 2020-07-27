//[.](../../index.md)/[libui.ktx](../index.md)/[Table](index.md)



# Table  
 [linux, macosx, windows64, windows] 

Wrapper class for uiTableModel

  
  
class [Table](index.md)<[T](index.md)> : [Disposable](../-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Table](-table.md)|  [linux, windows64, windows] fun <[T](index.md)> [Table](-table.md)(data: List<[T](index.md)>, handler: CPointer<ktTableHandler>)   <br>
| [Table](-table.md)|  [macosx] fun <[T](index.md)> [Table](-table.md)(data: List<[T](index.md)>, handler: CPointer<<ERROR CLASS>>)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| [TableColumn](-table-column/index.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>inner class [TableColumn](-table-column/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [background](background.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [background](background.md)(get: (Int) -> [Color](../../libui.ktx.draw/-color/index.md)?)  <br><br><br>
| [column](column.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [column](column.md)(name: String, init: [Table.TableColumn](-table-column/index.md)<[T](index.md)>.() -> Unit)  <br><br><br>
| [dispose](../-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [rowChanged](row-changed.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [rowChanged](row-changed.md)(index: Int)  <br><br><br>
| [rowDeleted](row-deleted.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [rowDeleted](row-deleted.md)(oldIndex: Int)  <br><br><br>
| [rowInserted](row-inserted.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [rowInserted](row-inserted.md)(newIndex: Int)  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [data](index.md#libui.ktx/Table/data/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] val [data](index.md#libui.ktx/Table/data/#/PointingToDeclaration/): List<[T](index.md)>   <br>
| [disposed](index.md#libui.ktx/Table/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx/Table/disposed/#/PointingToDeclaration/): Boolean   <br>


## Extensions  
  
|  Name|  Summary| 
|---|---|
| [image](../../libui.ktx.draw/image.md)| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [Table](index.md)<*>.[image](../../libui.ktx.draw/image.md)(width: Int, height: Int, block: [Image](../../libui.ktx.draw/-image/index.md).() -> Unit): [Image](../../libui.ktx.draw/-image/index.md)  <br><br><br>

