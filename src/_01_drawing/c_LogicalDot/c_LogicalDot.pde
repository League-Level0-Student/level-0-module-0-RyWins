
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  
size(600,600);
}

void draw() {
  background(#08FF11);
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.


// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
   fill(#FF1F17);
   rect(300,250, 250,250);

   //  put one color here 
  
} else {
 
fill(#FFB108);
   // put a different color here
   ellipse(425,375, 250,250); 
}  

  
  
}
