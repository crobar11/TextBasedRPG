/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alecw
 */
import java.util.ArrayList;
import java.lang.Math;
public interface Encounter 
{

   public Encounter getLeftChild();
   public void setLeftChild(Encounter E);
   
   public Encounter getRightChild();
   public void setRightChild(Encounter E);
   
   public Encounter getParent();
   public void setParent(Encounter E);
   
   
           

   }