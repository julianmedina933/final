


import static ahorcado3.ahorcadoo.lista;
import static ahorcado3.ahorcadoo.lista2;
import static ahorcado3.ahorcadoo.tabla;
import static ahorcado3.ahorcadoo.txt1;
import static ahorcado3.ahorcadoo.txt2;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class botones 
{
     
    
    
    
    public static void ingresar()
    {
         
        String Palabra=txt1.getText();
        int longitud = Palabra.length();
        System.out.println("longitud palabra" + longitud);
        for(int i = 0 ; i < longitud ;i++)
        {
            System.out.println("caracter" + Palabra.charAt(i));
        }
        int cols = longitud;
        int rows = 2;
        tabla.setModel(new DefaultTableModel(rows, cols));
        
        for(int c = 0; c < cols; c++)
        {
            tabla.setValueAt("-", 0, c);
        }
        
    }
    
    public static void probar()
    {
       
        String Palabra2 = txt1.getText();
        
        int longitud2 = Palabra2.length();
        int contador = 0;
        char  Validar;
        char Letra;
        
       
           do
            {
                        
                String Validar2 = txt2.getText();
                 Validar = Validar2.charAt(0);
                 
                      
                            
                            for(int x = 0 ; x < longitud2 ;x++)
                
                                {
                                     Letra= Palabra2.charAt(x);
                                    
                                      if ( Letra == Validar)
                                        {
                                            
                                            
                                            
                                            tabla.setValueAt(""+Palabra2.charAt(x), 0, x);
                                              txt2.setText("");
                                                                                       
                                        }
                                       else
                                      {
                                          
                                          contador++;
                                          
                                      }
                                    
                                }
                            
                            
            }while( contador < 7);
            
           
           
           
           
           
           
    }   
    
    
   
}
            

