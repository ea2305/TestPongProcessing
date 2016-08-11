import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Test extends PApplet {

//Tama\u00f1o de la pelota
int sizeBall = 20;

//Posicion de la pelota
int posX = (int) random(400);
int posY = (int) random(400);

//Posicion de la barra 
int barraX = 10;
int barraY = 450;

//Tama\u00f1o de la barra
int sizeBarX = 70;
int sizeBarY = 10;

//Movimiento de la pelota
int incrementoX = (int) random(4) + 1;
int incrementoY = (int) random(4) + 1;

int radio = (sizeBall / 2);

public void setup(){
  
  //Configuracion de tama\u00f1o de pantalla
  
  
}

public void draw(){

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
  public void settings() {  size( 500, 500 ); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
