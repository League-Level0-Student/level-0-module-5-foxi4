void setup(){
  size(1000,450);
}
void draw(){
  int size=400;
  for(int i=0;i<80;i++){
    int ellipse=i;
    if(ellipse % 2==0){
  noFill();
    }
    
    else{
      noFill();
    }
  ellipse(250,225,size,size);
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
  ellipse(750,225,size,size);
  size-=10;
    
  }
}

  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
