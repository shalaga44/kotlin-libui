//[.](../../index.md)/[libui.ktx.draw](../index.md)/[OpenTypeFeatures](index.md)



# OpenTypeFeatures  
 [linux, macosx, windows64, windows] 

Represents a set of OpenType feature tag-value pairs, for applying OpenType features to text.

  
  
class [OpenTypeFeatures](index.md)(**copy**: CPointer<<ERROR CLASS>>?) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [OpenTypeFeatures](-open-type-features.md)|  [linux, macosx, windows64, windows] fun [OpenTypeFeatures](-open-type-features.md)(copy: CPointer<<ERROR CLASS>>?)   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [add](add.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Adds the given feature tag and value to OpenTypeFeatures. If there is already a value associated with the specified tag in otf, the old value is removed.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [add](add.md)(tag: String, value: UInt)  <br><br><br>
| [copy](copy.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Makes a copy of otf and returns it. Changing one will not affect the other.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [copy](copy.md)(): [OpenTypeFeatures](index.md)  <br><br><br>
| [dispose](../../libui.ktx/-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../../libui.ktx/-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| [get](get.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Determines whether the given feature tag is present in OpenTypeFeatures.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [get](get.md)(tag: String): UInt  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| [remove](remove.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Removes the given feature tag and value from OpenTypeFeatures. If the tag is not present in OpenTypeFeatures, it does nothing.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>fun [remove](remove.md)(tag: String)  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx.draw/OpenTypeFeatures/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/OpenTypeFeatures/disposed/#/PointingToDeclaration/): Boolean   <br>

