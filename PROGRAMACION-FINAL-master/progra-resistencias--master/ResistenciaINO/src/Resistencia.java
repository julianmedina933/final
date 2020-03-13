
import java.awt.Color;
import javax.swing.JOptionPane;
public class Resistencia extends javax.swing.JFrame {

    public Resistencia() {
        initComponents();
        setSize(700, 500);
        
        setLocationRelativeTo(this);
        List1.setVisible(false);
        List2.setVisible(false);
        List3.setVisible(false);

        multiplicativo.setVisible(false);
        tolerancia.setVisible(false);

        color1.setVisible(false);
        color2.setVisible(false);
        color3.setVisible(false);
        Calcular.setBackground(oro());
        unidad.setBackground(oro());

        multiplicadorb.setVisible(false);
        toleranciab.setVisible(false);
        total_resis(Integer.parseInt(bandas.getSelectedItem().toString()));

        List1.setBackground(oro());
        List2.setBackground(oro());
        List3.setBackground(oro());
        multiplicativo.setBackground(oro());
        tolerancia.setBackground(oro());

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.CYAN);
        p3.setBackground(Color.cyan);
        Cerrar.setBackground(Color.RED);
        bandas.setBackground(Color.green);
        Reset.setBackground(oro());

    }

    public Color cafe() {
        Color cafe = new Color(102, 51, 0);
        return cafe;
    }

    public Color violeta() {
        Color violeta = new Color(204, 0, 204);

        return violeta;
    }

    public Color oro() {
        Color oro = new Color(172, 150, 0);
        return oro;
    }

    public Color plata() {
        Color plata = new Color(153, 153, 153);
        return plata;
    }

    public Color reset_color() {
        Color reset = new Color(187, 187, 187);
        return reset;
    }

    public int Select1() {
        int opcion = List1.getSelectedIndex();
        switch (opcion) {
            case 0:
                color1.setBackground(reset_color());
                break;
            case 1:
                opcion = 0;
                color1.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 1;
                color1.setBackground(cafe());
                break;
            case 3:
                opcion = 2;
                color1.setBackground(Color.RED);
                break;
            case 4:
                opcion = 3;
                color1.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 4;
                color1.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 5;
                color1.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 6;
                color1.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = 7;
                color2.setBackground(violeta());
                break;
            case 9:
                opcion = 8;
                color1.setBackground(Color.GRAY);
                break;
            case 10:
                opcion = 9;
                color1.setBackground(Color.WHITE);
                break;
            default:

                break;
        }

        return opcion;
    }

    public int Select2() {
        int opcion = List2.getSelectedIndex();
        switch (opcion) {
            case 0:
                color2.setBackground(reset_color());
                break;
            case 1:
                opcion = 0;
                color2.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 1;
                color2.setBackground(cafe());
                break;
            case 3:
                opcion = 2;
                color2.setBackground(Color.RED);
                break;
            case 4:
                opcion = 3;
                color2.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 4;
                color2.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 5;
                color2.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 6;
                color2.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = 7;
                color2.setBackground(violeta());
                break;
            case 9:
                opcion = 8;
                color2.setBackground(Color.GRAY);
                break;
            case 10:
                opcion = 9;
                color2.setBackground(Color.WHITE);
                break;
            default:

                break;
        }

        return opcion;
    }

    public float calc() {
        
        
        float banda1 = 0;
        if ((Integer.parseInt(bandas.getSelectedItem().toString())) == 4) {
            banda1 = ((Select1() * 10) + Select2()) * Select4();
        } else {
            banda1 = ((Select1() * 100) + (Select2() * 10) + Select3()) * Select4();
        }

        if (tolerancia.getSelectedItem().toString() =="Ninguno") {
            tole.setText("+/- 20%");
            toleranciab.setVisible(false);
        }
        
        return banda1;
    }

    public int Select3() {
        int opcion = List3.getSelectedIndex();
        switch (opcion) {
            case 0:
                color3.setBackground(reset_color());
                break;
            case 1:
                opcion = 0;
                color3.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 1;
                color3.setBackground(cafe());
                break;
            case 3:
                opcion = 2;
                color3.setBackground(Color.RED);
                break;
            case 4:
                opcion = 3;
                color3.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 4;
                color3.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 5;
                color3.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 6;
                color3.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = 7;
                color3.setBackground(violeta());
                break;
            case 9:
                opcion = 8;
                color3.setBackground(Color.GRAY);
                break;
            case 10:
                opcion = 9;
                color3.setBackground(Color.WHITE);
                break;
            default:

                break;
        }

        return opcion;
    }

    public float Select4() {
        int o = multiplicativo.getSelectedIndex();
        float opcion = 0;

        switch (o) {
            case 0:
                multiplicadorb.setBackground(reset_color());
                break;
            case 1:
                opcion = 1;
                multiplicadorb.setBackground(Color.BLACK);
                break;
            case 2:
                opcion = 10;
                multiplicadorb.setBackground(cafe());
                break;
            case 3:
                opcion = 100;
                multiplicadorb.setBackground(Color.RED);
                break;
            case 4:
                opcion = 1000;
                multiplicadorb.setBackground(Color.ORANGE);
                break;
            case 5:
                opcion = 10000;
                multiplicadorb.setBackground(Color.YELLOW);
                break;
            case 6:
                opcion = 100000;
                multiplicadorb.setBackground(Color.GREEN);
                break;
            case 7:
                opcion = 1000000;
                multiplicadorb.setBackground(Color.BLUE);
                break;
            case 8:
                opcion = (float) 0.01;
                multiplicadorb.setBackground(plata());
                break;
            case 9:
                opcion = (float) 0.1;
                multiplicadorb.setBackground(oro());
                break;

            default:

                break;
        }

        return opcion;
    }

    public void Select5() {
        int opcion = tolerancia.getSelectedIndex();
        switch (opcion) {
            case 0:
                toleranciab.setBackground(reset_color());
                toleranciab.setVisible(false);
                tole.setText("+/- 20%");
                break;
            case 1:

                toleranciab.setBackground(cafe());
                toleranciab.setVisible(true);
                tole.setText("+/- 1%");
                break;
            case 2:

                toleranciab.setBackground(Color.RED);
                toleranciab.setVisible(true);
                tole.setText("+/- 2%");
                break;
            case 3:

                toleranciab.setBackground(Color.GREEN);
                toleranciab.setVisible(true);
                tole.setText("+/- 0.5%");
                break;
            case 4:

                toleranciab.setBackground(Color.BLUE);
                toleranciab.setVisible(true);
                tole.setText("+/- 0.25%");
                break;
            case 5:

                toleranciab.setBackground(violeta());
                toleranciab.setVisible(true);
                tole.setText("+/- 0.10%");
                break;
            case 6:

                toleranciab.setBackground(Color.GRAY);
                toleranciab.setVisible(true);
                tole.setText("+/- 0.05%");
                break;
            case 7:

                toleranciab.setBackground(oro());
                toleranciab.setVisible(true);
                tole.setText("+/- 5%");
                break;
            case 8:

                toleranciab.setBackground(plata());
                toleranciab.setVisible(true);
                tole.setText("+/- 10%");
                break;

            default:

                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p2 = new javax.swing.JPanel();
        Calcular = new javax.swing.JToggleButton();
        tole1 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        color2 = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        Resultado = new javax.swing.JLabel();
        unidad = new javax.swing.JComboBox();
        tole = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        List1 = new javax.swing.JComboBox();
        List2 = new javax.swing.JComboBox();
        List3 = new javax.swing.JComboBox();
        multiplicativo = new javax.swing.JComboBox();
        tolerancia = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        bandas = new javax.swing.JComboBox();
        toleranciab = new javax.swing.JButton();
        multiplicadorb = new javax.swing.JButton();
        color3 = new javax.swing.JButton();
        color1 = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        p2.setBorder(javax.swing.BorderFactory.createTitledBorder("De valores a colores"));
        p2.setLayout(null);

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        p2.add(Calcular);
        Calcular.setBounds(500, 20, 71, 23);
        p2.add(tole1);
        tole1.setBounds(150, 30, 60, 16);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset);
        Reset.setBounds(360, 180, 77, 23);
        getContentPane().add(color2);
        color2.setBounds(230, 300, 40, 140);

        p3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        p3.setLayout(null);
        p3.add(Resultado);
        Resultado.setBounds(10, 20, 110, 20);

        unidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ohm Ω", "KΩ", "MΩ", "GΩ", "MiliΩ", "MicroΩ", "NanoΩ" }));
        unidad.setToolTipText("");
        unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadActionPerformed(evt);
            }
        });
        p3.add(unidad);
        unidad.setBounds(180, 20, 80, 20);
        p3.add(tole);
        tole.setBounds(110, 20, 60, 16);

        getContentPane().add(p3);
        p3.setBounds(20, 150, 270, 50);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createTitledBorder("De colores a valores"));
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.setLayout(null);

        List1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        List1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List1ActionPerformed(evt);
            }
        });
        p1.add(List1);
        List1.setBounds(30, 20, 100, 20);

        List2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        List2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List2ActionPerformed(evt);
            }
        });
        p1.add(List2);
        List2.setBounds(150, 20, 100, 20);

        List3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        List3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List3ActionPerformed(evt);
            }
        });
        p1.add(List3);
        List3.setBounds(270, 20, 100, 20);

        multiplicativo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Plata", "Oro" }));
        multiplicativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicativoActionPerformed(evt);
            }
        });
        p1.add(multiplicativo);
        multiplicativo.setBounds(390, 20, 100, 20);

        tolerancia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Cafe", "Rojo", "Verde", "Azul", "Violeta", "Gris", "Oro", "Plata" }));
        tolerancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranciaActionPerformed(evt);
            }
        });
        p1.add(tolerancia);
        tolerancia.setBounds(510, 20, 100, 20);

        getContentPane().add(p1);
        p1.setBounds(20, 70, 640, 60);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Indique total de bandas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 40, 140, 14);

        bandas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "5" }));
        bandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandasActionPerformed(evt);
            }
        });
        getContentPane().add(bandas);
        bandas.setBounds(380, 40, 50, 20);
        getContentPane().add(toleranciab);
        toleranciab.setBounds(450, 300, 40, 140);
        getContentPane().add(multiplicadorb);
        multiplicadorb.setBounds(340, 300, 40, 140);
        getContentPane().add(color3);
        color3.setBounds(280, 300, 40, 140);
        getContentPane().add(color1);
        color1.setBounds(180, 300, 40, 140);

        Cerrar.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        Cerrar.setText("X");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        getContentPane().add(Cerrar);
        Cerrar.setBounds(630, 30, 45, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bajo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 230, 710, 280);

        jButton1.setText("Regresar Al Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 180, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void List1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List1ActionPerformed

        Resultado.setText("" + calc());

    }//GEN-LAST:event_List1ActionPerformed

    private void List2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List2ActionPerformed

        Resultado.setText("" + calc());
    }//GEN-LAST:event_List2ActionPerformed

    private void List3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List3ActionPerformed

        Resultado.setText("" + calc());
    }//GEN-LAST:event_List3ActionPerformed

    private void multiplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicativoActionPerformed

        Resultado.setText("" + calc());
    }//GEN-LAST:event_multiplicativoActionPerformed

    private void toleranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranciaActionPerformed

        Select5();

    }//GEN-LAST:event_toleranciaActionPerformed

    private void bandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandasActionPerformed
        int total = Integer.parseInt(bandas.getSelectedItem().toString());
        total_resis(total);
        if (total == 5) {
            p2.setEnabled(false);
           
            Calcular.setEnabled(false);
            
            
            tole1.setEnabled(false);
        } else {
            p2.setEnabled(true);
           
            Calcular.setEnabled(true);
            
           
            tole1.setEnabled(true);
        }
    }//GEN-LAST:event_bandasActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        List1.setSelectedItem("Ninguno");
        List2.setSelectedItem("Ninguno");
        List3.setSelectedItem("Ninguno");
        multiplicativo.setSelectedItem("Ninguno");
        tolerancia.setSelectedItem("Ninguno");
        unidad.setSelectedItem("Ohm Ω");
        tole1.setText("");

        tole.setText("");
        Resultado.setText("");
        color1.setBackground(reset_color());
        color2.setBackground(reset_color());
        color3.setBackground(reset_color());
        multiplicadorb.setBackground(reset_color());
        toleranciab.setBackground(reset_color());
    }//GEN-LAST:event_ResetActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed

    }//GEN-LAST:event_CalcularActionPerformed

    private void unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadActionPerformed
        Resultado.setText(convertidor() + "");
    }//GEN-LAST:event_unidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Menu men= new Menu();
        men.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    public void total_resis(int total) {
        if (total == 4) {
            List1.setVisible(true);
            multiplicativo.setVisible(true);
            tolerancia.setVisible(true);
            List3.setVisible(false);
            color3.setVisible(false);

            List2.setVisible(true);
            color1.setVisible(true);
            color2.setVisible(true);
            multiplicadorb.setVisible(true);
            toleranciab.setVisible(true);

            // tolerancia(total);
        }
        if (total == 5) {
            List1.setVisible(true);
            multiplicativo.setVisible(true);
            tolerancia.setVisible(true);
            List2.setVisible(true);
            List3.setVisible(true);
            color3.setVisible(true);

        }

    }

    public float convertidor() {
        int or = unidad.getSelectedIndex();
        float val = 0;
        switch (or) {
            case 0:
                val = calc();
                break;
            case 1:
                val = (float) (calc() * 0.001);
                break;
            case 2:
                val = (float) (calc() * 0.000001);
                break;
            case 3:
                val = (float) (calc() * 0.000000001);
                break;
            case 4:
                val = (float) (calc() * 1000);
                break;
            case 5:
                val = (float) (calc() * 1000000);
                break;
            case 6:
                val = (float) (calc() * 1000000000);
                break;
        }
        return val;
    }

    public void divide_ca(String cadena) {
        int r = (int) (Double.parseDouble(cadena)); //convierte a entero la cadena
        String copia = String.valueOf(r); //convierte String del entero convertido

        int resultado = 0;
        //String color3 = "negro";
        if (copia.length() == 1) {
            resultado = r;
            //here
            multiplicativo.setSelectedItem("Negro");
            multiplicadorb.setBackground(Color.BLACK);
          
        } else {
            if (copia.length() == 2) {
                resultado = r;
                multiplicadorb.setBackground(Color.BLACK);
                //here
                multiplicativo.setSelectedItem("Negro");
            } else if (copia.length() == 3) {
                resultado = r / 10;
                multiplicadorb.setBackground(cafe());
                multiplicativo.setSelectedItem("Cafe");

            } else if (copia.length() == 4) {
                resultado = r / 100;
                multiplicadorb.setBackground(Color.RED);
                multiplicativo.setSelectedItem("Rojo");
            } else if (copia.length() == 5) {
                resultado = r / 1000;
                multiplicadorb.setBackground(Color.ORANGE);
                multiplicativo.setSelectedItem("Naranja");
            } else if (copia.length() == 6) {
                resultado = r / 10000;
                multiplicadorb.setBackground(Color.YELLOW);
                multiplicativo.setSelectedItem("Amarillo");
            } else if (copia.length() == 7) {
                resultado = r / 100000;
                multiplicadorb.setBackground(Color.GREEN);
                multiplicativo.setSelectedItem("Verde");
            } else if (copia.length() == 8) {
                resultado = r / 100000;
                multiplicadorb.setBackground(Color.BLUE);
                multiplicativo.setSelectedItem("Azul");
            } else if (copia.length() == 9) {
                resultado = r / 10000000;
                multiplicadorb.setBackground(violeta());
                multiplicativo.setSelectedItem("Violeta");
            }
        }

        //System.out.println("resul: " + resultado);
        String copi = String.valueOf(resultado);
        int[] enteros = new int[copi.length()];

        String cad = "";

        for (int j = 0; j < copi.length(); j++) {
            cad = String.valueOf(copi.charAt(j));

            enteros[j] = Integer.parseInt(cad);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Resistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Calcular;
    private javax.swing.JButton Cerrar;
    private javax.swing.JComboBox List1;
    private javax.swing.JComboBox List2;
    private javax.swing.JComboBox List3;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Resultado;
    private javax.swing.JComboBox bandas;
    private javax.swing.JButton color1;
    private javax.swing.JButton color2;
    private javax.swing.JButton color3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton multiplicadorb;
    private javax.swing.JComboBox multiplicativo;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JLabel tole;
    private javax.swing.JLabel tole1;
    private javax.swing.JComboBox tolerancia;
    private javax.swing.JButton toleranciab;
    private javax.swing.JComboBox unidad;
    // End of variables declaration//GEN-END:variables
}
