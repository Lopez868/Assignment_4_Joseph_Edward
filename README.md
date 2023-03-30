<h1 align="center">Assignment4 </h1>
<h2 align="center">Points: 20</h2>

Before working on this or any assignment, you will need to set up the Android Studio IDE on your computer. You will create an Android project with the name **ASSIGNMENT4_YOURNAME_PARTNERNAME** by selecting **Kotlin** as the language. We suggest that you do this as early as possible, because some students may get stuck and need time to get the IDE set up. 

**Task Description:**

In this assignment, you'll practice whatever topics (Navigation, API, Firebase, RecyclerView) we covered in the class. You should develop an app that has the following: 
1. You will two bottom navigation menus (API and DISPLAY) in the MainActivity.
2. In the API tab(or menu), you may load fragments or activities. Here, you will have a button name API CALL. If you click that button, you will fetch the data from [https://jsonplaceholder.typicode.com/todos](https://jsonplaceholder.typicode.com/todos) and store it in the Firebase database.
3. In the DISPLAY tab ( or menu), you may load fragments or activities.  you will retrieve the data from the Firebase database and display it once you click the button named DISPLAY. You have to use RecycleView to display data. 
4. You should have FloatingActionButton (+) in DISPLAY tab. Open a another activity when the user taps the + button. In this activity, users can enter userid, id, title of todo. These information will add into Firebase and display the updated data in the RecyclerView list when you go to Display Menu.  
5. If you click each item of RecyclerView in display, it will lead you into another activities with detail. Here, you should have button (remove the item). If you click that button, item will be removed from Firebase database.



If you want help, please feel free to show your code to others or ask for help in our online discussion forum. Feel free to make an app as simple or as complex as you like, relative to your familiarity level and time constraints. If you work on your solution for a few hours and are still not done, you can turn it in, and we will award you credit. You can do it! 

**For submitting the project, you have to follow three steps:**

1. Create a folder name called **“Output”** inside the project folder. Make a small video showing your program functionality in the emulator and show your code as well. 1~2 minutes video is fine. 
2.  Please take screenshot of the code you have changed, design (XML and UI) and each output condition,  then make a pdf file like Class activities. You have to upload that pdf into your Canvas.
3.  Push your code, and pdf in this Github.
It does not need to be perfect or bug-free to receive credit. Your code will not be graded on style, but we still encourage you to follow a good overall coding style for your own sake. 

:exclamation:**```If you have any confusion, please raise this issue before the class or post it in Discord. I will try to clarify as much as possible.```**

<h5>Grading Rubrics:</h5>

```diff
Successfully implement the tabs or menus options - 3
Successfully get data from API endpoint - 3
Successfully store API data into Firebase database - 3 
Successfully add data from User into firebase - 3
Successfully remove item from Firebase database - 3 
Successfully retrieve the updated data from firebase and display into recyclerView - 3
Aesthetic of UI/UX - 2

```
