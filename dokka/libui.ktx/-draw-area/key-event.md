//[.](../../index.md)/[libui.ktx](../index.md)/[DrawArea](index.md)/[keyEvent](key-event.md)



# keyEvent  
[linux, windows64, windows, macosx]  
Brief description  


Funcion to be run when a key was pressed. Return true to indicate that the key event was handled. (a menu item with that accelerator won't activate, no error sound on macOS). Event is an uiAreaKeyEvent Only one function can be registered at a time.

  
  
  
Content  
[linux, windows64, windows]  
fun [keyEvent](key-event.md)(block: [DrawArea](index.md).(uiAreaKeyEvent) -> Boolean)  
[macosx]  
fun [keyEvent](key-event.md)(block: [DrawArea](index.md).(<ERROR CLASS>) -> Boolean)  



