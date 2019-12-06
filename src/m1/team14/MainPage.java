package m1.team14;

import m1.team14.view.*;
import m1.team14.model.*;
import m1.team14.controller.*;

public class MainPage {
  public static void main(String args[]){
    SecondHalfController sfController = new SecondHalfController();
    SecondHalfModel sfModel = new SecondHalfModel();
    SecondHalfViewPanel sfView =new SecondHalfViewPanel(sfController);
    sfController.addModel(sfModel);
    sfController.addView(sfView);
  }
}