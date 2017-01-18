import processing.sound.*;
SoundFile noise;

int x = 374;
int y = 143;
int acceleration = 0;
void setup() {
  size(740, 490);
  PImage catPic = loadImage("tabby.jpeg");
  catPic.resize(740, 490);  // to match your size
  background(catPic);
  noise  = new SoundFile(this,"pewpew.wav");
}


void draw() {
  noStroke();
  fill(255,0,0);
  ellipse(x, y, 15,15);
  ellipse(x+48, y+2, 15,15);
  
}
void keyPressed() {
    
    y+=acceleration/2.5;
    x+=acceleration;
    
    acceleration++;
    if (acceleration == 1) {
      noise.play();
    }  
    if (x > 740) {
      PImage catPic = loadImage("tabby.jpeg");
      catPic.resize(width, height);  // to match your size
      background(catPic);
      
      x = 374;
      y = 143;
      acceleration = 0;
    }
  }