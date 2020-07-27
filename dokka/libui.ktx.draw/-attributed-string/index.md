//[.](../../index.md)/[libui.ktx.draw](../index.md)/[AttributedString](index.md)



# AttributedString  
 [linux, macosx, windows64, windows] 

Represents a string of UTF-8 text that can be embellished with formatting attributes.

  
  
class [AttributedString](index.md)(**init**: String) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [AttributedString](-attributed-string.md)|  [linux, macosx, windows64, windows] fun [AttributedString](-attributed-string.md)(init: String)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [append](append.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the '\\0'-terminated UTF-8 string str to the end. The new substring will be unattributed.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [append](append.md)(str: String)  <br><br><br>
| [delete](delete.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Deletes the characters and attributes in the byte range \[start, end).<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [delete](delete.md)(start: Int, end: Int)  <br><br><br>
| [dispose](../../libui.ktx/-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../../libui.ktx/-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [insert](insert.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the '\\0'-terminated UTF-8 string str at the byte position specified by at. The new substring will be unattributed existing attributes will be moved along with their text.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [insert](insert.md)(str: String, at: Int)  <br><br><br>
| [setAttribute](set-attribute.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Sets a in the byte range \[start, end). Any existing attributes in that byte range of the same type are removed. Takes ownership of a you should not use it after setAttribute() returns.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [setAttribute](set-attribute.md)(a: [Attribute](../-attribute/index.md), start: Int, end: Int)  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx.draw/AttributedString/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/AttributedString/disposed/#/PointingToDeclaration/): Boolean   <br>
| [length](index.md#libui.ktx.draw/AttributedString/length/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the number of UTF-8 bytes in the textual content, excluding the terminating '\\0'.<br><br>val [length](index.md#libui.ktx.draw/AttributedString/length/#/PointingToDeclaration/): Int   <br>
| [string](index.md#libui.ktx.draw/AttributedString/string/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the textual content of AttributedString.<br><br>val [string](index.md#libui.ktx.draw/AttributedString/string/#/PointingToDeclaration/): String   <br>

