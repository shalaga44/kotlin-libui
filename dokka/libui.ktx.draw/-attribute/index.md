//[.](../../index.md)/[libui.ktx.draw](../index.md)/[Attribute](index.md)



# Attribute  
 [linux, macosx, windows64, windows] 

Stores information about an attribute in a [AttributedString](../-attributed-string/index.md).

  
  
abstract class [Attribute](index.md)(**alloc**: CPointer<<ERROR CLASS>>?) : [Disposable](../../libui.ktx/-disposable/index.md)<<ERROR CLASS>>    


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [Attribute](-attribute.md)|  [linux, macosx, windows64, windows] fun [Attribute](-attribute.md)(alloc: CPointer<<ERROR CLASS>>?)   <br>


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
| [disposed](index.md#libui.ktx.draw/Attribute/disposed/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns true if object was disposed - in this case dispose will do nothing, all other operations are invalid and will throw Error("Resource is disposed").<br><br>override val [disposed](index.md#libui.ktx.draw/Attribute/disposed/#/PointingToDeclaration/): Boolean   <br>
| [type](index.md#libui.ktx.draw/Attribute/type/#/PointingToDeclaration/)|  [linux, macosx, windows64, windows] <br><br>Returns the type of Attribute.<br><br>val [type](index.md#libui.ktx.draw/Attribute/type/#/PointingToDeclaration/): UInt   <br>


## Inheritors  
  
|  Name| 
|---|
| [FamilyAttribute](../-family-attribute/index.md)
| [SizeAttribute](../-size-attribute/index.md)
| [WeightAttribute](../-weight-attribute/index.md)
| [ItalicAttribute](../-italic-attribute/index.md)
| [StretchAttribute](../-stretch-attribute/index.md)
| [ColorAttribute](../-color-attribute/index.md)
| [BackgroundAttribute](../-background-attribute/index.md)
| [UnderlineAttribute](../-underline-attribute/index.md)
| [UnderlineColorAttribute](../-underline-color-attribute/index.md)
| [FeaturesAttribute](../-features-attribute/index.md)

