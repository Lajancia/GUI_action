

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Main extends JFrame{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Main(){
	
  KeyPanel p = new KeyPanel();
  setContentPane(p); // KeyPanel설정
  setTitle("Left");
  
  setSize(300,300); // size
  setVisible(true); // 표시여부
 

  for(int i=0;i<5;i++)
  p.requestFocus();
  
 
 }
 class KeyPanel extends JPanel {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String l="HELLO WORLD";
JLabel la = new JLabel(l); // 레이블 생성
 

public KeyPanel(){ // 패널 생성자
   add(la); // 레이블 추가
   this.addKeyListener(new KeyAdapter() {
	 
    public void keyPressed(KeyEvent e){ 
    	//String l="HELLO WORLD";
   
  
    
    	
    	int key = e.getKeyCode();
    
     if(key == KeyEvent.VK_KP_LEFT || key == KeyEvent.VK_LEFT){ 
    	char a=l.charAt(0);
    	l=l.substring(0, 0) + l.substring(0 + 1);
    	l=l+a;
    	
    
    	
    	 la.setText(l);
    	 
    	 
     }
    	
    
    }
	  
   });
   
  }
 }

 public static void main(String args[]){
	
	     
  new Main();
 
	 }
	 
 
}
