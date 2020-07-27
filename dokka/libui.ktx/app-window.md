//[.](../index.md)/[libui.ktx](index.md)/[appWindow](app-window.md)



# appWindow  
[linux, macosx, windows64, windows]  
Brief description  


Initializes package ui, runs init to set up the program, and executes the GUI main loop. init should set up the program's initial state: open the main window, create controls, and set up events.

  
  
  
Content  
[linux, macosx, windows64, windows]  
fun [appWindow](app-window.md)(title: String, width: Int, height: Int, margined: Boolean, init: [Window](-window/index.md).() -> Unit)  



