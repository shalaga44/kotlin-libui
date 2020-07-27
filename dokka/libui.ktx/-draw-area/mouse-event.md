//[.](../../index.md)/[libui.ktx](../index.md)/[DrawArea](index.md)/[mouseEvent](mouse-event.md)



# mouseEvent  
[linux, windows64, windows, macosx]  
Brief description  


Funcion to be run when the mouse was moved or clicked over the area with AreaMouseEvent as parameter. Only one function can be registered at a time.

  
  
  
Content  
[linux, windows64, windows]  
fun [mouseEvent](mouse-event.md)(block: [DrawArea](index.md).(uiAreaMouseEvent) -> Unit)  
[macosx]  
fun [mouseEvent](mouse-event.md)(block: [DrawArea](index.md).(<ERROR CLASS>) -> Unit)  



