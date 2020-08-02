
int circle1=250;
int circle2=750;
int speed=5;
void setup(){
  size(1000,450);
  
}
void draw(){
  background(#FFFFFF);
  int size=400;
  for(int i=0;i<80;i++){
    int ellipse=i;
    if(ellipse % 2==0){
  noFill();
    }
    
    else{
      noFill();
    }
  ellipse(circle1,225,size,size);
  size-=10;
    
  }
   size=400;
  for(int i=0;i<80;i++){
    int ellipse=i;
    if(ellipse % 2==0){
  noFill();
    }
    
    else{
      noFill();
    }
  ellipse(circle2,225,size,size);
  size-=10;
    
  }
  circle1+=speed;
  circle2-=speed;
  if(circle1==0||circle1==1000){
    speed=-speed;
  }
}

  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
