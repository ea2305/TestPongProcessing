//Tamaño de la pelota
int sizeBall = 20;

//Posicion de la pelota
int posX = (int) random(400);
int posY = (int) random(400);

//Posicion de la barra 
int barraX = 10;
int barraY = 450;

//Tamaño de la barra
int sizeBarX = 70;
int sizeBarY = 10;

//Movimiento de la pelota
int incrementoX = (int) random(4) + 1;
int incrementoY = (int) random(4) + 1;

int radio = (sizeBall / 2);

void setup(){
  
  //Configuracion de tamaño de pantalla
  size( 500, 500 );
  
}

void draw(){

  clear();
  
  //Posicion de mouse
  barraX = mouseX;
  
  //Dibujamos circulo.
  //( Pos_inicialX, Pos_inicialY, sizeBallX, sizeBallY)
  ellipse( posX, posY, sizeBall, sizeBall);
  rect( barraX , barraY , sizeBarX , sizeBarY );
  
  //Cambio de movimiento
  if( posX + radio >= 500 || posX <= radio){
    incrementoX *= -1;
  }
  
/**/
  if( posY + radio >= 500 || posY <= radio){
    if( posY + radio >= 500 ){
      background( 200, 50, 0);
      textSize(50);
      text("Gracias por jugar !", 20 ,50);
      stop();
    }
    incrementoY *= -1;
  }

  if( (posX + radio) >= barraX && (posX + radio) <= (barraX + sizeBarX) && (posY + radio) >= barraY ){
    incrementoY *= -1;
  }
  
  //Realizamos incremento
  //posX = posX + 1;
  posX += incrementoX;
  posY += incrementoY;

}