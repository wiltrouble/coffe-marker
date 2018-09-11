package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package coffee;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicProgressBarUI;
import javax.swing.plaf.metal.MetalProgressBarUI;
import javax.swing.plaf.synth.SynthProgressBarUI;
import GUI.Check;
import javax.swing.JProgressBar;
import coffeeMaker.*;
import coffeeMaker.enums.*;
/**
 *
 * @author RodrigoMenacho
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    
    
    public Test() {
        initComponents();
        //jProgressBar1.setUI(new SynthProgressBarUI());
        jProgressBar2.setVisible(false);
        Jar.setVisible(true);
        jProgressBar1.setUI(new BasicProgressBarUI(){
                
            
            @Override
            protected void paintDeterminate(Graphics g, JComponent c) {
                super.paintDeterminate(g, c); //To change body of generated methods, choose Tools | Templates.        
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        Jar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Agregar agua");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 190, 99, 23);

        jProgressBar1.setBackground(new java.awt.Color(51, 153, 255));
        jProgressBar1.setForeground(new java.awt.Color(255, 102, 255));
        jProgressBar1.setMaximum(12);
        jProgressBar1.setOrientation(1);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(200, 230, 30, 90);

        jLabel1.setText("Tazas = 0");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 260, 48, 14);

        jButton2.setText("Poner Jarra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 150, 89, 23);

        jButton3.setText("Parar Llenado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 230, 99, 23);

        jButton4.setText("vaciar agua");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(50, 270, 89, 23);

        jProgressBar2.setBackground(new java.awt.Color(204, 255, 255));
        jProgressBar2.setForeground(new java.awt.Color(51, 0, 0));
        jProgressBar2.setMaximum(12);
        jProgressBar2.setOrientation(1);
        jProgressBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jProgressBar2.setOpaque(true);
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(450, 250, 40, 70);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COFFEE MAKER 3000");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 11, 251, 32);

        jButton5.setText("Brew");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(320, 150, 89, 49);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(360, 260, 44, 37);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setToolTipText("SB");

        jLabel4.setText("SB");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(250, 280, 32, 36);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setToolTipText("SB");

        jLabel3.setText("PR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(200, 110, 33, 37);

        jButton6.setText("Quitar Jarra");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(560, 190, 91, 23);

        javax.swing.GroupLayout JarLayout = new javax.swing.GroupLayout(Jar);
        Jar.setLayout(JarLayout);
        JarLayout.setHorizontalGroup(
            JarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        JarLayout.setVerticalGroup(
            JarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(Jar);
        Jar.setBounds(410, 210, 130, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\coffeeSmall2.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 20, 500, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //int cupsPot=0;
    Timer t;
    ActionListener ac;
    int CupsBoiler=0;
    Check check = new Check();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CupsBoiler++;
                jProgressBar1.setValue(CupsBoiler);
                jLabel1.setText("Tazas:"+CupsBoiler);
                check.checkSensor(CupsBoiler, jPanel4);
            }
        };
        t = new Timer(500,ac);
        t.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    boolean stateJar=false;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        stateJar = true;
        jProgressBar2.setVisible(true);
        Jar.setVisible(false);
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            t.stop();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CupsBoiler--;
                jProgressBar1.setValue(CupsBoiler);
                jLabel1.setText("Tazas:"+CupsBoiler);
                if(CupsBoiler==0){
                    t.stop();
                }
            }
        };
        t = new Timer(500,ac);
        t.start();
        check.checkSensor(CupsBoiler, jPanel2);
        
             
    }//GEN-LAST:event_jButton4ActionPerformed
    int cupsPot=0;
    boolean buttonState;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        t.stop();
        jPanel3.setBackground(Color.BLUE);
        buttonState = true;
        //usar el CoffeMaker.brew;
        CoffeeMaker coffeeMaker = new CoffeeMaker(buttonState,cupsPot);
        coffeeMaker.makeCoffee();
        ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cupsPot++;
                check.checkSensor(cupsPot-5, jPanel2);
                if(cupsPot>=5){
                    if(CupsBoiler>0){
                       CupsBoiler--;
                    }
                    
                    jProgressBar1.setValue(CupsBoiler);
                    jProgressBar2.setValue(cupsPot-4);
                }
                if(CupsBoiler==0){
                    t.stop();
                    check.checkSensor(CupsBoiler, jPanel4);
                }
            }
        };
        t = new Timer(500,ac);
        t.start();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        t.stop();
        jProgressBar2.setVisible(false);
        Jar.setVisible(true);
        cupsPot=0;
        check.checkSensor(cupsPot, jPanel2);
        jProgressBar2.setValue(cupsPot);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
