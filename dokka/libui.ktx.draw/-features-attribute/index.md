//[.](../../index.md)/[libui.ktx.draw](../index.md)/[FeaturesAttribute](index.md)



# FeaturesAttribute  
 [linux, macosx, windows64, windows] 

Creates a new Attribute that changes the font family of the text it is applied to. otf is copied you may free it.

  
  
class [FeaturesAttribute](index.md)(**otf**: [OpenTypeFeatures](../-open-type-features/index.md)) : [Attribute](../-attribute/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [FeaturesAttribute](-features-attribute.md)|  [linux, macosx, windows64, windows] fun [FeaturesAttribute](-features-attribute.md)(otf: [OpenTypeFeatures](../-open-type-features/index.md))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md)| [linux, macosx, windows64, windows]  <br>Brief description  <br><br><br>Dispose and free all allocated native resources.<br><br>  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun [dispose](../../libui.ktx/-disposable/dispose.md)()  <br><br><br>
| equals| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open operator override fun equals(other: Any?): Boolean  <br><br><br>
| hashCode| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun hashCode(): Int  <br><br><br>
| toString| [linux, macosx, windows64, windows]  <br>Content  <br>[linux, macosx, windows64, windows]  <br>open override fun toString(): String  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [disposed](index.md#libui.ktx.draw/FeaturesAttribute/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/FeaturesAttribute/disposed/#/PointingToDeclaration/): Boolean   <br>
| [type](index.md#libui.ktx.draw/FeaturesAttribute/type/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the type of Attribute.<br><br>override val [type](index.md#libui.ktx.draw/FeaturesAttribute/type/#/PointingToDeclaration/): UInt   <br>
| [value](index.md#libui.ktx.draw/FeaturesAttribute/value/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the OpenType features stored.<br><br>val [value](index.md#libui.ktx.draw/FeaturesAttribute/value/#/PointingToDeclaration/): [OpenTypeFeatures](../-open-type-features/index.md)   <br>

