# *Java Perfect Skip List*

## Description
**_Perfect Skip List Data Structure Created using Java_** <br/>
The perfect skip list is a simple data structure that can help reduce the amount of time taken to locate a particular data item in a list of items. The data structure is useful in locating an item in large lists of information that would otherwise take a substantial amount of computational time with simple search algorithms. When a search algorithm is applied to the perfect skip list, the program first compares a value, such as an integer value, to the top part of the data structure. Depending on the value, the program either moves to a lower level of the skip list or continues traversing across it. A way to think about a perfect skip list is a simple linked list with integers/values stored in it at the very bottom level. From the bottom level, node references build up in such a way that there are more spread out node references on the levels above the lowest level. A `picture of a perfect skip list` is included below this description to help visualize the data structure. To learn more about perfect skip lists, click the link under the "Resources for Project" section. The perfect skip list included in this repository was created as a project for my Software Design III (CS 340) class at the University of Wisconsin - La Crosse. I created my perfect skip list using the Java programming language as well as an Integrated Development Environment (IDE) called Eclipse. In order to view this project, I would recommend installing the Eclipse IDE as well as Java if you do not already have these tools on your computer. If you wish simply to view the code, a simple text editor can be used.

###### Picture of a Perfect Skip List Data Structure
![perfect-skip-list](https://user-images.githubusercontent.com/57727121/131785704-5cfc9f4b-832d-4571-83d4-1a132be23876.jpg)
<p>&nbsp;</p>

**Resources for Project:**
- Java
- Eclipse (IDE)
- Information on Perfect Skip Lists in Java: https://www.javatpoint.com/skip-list-in-data-structure

# Running / Viewing the Project
## Eclipse (IDE)
1. First, make sure that you have the Eclipse IDE to run the program. If you need to download Eclipse, the link is provided below. <br/>
   -Eclipse (IDE) Download: https://www.eclipse.org/downloads/
2. Next, make sure that you have Java installed in your system. Go to your settings/system preferences and search for Java in your system. If you do not already have Java installed, follow the link below. The link will bring you to a website for downloading Java. The website will give you the option to download Java for Mac or Windows. <br/>
   -Java Download: https://java.com/en/download/help/download_options.html
3. On this repository page, go to the "Code" button and click the "Download Zip" option.
4. Go to your "Downloads" section on your computer and place the zip file in a folder/location other than "Downloads".
5. Double click on the zip file to open or "unzip" it so you can access the file contents.
6. Open up Eclipse, and type "Perfect-Skip-List" as the name of the workspace. Then click the "launch" button.
7. If any settings options appear, click the "Hide" option located in the upper righthand corner of the screen.
8. You should now see a workspace. You will probably NOT see any files. To get the actual file content into the workspace, click on the "Import projects" option.
9. Click the "General" dropdown arrow option. Then double click "Projects from Folder or Archive". This should open a separate Eclipse window.
10. In the separate Eclipse window, select the "Directory..." button. This should open your file system window. In the file system window, navigate to the location where the "Pefect-Skip-List-master" folder is stored. 
11. Select the "Pefect-Skip-List-master" folder. Click "Open". This will add the path the the directory in the separate Eclipse window you have opened. 
12. Then in the separate Eclipse window, click "Finish".
13. Open the project folder that should now be in your workspace by double clicking it. Then open the "(default package)" folder by double clicking it.
14. Next, open the "PerfectSkipList.java" file by clicking it. Hit the green run icon, which is a green circle with a white triangle inside of it. The program should run, and you should see output in the console within Eclipse. The output should consist of five tests, which were used to ensure that the perfect skip list structure was functioning properly.

## Command Line
1. First, make sure that you have your terminal open. Information about your terminal can be found here:<br/>
   -Mac: https://support.apple.com/guide/terminal/open-or-quit-terminal-apd5265185d-f365-44cb-8b09-71a064a42125/mac<br/>
   -Windows: https://docs.microsoft.com/en-us/windows/terminal/
2. Next, make sure that you have Java installed in your system. Go to your settings/system preferences (do this on your computer and not in your terminal) and search for Java in your system. If you do not already have Java installed, follow the link below. You will be brought to a website for downloading Java. The website will give you the option to download Java for Mac or Windows. <br/>
   -Java Download: https://java.com/en/download/help/download_options.html
3. On this repository page, go to the "Code" button and click the "Download Zip" option.
4. Go to your "Downloads" section on your computer and place the zip file in a folder/location other than "Downloads".
5. Double click on the zip file to open or "unzip" it so you can access the file contents.
6. In your opened terminal, navigate to the location where you opened the downloaded zip file and make sure you are inside of the "Pefect-Skip-List-master" folder. (If you are unsure of command line commands, see the resources provided bellow.)<br/>
   -Linux and Max: http://mally.stanford.edu/~sr/computing/basic-unix.html<br/>
   -Windows: https://blogs.umass.edu/Techbytes/2014/11/14/file-navigation-with-windows-command-prompt/
7. Inside the "Pefect-Skip-List-master" folder on your terminal, type the following command: `javac PerfectSkipList.java`. It is important that you include the "c" at the end of "java" (no spaces).
8. After typing the command above, type this command: `java PerfectSkipList.java`. Do NOT include a "c" at the end of "java" in this command.
9. After running the command in the previous step, output should be printed out on your terminal window. The output on your terminal window should consist of five tests, which were used to ensure that the perfect skip list structure was functioning properly.

<p>&nbsp;</p>

**_@Author: Andrew Krause_** <br/>
*LinkedIn:* https://www.linkedin.com/in/andrew-krause-b6aa21179/ <br/>
*Instagram:* https://www.instagram.com/aek.krause/ <br/>
*Facebook:* https://www.facebook.com/andrew.krause.35325

