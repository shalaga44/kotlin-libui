//[.](../../index.md)/[libui.ktx.draw](../index.md)/[AttributedString](index.md)/[setAttribute](set-attribute.md)



# setAttribute  
[linux, macosx, windows64, windows]  
Brief description  


Sets a in the byte range \[start, end). Any existing attributes in that byte range of the same type are removed. Takes ownership of a you should not use it after setAttribute() returns.

  
  
  
Content  
[linux, macosx, windows64, windows]  
fun [setAttribute](set-attribute.md)(a: [Attribute](../-attribute/index.md), start: Int, end: Int)  



