# Brute_Forcer_for_Word_Cookies_iOS

LuaPermutations.java - The starting point of execution

PixelPoints.java - A class that stores x and y coordinates of my iPhones custom resolution

---
My earliest non-class related project. 

For some context, this is not intended for public use, and should not be considered a complete package. It is hardcoded to brute force Word Cookies for iOS, finding every possible letter combination, as well as inputting it. This is the final version before I stopped playing Word Cookies, and only works on my iPhone's custom resolution, and on 6-letter puzzles. The logic is coded in Java, and outputs unrolled Lua code when ran. The output was copied onto my iPhone as a .lua script to be ran on AutoTouch, a tweak for jailbroken iPhones. An example of the output can be seen below.

getColor() is used to check if the puzzle has been completed. An optional function, restartApp(), can be utilized to force close and re-open the app to start the next puzzle automatically. The number parameters for each touch command are specific pixels on the iPhone screen corresponding to letters on the puzzle board.
```
if getColor(800,925) ~= 13864514 then return end
touchDown(0, 530, 1220);
usleep(60000);
touchMove(0, 235, 1005);
usleep(60000);
touchMove(0, 415, 910);
usleep(60000);
touchMove(0, 590, 1005);
usleep(60000);
touchMove(0, 415, 1310);
usleep(60000);
touchMove(0, 235, 1220);
usleep(60000);
touchUp(0, 235, 1220);
usleep(75000);
```
